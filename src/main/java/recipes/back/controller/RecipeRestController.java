package recipes.back.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import recipes.back.model.entity.Recipe;
import recipes.back.model.service.RecipeService;

@CrossOrigin(origins= "*")
@RestController
@RequestMapping("recipes")
public class RecipeRestController {

	@Autowired
	private RecipeService recipeService;
	
	@GetMapping
	public List<Recipe> index(){
		return recipeService.findAll();
	}
	
	@PostMapping
	public Recipe newRecipe(@RequestBody Recipe recipe){
		return recipeService.save(recipe);
	}
	
	@GetMapping("/{id}")
	public Recipe getRecipe(@PathVariable Long id) {
		return recipeService.findById(id);
	}
}
