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

import recipes.back.model.entity.Steps;
import recipes.back.model.service.StepsService;

@CrossOrigin(origins= "*")
@RestController
@RequestMapping("steps")
public class StepsRestController {

	@Autowired
	private StepsService stepsService;
	
	@GetMapping
	public List<Steps> index(){
		return stepsService.findAll();
	}
	
	@PostMapping
	public Steps newRquirement(@RequestBody Steps steps){
		return stepsService.save(steps);
	}
	
	@GetMapping("/{id}")
	public Steps getRequirement(@PathVariable Long id) {
		return stepsService.findById(id);
	}
}
