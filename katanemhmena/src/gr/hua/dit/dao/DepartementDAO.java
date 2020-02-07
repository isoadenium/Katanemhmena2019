package gr.hua.dit.dao;

import java.util.List;

import gr.hua.dit.entity.Departement;


public interface DepartementDAO {
	
	public List<Departement> getDepartements();

	public void saveDepartement(Departement departement);
	
	public void deleteDepartement(int id);
	
	public Departement getDepartement(int id);

}
