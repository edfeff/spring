package core.chapter02.session6.resourcedeps;


import org.springframework.core.io.Resource;

public class ResourceDependency {
    private Resource resource;

    private Resource classpathResource;

    public Resource getClasspathResource() {
        return classpathResource;
    }

    public void setClasspathResource(Resource classpathResource) {
        this.classpathResource = classpathResource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public Resource getResource() {
        return resource;
    }
}
