package com.study.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/books")
public class BookController {


    @GET
    @Path("/status")
    public String status(){
        return "Lots of Books";
    }
}
