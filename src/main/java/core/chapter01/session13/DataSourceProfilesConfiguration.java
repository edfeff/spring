package core.chapter01.session13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jndi.JndiTemplate;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * @author wpp
 */
@Configuration
public class DataSourceProfilesConfiguration {
    /**
     * test使用
     *
     * @return
     */
    @Bean
    @Profile("dev")
    public DataSource dataSourceInMem() {
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.HSQL)
                .addScript("core/chapter01/session13/my-schema.sql")
                .addScript("core/chapter01/session13/my-test-data.sql")
                .build();
    }

    /**
     * prod 使用
     *
     * @return
     * @throws NamingException
     */
    @Bean
    @Profile("prod")
    public DataSource dataSourceJndi() throws NamingException {
        Context context = new InitialContext();
        return (DataSource) context.lookup("java:comp/env/jdbc/datasource");
    }

    @Autowired(required = false)
    JndiTemplate jndiTemplate;

    @Bean
    @Profile("qa")
    public DataSource dataSourceJndiTemplate() throws NamingException {
        return jndiTemplate.lookup("java:comp/env/jdbc/datasource", DataSource.class);
    }
}
