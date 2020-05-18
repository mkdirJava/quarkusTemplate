package com.practice.web;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.practice.data.IDatabaseFacade;

@Path("/")
public class ControllerOne {

	private IDatabaseFacade databaseFacade;

	@Inject
	public ControllerOne(IDatabaseFacade databaseFacade) {
		this.databaseFacade = databaseFacade;
	}

	@Path("/database/person")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPeople() {
        return Response.ok(this.databaseFacade.getPeople()).build();
    }

	@Path("/database/person/save")
	@GET
	public void getSavePerson() {
		this.databaseFacade.savePerson();
	}
}
