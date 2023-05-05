package recipes.back.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import recipes.back.model.entity.Ingredient;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long>{

}
