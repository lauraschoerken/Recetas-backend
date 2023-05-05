package recipes.back.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import recipes.back.model.entity.Steps;

@Repository
public interface StepsRepository extends JpaRepository<Steps, Long>{

}
