package com.fdm.database;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fdm.entities.Chef;
import com.fdm.entities.GenericDAO;
import com.fdm.entities.Recipe;
import com.fdm.entities.RecipeDao;
import com.fdm.entities.RecipeReviews;
import com.fdm.entities.Reviewer;

public class RunRecipeDatabase {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleDBconnect");
		
		GenericDAO<Recipe> recipeDAO = new RecipeDao();
		Recipe recipe = new Recipe();
		recipe.setRecipe_id(1); 
		recipe.setRecipe_name("Cranberry Squash Muffins");
		recipe.setRecipe_difficulty("Easy");
		recipe.setPreparation_time("30 minutes");
		recipe.setMeal_type("Breakfast/Snack");
		recipe.setDescription("Delicious, moist treat with zingy cranberry bites.");
		recipeDAO.add(recipe);
		recipe.setRecipe_id(2); 
		recipe.setRecipe_name("Easy Oatmeal Crackers");
		recipe.setRecipe_difficulty("Easy");
		recipe.setPreparation_time("30 minutes");
		recipe.setMeal_type("Snack");
		recipe.setDescription("Hearty, crunchy crackers to be eaten alone or crumbled over a salad.");
		recipeDAO.add(recipe);
		recipe.setRecipe_id(3); 
		recipe.setRecipe_name("Vegan Rice Noodle Salad with Sesame Dressing");
		recipe.setRecipe_difficulty("Moderate");
		recipe.setPreparation_time("35 minutes");
		recipe.setMeal_type("Lunch");
		recipe.setDescription("Fresh and filling vegan rice noodle salad replica of the vietnamese vermicelli salad.");
		recipeDAO.add(recipe);
		GenericDAO<Reviewer> reviewerDAO = new RecipeDao();
		Reviewer reviewer = new Reviewer();
		reviewer.setReviewer_id(1);
		reviewer.setUsername("EatsMelons4Breakfast");
		reviewerDAO.add(reviewer);
		reviewer.setReviewer_id(2);
		reviewer.setUsername("Angelica");
		reviewerDAO.add(reviewer);
		reviewer.setReviewer_id(2);
		reviewer.setUsername("Angelica");
		reviewerDAO.add(reviewer);
		GenericDAO<RecipeReviews> recipeReviewsDAO = new GenericDAO<> (emf, RecipeReviews.class);
		RecipeReviews recipeReviews = new RecipeReviews();
		recipeReviews.setReview_id(1);
		recipeReviews.setReview("5");
		recipeReviewsDAO.add(recipeReviews);
		recipeReviews.setReview_id(2);
		recipeReviews.setReview("4");
		recipeReviewsDAO.add(recipeReviews);
		recipeReviews.setReview_id(3);
		recipeReviews.setReview("4");
		recipeReviewsDAO.add(recipeReviews);
		GenericDAO<Chef> chefDAO = new GenericDAO<> (emf, Chef.class);
		Chef chef = new Chef();
		chef.setChef_id(1);
		chef.setChef_name("Shirley Plant");
		chefDAO.add(chef);
		chef.setChef_id(2);
		chef.setChef_name("Kelly Roenicke");
		chefDAO.add(chef);
		chef.setChef_id(3);
		chef.setChef_name("Ania");
		chefDAO.add(chef);
		System.out.println(recipeDAO.getAll());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
