package gr.hua.dit.dao;

import java.util.List;

import gr.hua.dit.entity.Food;


public interface FoodDAO {
	
	public List<Food> getFoods();

	public void saveFood(Food food);
	
	public void deleteFood(int id);
	
	public Food getFood(int id);

}
