package za.co.sb.qp.barista.boundary;

import lombok.extern.java.Log;
import za.co.sb.qp.barista.control.BaristaService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("barista")
@RequestScoped
@Log
public class BaristaResource {

    @Inject
    private BaristaService baristaService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listCoffees() {
        return Response.ok(baristaService.listCoffees()).build();
    }
}
