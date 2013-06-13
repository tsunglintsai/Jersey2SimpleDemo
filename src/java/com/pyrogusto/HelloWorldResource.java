package com.pyrogusto;

import java.util.HashMap;
import java.util.Map;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class HelloWorldResource {

    
    //http://localhost:8080/helloworld/
    @GET
    @Path("hello")
    @Produces("text/plain")
    public String getHello() {
        return "Hello World!";
    }

}