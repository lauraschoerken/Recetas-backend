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

import recipes.back.model.entity.Requirement;
import recipes.back.model.service.RequirementService;

@CrossOrigin(origins= "*")
@RestController
@RequestMapping("requirements")
public class RequirementRestController {

	@Autowired
	private RequirementService requirementService;
	
	@GetMapping
	public List<Requirement> index(){
		return requirementService.findAll();
	}
	
	@PostMapping
	public Requirement newRquirement(@RequestBody Requirement requirement){
		return requirementService.save(requirement);
	}
	
	@GetMapping("/{id}")
	public Requirement getRequirement(@PathVariable Long id) {
		return requirementService.findById(id);
	}
}
