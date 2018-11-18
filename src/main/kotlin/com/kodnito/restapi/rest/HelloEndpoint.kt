package com.kodnito.restapi.rest

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import kotlin.collections.List
import java.util.Arrays


@Path("/hello")
class HelloEndpoint {

    @GET
    @Produces(MediaType.TEXT_HTML)
    fun hello(): String {
        return "Hello From Microprofile Kotlin"
    }
    
    @GET
    @Path("/todos")
    @Produces(MediaType.APPLICATION_JSON)
    fun getTodos(): List<Todo> {
        return Arrays.asList(
                Todo("Learn Kotlin", "Learn More Kotlin"),
                Todo("Buy Milk", "Buy milk for coffeee")
        )
    }
}