package org.example.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/restapi")
public class HelloRestService {
    @GET // indicates GET request from the code
    @Path("/hello") // '/' is root, /hello is the endpoint to utilize
    public Response hello(){
        return Response.status(200).entity("hello").build();
    }
}
