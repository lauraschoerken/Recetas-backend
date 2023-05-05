package recipes.back.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import recipes.back.model.entity.Requirement;

@Repository
public interface RequirementRepository extends JpaRepository<Requirement, Long>{

}
