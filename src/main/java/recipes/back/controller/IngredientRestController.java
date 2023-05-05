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

import recipes.back.model.entity.Ingredient;
import recipes.back.model.service.IngredientService;

@CrossOrigin(origins= "*")
@RestController
@RequestMapping("ingredients")
public class IngredientRestController {

	@Autowired
	private IngredientService ingredientService;
	
	@GetMapping
	public List<Ingredient> index(){
		return ingredientService.findAll();
	}
	
	@PostMapping
	public Ingredient newIngredient(@RequestBody Ingredient ingredient){
		return ingredientService.save(ingredient);
	}
	
	@GetMapping("/{id}")
	public Ingredient getIngredient(@PathVariable Long id) {
		return ingredientService.findById(id);
	}
}
