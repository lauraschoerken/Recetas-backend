package recipes.back.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import recipes.back.model.entity.Steps;
import recipes.back.model.repository.StepsRepository;

@Service
public class StepsService{
	
	@Autowired
	private StepsRepository stepsRepository;
	
	public List<Steps> findAll() {
		// TODO Auto-generated method stub
		return stepsRepository.findAll();
	}

	public Steps save(Steps steps) {
		// TODO Auto-generated method stub
		return stepsRepository.save(steps);
	}
	
	public Steps findById(Long id) {
		// TODO Auto-generated method stub
		return stepsRepository.findById(id).orElse(null);
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		stepsRepository.deleteById(id);
	}

}
