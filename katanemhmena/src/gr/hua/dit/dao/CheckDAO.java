package gr.hua.dit.dao;

import java.util.List;

import gr.hua.dit.entity.Check;

public interface CheckDAO {
	public List<Check> getChecks();

	public void saveCheck(Check check);
	
	public void deleteCheck(int id);
	
	public Check getCheck(int id);
}
