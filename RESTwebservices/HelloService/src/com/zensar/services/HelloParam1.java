package com.zensar.services;

import java.time.LocalDate;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/zenparam")
public class HelloParam1 {
	@Path("/welcome/{nm}")
	@GET
	@Produces("text/html")
	  public Response getMessage(@PathParam("nm")String name)
	 {
		 return Response.status(200).entity("<p>Hello<b><i>"+name+"</i></b>Welcome to zensar </p>").build();
	 }
	
	
	@Path("/welcome1/{dd}/{mm}/{yy}")
	@GET
	@Produces("text/html")
	
	public Response getReply(@PathParam("dd") int day,@PathParam("mm") int month,@PathParam("yy") int year)
	{
		LocalDate date=LocalDate.of(year, month, day);
		return Response.status(200).entity(date.toString()).build();
	}
	
	
	
}
