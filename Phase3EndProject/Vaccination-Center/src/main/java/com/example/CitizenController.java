package com.example;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CitizenController {

	@Autowired
	CitizenRepository citizenRepo;
	
	@GetMapping("/listofcitizens")
    public String findAllCitizens(ModelMap model) {
        
        List<CitizensEntity> listOfCitizens = citizenRepo.findAll();
        // Add the list to the model
        model.addAttribute("citizenlist", listOfCitizens);
        
        // Return the name of the JSP file to render
        return "list-of-citizens";
    }
	
	@GetMapping("/deleteCitizen")
	public String deleteCitizen(ModelMap model, @RequestParam long id) {

		Optional<CitizensEntity> citizenFromRepo  = citizenRepo.findById(id);

		model.addAttribute("id", id);

		if (citizenFromRepo.isPresent()) {

			citizenRepo.deleteById(id);

			return "delete-citizen-success";
		} else {
			return "delete-citizen-failed";
		}
	}
	
	@GetMapping("/addCitizen")
	public String showNewCitizenForm(ModelMap model) {

		CitizensEntity citizen = new CitizensEntity();
		model.addAttribute("citizen", citizen);

		return "new-citizen";
	}

	@PostMapping("/addCitizen")
	public String addNewCitizen(ModelMap model, @ModelAttribute("citizen") CitizensEntity citizen) {

		CitizensEntity savedCitizen = citizenRepo.save(citizen);
		model.addAttribute("id", savedCitizen.getCitizenid());

		return "add-citizen-success";
	}
	
	@GetMapping("/editCitizen")
	public String editCitizenForm(ModelMap model, @RequestParam long id) {
		model.addAttribute("id", id);

		Optional<CitizensEntity> citizenFromRepo = citizenRepo.findById(id);
		
		if (citizenFromRepo.isPresent()) {
			
			CitizensEntity citizen = citizenFromRepo.get();
			model.addAttribute("citizen", citizen);

			return "edit-citizen-form";
		} 
		else {
			return "citizen-not-found";
		}

	}

	@PostMapping("/editCitizen")
	public String updateCenter(ModelMap model, @ModelAttribute("citizen") CitizensEntity citizen) {
		//product.setDateAdded(new Date());// some issue with retrieving date, so setting it again as a workaround for now.
		
		CitizensEntity savedCitizen = citizenRepo.save(citizen);
		model.addAttribute("id", savedCitizen.getCitizenid());

		return "edit-citizen-success";
	}
}
