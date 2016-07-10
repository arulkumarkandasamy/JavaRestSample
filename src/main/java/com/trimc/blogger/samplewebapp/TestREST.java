package com.trimc.blogger.samplewebapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/")
public class TestREST {	

	@GET
	@Path("/getResponse")
	public Object getit() {
		return "Response from REST service in docker container !!!";
	}
}
