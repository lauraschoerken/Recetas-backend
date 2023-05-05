package recipes.back.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import recipes.back.model.entity.CookwareCutlery;

@Repository
public interface CookwareCutleyRepository extends JpaRepository<CookwareCutlery, Long>{

}
