package recipes.back.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import recipes.back.model.entity.Ingredient;
import recipes.back.model.repository.IngredientRepository;

@Service
public class IngredientService{
	
	@Autowired
	private IngredientRepository ingredientRepository;
	
	public List<Ingredient> findAll() {
		// TODO Auto-generated method stub
		return ingredientRepository.findAll();
	}

	public Ingredient save(Ingredient ingredient) {
		// TODO Auto-generated method stub
		return ingredientRepository.save(ingredient);
	}
	
	public Ingredient findById(Long id) {
		// TODO Auto-generated method stub
		return ingredientRepository.findById(id).orElse(null);
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		ingredientRepository.deleteById(id);
	}

}
