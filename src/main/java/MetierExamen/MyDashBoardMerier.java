package MetierExamen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import EntitiesExamen.MyDashBoardEntity;


public class MyDashBoardMerier {
	List<MyDashBoardEntity> listeMyDashBoard;
	

	public MyDashBoardMerier() {
		listeMyDashBoard=new ArrayList<MyDashBoardEntity>();
		listeMyDashBoard.add(new MyDashBoardEntity(12, "31-10-1980", "foulen.benFoulen@test.tn", "Foulen", "BenFoulen"));
		
	}
	
	//Ajouter un element dans la liste
	public boolean addDashBoard(MyDashBoardEntity DashBoard){
				
			return listeMyDashBoard.add(DashBoard);
	}
	
	//Mettre a jours un elements
	public boolean updateRendezVous(MyDashBoardEntity DashBoard){
		int index=listeMyDashBoard.indexOf(DashBoard);
		if(index!=-1){
			listeMyDashBoard.set(index, DashBoard);
				return true;
			}	
		
		return false;
	}
	
	//Retourner les details d'un elements par son numero
	public MyDashBoardEntity MyDashBoardByNumero(int id){
		MyDashBoardEntity MyDashBoardAux=null;
		for(MyDashBoardEntity r:listeMyDashBoard){
			if(r.getNumeroEtudiant()==id)
				MyDashBoardAux=r;
		}
		return MyDashBoardAux;
	}
	
	//Retourner Tous les elements de la liste
	public List<MyDashBoardEntity> getListeMyDashBoard() {
		return listeMyDashBoard;
	}
	
}
