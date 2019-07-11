package EntitiesExamen;

import java.util.Date;




public class MyDashBoardEntity {
	
	int numeroEtudiant;
	private String dateNaissance;
	private String email;
	private String nom;
	private String prenom;
	
	
	public MyDashBoardEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public MyDashBoardEntity(int numeroEtudiant, String dateNaissance, String email, String nom, String prenom) {
		super();
		this.numeroEtudiant=numeroEtudiant;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
	}


	public int getNumeroEtudiant() {
		return numeroEtudiant;
	}


	public void setNumeroEtudiant(int numeroEtudiant) {
		this.numeroEtudiant = numeroEtudiant;
	}


	public String getDateNaissance() {
		return dateNaissance;
	}


	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	

	@Override
	public String toString() {
		return "Etudiant [Numero Etudiant=" + numeroEtudiant + ", date de naissance=" + dateNaissance + ", Email=" + email + ", Nom=" + nom + ", prenom="
				+ prenom + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroEtudiant;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	
	
	
}
