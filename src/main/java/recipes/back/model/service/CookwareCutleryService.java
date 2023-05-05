package recipes.back.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import recipes.back.model.entity.CookwareCutlery;
import recipes.back.model.repository.CookwareCutleyRepository;

@Service
public class CookwareCutleryService{
	
	@Autowired
	private CookwareCutleyRepository cookwareCutleyRepository;
	
	public List<CookwareCutlery> findAll() {
		// TODO Auto-generated method stub
		return cookwareCutleyRepository.findAll();
	}

	public CookwareCutlery save(CookwareCutlery cookwareCutlery) {
		// TODO Auto-generated method stub
		return cookwareCutleyRepository.save(cookwareCutlery);
	}
	
	public CookwareCutlery findById(Long id) {
		// TODO Auto-generated method stub
		return cookwareCutleyRepository.findById(id).orElse(null);
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		cookwareCutleyRepository.deleteById(id);
	}

}
