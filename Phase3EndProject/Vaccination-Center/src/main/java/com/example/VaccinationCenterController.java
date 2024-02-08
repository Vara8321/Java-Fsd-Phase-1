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
public class VaccinationCenterController {

	    @Autowired
	    private VaccinationCenterRepository vaccinationCenterRepository;
	
	
		@GetMapping("/vaccinationCenters")
	    public String findAllCenters(ModelMap model) {
	        // Retrieve the list of vaccination centers from the database
	        List<VaccinationCenterEntity> listOfCenters = vaccinationCenterRepository.findAll();
	        // Add the list to the model
	        model.addAttribute("centerlist", listOfCenters);
	        // Return the name of the JSP file to render
	        return "vaccination-centers";
	    }
		
		@GetMapping("/deleteCenter")
		public String deleteCenter(ModelMap model, @RequestParam long id) {

			Optional<VaccinationCenterEntity> centerFromRepo  = vaccinationCenterRepository.findById(id);

			model.addAttribute("id", id);

			if (centerFromRepo.isPresent()) {

				vaccinationCenterRepository.deleteById(id);

				return "delete-center-success";
			} else {
				return "delete-center-failed";
			}
		}
		
		@GetMapping("/addCenter")
		public String showNewCenterForm(ModelMap model) {

			VaccinationCenterEntity center = new VaccinationCenterEntity();
			model.addAttribute("center", center);

			return "new-center";
		}

		@PostMapping("/addCenter")
		public String addNewCenter(ModelMap model, @ModelAttribute("center") VaccinationCenterEntity center) {
			//product.setDateAdded(new Date());

			VaccinationCenterEntity savedCenter = vaccinationCenterRepository.save(center);
			model.addAttribute("id", savedCenter.getCenterid());

			return "add-center-success";
		}
		
		@GetMapping("/editCenter")
		public String editCenterForm(ModelMap model, @RequestParam long id) {
			model.addAttribute("id", id);

			Optional<VaccinationCenterEntity> centerFromRepo = vaccinationCenterRepository.findById(id);
			
			if (centerFromRepo.isPresent()) {
				
				VaccinationCenterEntity center = centerFromRepo.get();
				model.addAttribute("center", center);

				return "edit-center-form";
			} 
			else {
				return "center-not-found";
			}

		}

		@PostMapping("/editCenter")
		public String updateCenter(ModelMap model, @ModelAttribute("center") VaccinationCenterEntity center) {
			//product.setDateAdded(new Date());// some issue with retrieving date, so setting it again as a workaround for now.
			
			VaccinationCenterEntity savedCenter = vaccinationCenterRepository.save(center);
			model.addAttribute("id", savedCenter.getCenterid());

			return "edit-center-success";
		}
}
