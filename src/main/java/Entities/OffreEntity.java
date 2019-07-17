package Entities;

//import java.util.Date;




public class OffreEntity {
	
	int RefId;
	private String DateAjout;
	private String DateLimite;
	private String Emplacement;
	private String Role;
	private String Profile;
	private String Competance;
	private String TypeContrat; 
	private float Remuneration;
	
	public OffreEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public OffreEntity(int refId) {
		super();
		RefId = refId;
	}


	public OffreEntity(int refId, String dateAjout, String dateLimite, String emplacement, String role, String profile,
			String competance, String typeContrat, float remuneration) {
		super();
		RefId = refId;
		DateAjout = dateAjout;
		DateLimite = dateLimite;
		Emplacement = emplacement;
		Role = role;
		Profile = profile;
		Competance = competance;
		TypeContrat = typeContrat;
		Remuneration = remuneration;
	}

	public int getRefId() {
		return RefId;
	}

	public void setRefId(int refId) {
		RefId = refId;
	}

	public String getDateAjout() {
		return DateAjout;
	}

	public void setDateAjout(String dateAjout) {
		DateAjout = dateAjout;
	}

	public String getDateLimite() {
		return DateLimite;
	}

	public void setDateLimite(String dateLimite) {
		DateLimite = dateLimite;
	}

	public String getEmplacement() {
		return Emplacement;
	}

	public void setEmplacement(String emplacement) {
		Emplacement = emplacement;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public String getProfile() {
		return Profile;
	}

	public void setProfile(String profile) {
		Profile = profile;
	}

	public String getCompetance() {
		return Competance;
	}

	public void setCompetance(String competance) {
		Competance = competance;
	}

	public String getTypeContrat() {
		return TypeContrat;
	}

	public void setTypeContrat(String typeContrat) {
		TypeContrat = typeContrat;
	}

	public float getRemuneration() {
		return Remuneration;
	}

	public void setRemuneration(float remuneration) {
		Remuneration = remuneration;
	}

	@Override
	public String toString() {
		return "OffreEntity [RefId=" + RefId + ", DateAjout=" + DateAjout + ", DateLimite=" + DateLimite
				+ ", Emplacement=" + Emplacement + ", Role=" + Role + ", Profile=" + Profile + ", Competance="
				+ Competance + ", TypeContrat=" + TypeContrat + ", Remuneration=" + Remuneration + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + RefId;
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
		OffreEntity other = (OffreEntity) obj;
		if (RefId != other.RefId)
			return false;
		return true;
	}
		
	
	
}
