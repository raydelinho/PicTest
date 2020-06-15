package sr.pic.test.controller;

import sr.pic.test.entities.EntitieTest;
import sr.pic.test.service.EntitieService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("test")
public class EntitieController {
    private EntitieService entitieService = new EntitieService();

    @Path("/list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<EntitieTest> findAll() {
        return entitieService.all();
    }
}
