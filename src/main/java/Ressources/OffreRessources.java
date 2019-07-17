package Ressources;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import Entities.OffreEntity;
import Metier.OffreMerier;


@Path(value="Offre")

public class OffreRessources {
	
	
		
		static OffreMerier metier=new OffreMerier();
		
		@GET
		@Produces({ MediaType.APPLICATION_JSON })
		public Response getListeOffre(){
			
				return Response.status(Status.OK).entity(metier.getListeOffre()).build();
		
		}
		@PUT
		@Path("{id}")
		@Consumes({ MediaType.APPLICATION_XML })
		public Response updateOffre(@PathParam(value="id")int id, OffreEntity Offre){
			if(metier.updateOffre(Offre))
				return Response.status(Status.OK).build();
			return Response.status(Status.NOT_FOUND).build();
		}
	
	
	
	
	
	}
	
	

