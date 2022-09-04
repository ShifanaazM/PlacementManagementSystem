package net.javaguides.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.model.Placement;
import net.javaguides.repository.PlacementRepository;

@RestController
@RequestMapping("/api/v1/")
public class PlacementController<PlacementRespository> {

	@Autowired
	private PlacementRepository placementRepository;
	
	//get all placements
	@GetMapping("/placements")
	public List<Placement> getAllPlacements(){
		return placementRepository.findAll();
	}	
}