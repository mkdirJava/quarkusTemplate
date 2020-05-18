package com.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import com.practice.data.IDatabaseFacade;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.h2.H2DatabaseTestResource;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
@QuarkusTestResource(H2DatabaseTestResource.class)
public class GreetingResourceTest {
	
	@Inject
	private IDatabaseFacade databaseFacade;

    @Test
    public void testHelloEndpoint() {
    	
    	databaseFacade.savePerson();
    	assertEquals(1,databaseFacade.getPeople().size());
//        given()
//          .when().get("/database/person")
//          .then()
//             .statusCode(200)
//             .body(is(""));
    }

}