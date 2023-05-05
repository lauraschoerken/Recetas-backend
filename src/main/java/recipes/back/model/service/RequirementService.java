package recipes.back.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import recipes.back.model.entity.Requirement;
import recipes.back.model.repository.RequirementRepository;

@Service
public class RequirementService{
	
	@Autowired
	private RequirementRepository requirementRepository;
	
	public List<Requirement> findAll() {
		// TODO Auto-generated method stub
		return requirementRepository.findAll();
	}

	public Requirement save(Requirement requirement) {
		// TODO Auto-generated method stub
		return requirementRepository.save(requirement);
	}
	
	public Requirement findById(Long id) {
		// TODO Auto-generated method stub
		return requirementRepository.findById(id).orElse(null);
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		requirementRepository.deleteById(id);
	}

}
