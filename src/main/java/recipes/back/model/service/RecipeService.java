package recipes.back.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import recipes.back.model.entity.Recipe;
import recipes.back.model.repository.RecipeRepository;

@Service
public class RecipeService{
	
	@Autowired
	private RecipeRepository recipeRepository;
	
	public List<Recipe> findAll() {
		// TODO Auto-generated method stub
		return recipeRepository.findAll();
	}

	public Recipe save(Recipe recipe) {
		// TODO Auto-generated method stub
		return recipeRepository.save(recipe);
	}
	
	public Recipe findById(Long id) {
		// TODO Auto-generated method stub
		return recipeRepository.findById(id).orElse(null);
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		recipeRepository.deleteById(id);
	}

}
