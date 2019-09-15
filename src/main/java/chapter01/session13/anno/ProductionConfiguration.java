package chapter01.session13.anno;

import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import javax.sql.DataSource;

/**
 * @author wpp
 * @date 2019/9/13
 */
@Production
public class ProductionConfiguration {
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder().build();
    }
}
