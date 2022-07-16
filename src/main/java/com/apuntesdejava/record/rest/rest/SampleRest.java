package com.apuntesdejava.record.rest.rest;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;
import java.time.LocalDateTime;

@Path("sample")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
public class SampleRest {

    @GET
    public ResponseBody get() {
        return new ResponseBody("Hola", LocalDateTime.now());
    }

    @POST
    public ResponseBody post(RequestBody request) {
        return new ResponseBody(
                String.format("hi %s - %d", request.name(), request.id()),
                LocalDateTime.now()
        );

    }
}
