package org.example.app;

import org.example.rest.HelloRestService;
import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;
import java.util.HashSet;
import java.util.Set;

public class HelloApplication extends Application{
    private Set<Object> singletons = new HashSet<>();

    public HelloApplication(){
        // register our hello service
        singletons.add(new HelloRestService());
    }

    @Override
    public Set<Object> getSingletons(){
        return singletons;
    }
}
