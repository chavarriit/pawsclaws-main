package wcci.org.pawsclaws.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import wcci.org.pawsclaws.DTO.*;
import wcci.org.pawsclaws.Enums.PetType;
import wcci.org.pawsclaws.Services.PetService;

@Controller
public class PetController {

    @Autowired
    private PetService service;

    @GetMapping({"", "/", "/home" })
    public String getAllPets(Model model) {
        try {
            List<PetDTO> pets = service.getAllPets();
            // model.addAttribute("pets", pets);
            // model.addAttribute("title", "Shelter pets");
            return "shelter/ViewPets";
        } catch (Exception ex) {
            ErrorDataDTO errorData = new ErrorDataDTO();
            errorData.setErrorMessage(ex.getMessage());
            errorData.setErrorCode(500);
            model.addAttribute("errorData", errorData);
            model.addAttribute("title", "Shelter pets - Error");
            return "shelter/ErrorMessage";
        }
    }

    @GetMapping("details/{id}")
    public String getDetails(@PathVariable long id, Model model) {
        PetDTO pet = service.getPetById(id);
        pet.setStatus(pet.getStatus().replace("/n", "</br>"));
        model.addAttribute("pet", pet);
        model.addAttribute("title", "Details for" + pet.getName());
        return "shelter/ViewDetails";
    }

    @GetMapping("create")
    public String createPet(Model model) {
        AdmissionDTO addedPet = new AdmissionDTO();
        model.addAttribute("pet", addedPet);
        model.addAttribute("title", "create pet");
        model.addAttribute("petType", PetType.values());
        return "Shelter/CreatePet";
    }

    @PostMapping
    public String saveAdd(@ModelAttribute AdmissionDTO pet, Model model) {
        try {
            service.saveAdd(pet);
        } catch (Exception ex) {
            pet.setErrorMessage(ex.getMessage());
            pet.setErrorCode(400);
            model.addAttribute("pet", pet);
            model.addAttribute("title", "Details for" + "Create Pet");
            model.addAttribute("petTypes", PetType.values());
            return "Shelter/CreatePet";
        }
        return "redirect:/home";
    }

    @GetMapping("edit/{id}")
    public String editPet(@PathVariable Long id, Model model) {
        EditPetDTO pet = new EditPetDTO(service.getPetById(id));
        model.addAttribute("pet", pet);
        model.addAttribute("title", "detail for" + pet.getName());
        model.addAttribute("petType", PetType.values());
        return "shelter/EditPet";
    }

    @PatchMapping("saveedit")
    public String saveEdit(@ModelAttribute EditPetDTO pet, Model model) {
        try {
            service.saveEdit(pet);
        } catch (Exception ex) {
            //pet.setErrorMessage(ex.getMessage());
            //pet.setErrorCode(400);
            model.addAttribute("pet", pet);
            model.addAttribute("title", "Details for" + "Edit Pet");
            model.addAttribute("petTypes", PetType.values());

            return "shelter/EditPet";
        }
        return "redirect/home";
        }
    }
    
