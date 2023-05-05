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

import recipes.back.model.entity.CookwareCutlery;
import recipes.back.model.service.CookwareCutleryService;

@CrossOrigin(origins= "*")
@RestController
@RequestMapping("cookwareCutlery")
public class CookwareCutleryRestController {

	@Autowired
	private CookwareCutleryService cookwareCutleryService;
	
	@GetMapping
	public List<CookwareCutlery> index(){
		return cookwareCutleryService.findAll();
	}
	
	@PostMapping
	public CookwareCutlery newCookwareCutlery(@RequestBody CookwareCutlery cookwareCutlery){
		return cookwareCutleryService.save(cookwareCutlery);
	}
	
	@GetMapping("/{id}")
	public CookwareCutlery getCookwareCutlery(@PathVariable Long id) {
		return cookwareCutleryService.findById(id);
	}
}
