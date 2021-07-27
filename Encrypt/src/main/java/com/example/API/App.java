package com.example.API;

import Resources.SHA1Resource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class App extends Application<ConfigClass> {

    public static void main(String[] args) throws Exception{
        new App().run(args);
    }



    @Override
    public void run(ConfigClass configuration, Environment environment) {
        final SHA1Resource resource = new SHA1Resource(configuration.getValue());
        environment.jersey().register(resource);
    }

}