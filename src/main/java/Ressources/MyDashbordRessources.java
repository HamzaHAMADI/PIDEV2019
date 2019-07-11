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

import EntitiesExamen.MyDashBoardEntity;
import MetierExamen.MyDashBoardMerier;


@Path(value="MyDashbord")

public class MyDashbordRessources {
	
	
		
		static MyDashBoardMerier metier=new MyDashBoardMerier();
		
		@GET
		@Produces({ MediaType.APPLICATION_JSON })
		public Response getListeRendezVous(){
			
				return Response.status(Status.OK).entity(metier.getListeMyDashBoard()).build();
		
		}
		@PUT
		@Path("{id}")
		@Consumes({ MediaType.APPLICATION_XML })
		public Response updateRendezVous(@PathParam(value="id")int id, MyDashBoardEntity MyDashbordAux){
			if(metier.updateRendezVous(MyDashbordAux))
				return Response.status(Status.OK).build();
			return Response.status(Status.NOT_FOUND).build();
		}
	
	
	
	
	
	}
	
	

