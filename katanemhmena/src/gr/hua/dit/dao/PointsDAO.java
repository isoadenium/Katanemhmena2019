package gr.hua.dit.dao;

import java.util.List;

import gr.hua.dit.entity.Points;


public interface PointsDAO {
	
	public List<Points> getPointss();

	public void savePoints(Points points);
	
	public void deletePoints(int id);
	
	public Points getPoints(int id);

}
