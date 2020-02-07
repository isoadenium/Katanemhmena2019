package gr.hua.dit.dao;

import java.util.List;

import gr.hua.dit.entity.Form;

public interface FormDAO {
	
	public List<Form> getForms();

	public void saveForm(Form form);
	
	public void deleteForm(int id);
	
	public Form getForm(int id);
}
