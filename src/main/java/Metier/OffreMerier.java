package Metier;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import Entities.OffreEntity;


public class OffreMerier {
	List<OffreEntity> listeOffre;
	

	public OffreMerier() {
		listeOffre=new ArrayList<OffreEntity>();
		listeOffre.add(new OffreEntity(0, "01/06/2019", "30/07/2019", "Tunis", "Ingenieur MS Azure", "Ingenieur", "Azure, Windows, O365","CDI", 2000));
		
	}
	
	//Ajouter un element dans la liste des Offres
	public boolean addDashBoard(OffreEntity Offre){
				
			return listeOffre.add(Offre);
	}
	
	//Mettre a jours une Offre
	public boolean updateOffre(OffreEntity Offre){
		int index=listeOffre.indexOf(Offre);
		if(index!=-1){
			listeOffre.set(index, Offre);
				return true;
			}	
		
		return false;
	}
	
	//Retourner les details d'une Offre par son RefId
	public OffreEntity offreEntityByRefId (int id){
		OffreEntity offreRefIdAux=null;
		for(OffreEntity r:listeOffre){
			if(r.getRefId()==id)
				offreRefIdAux=r;
		}
		return offreRefIdAux;
	}
	

	
	//Retourner Tous les elements de la liste des Offres
	public List<OffreEntity> getListeOffre() {
		return listeOffre;
	}
	
}
