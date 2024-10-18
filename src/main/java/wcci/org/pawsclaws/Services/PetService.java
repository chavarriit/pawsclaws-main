package wcci.org.pawsclaws.Services;

import java.util.*;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import wcci.org.pawsclaws.DTO.AdmissionDTO;
import wcci.org.pawsclaws.DTO.EditPetDTO;
import wcci.org.pawsclaws.DTO.PetDTO;

@Service
public class PetService {
    private final RestTemplate restTemplate;
    public final String server = "http://localhost:8080";

    public PetService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<PetDTO> getAllPets() {
        String url = server + "/api/v1/shelter";
        PetDTO[] pets = restTemplate.getForObject(url, PetDTO[].class);
        return Arrays.asList(pets);
    }

    public PetDTO getPetById(long id) {
        String url = server + "/api/v1/shelter/" + id;
        PetDTO pet = restTemplate.getForObject(url, PetDTO.class);
        return pet; //convert the array to a list and return it
    }

    public PetDTO saveAdd(AdmissionDTO admit) {
        String url = server + "/api/v1/shelter"; // construct the url for the shelter api
        HttpHeaders headers = new HttpHeaders();
        
        headers.set("Content-Type", "application/json");
        HttpEntity<AdmissionDTO> requestEntity = new HttpEntity<>(admit, headers);
        PetDTO pet = restTemplate.postForObject(url, requestEntity, PetDTO.class);
        return pet; //convert the array to a list and return it
    }

public EditPetDTO getEdit(Long id) {
    String url = server + "/api/v1/shelter/edit/"+ id; // Construct the URL for th shelter API
    EditPetDTO pet = restTemplate.getForObject(url, EditPetDTO.class);
    return pet;//convert the array to a list and return it

}

public List<PetDTO> getPetsByName(String name) {
    String url = server + "/api/v1/shelter/name/" + name;
    PetDTO[] pets = restTemplate.getForObject(url, PetDTO[].class);
    return Arrays.asList(pets);
}

public void saveNew(AdmissionDTO admit) {
    String url = server + "/api/v1/shelter";
    HttpHeaders headers = new HttpHeaders();
    headers.set("Content-type","application/json");
    
    HttpEntity<AdmissionDTO> requesEntity = new HttpEntity<>(admit,headers);
    PetDTO pet = restTemplate.patchForObject(url, requesEntity, PetDTO.class);
}

public void saveEdit(EditPetDTO admit) {
    String url = server + "/api/v1/shelter";
    HttpHeaders headers = new HttpHeaders();
    headers.set("content-type","application/jason");

    HttpEntity<EditPetDTO> requestEntity = new HttpEntity <> (admit,headers);

    //ResponseEntity<PetDTO> response = restTemplate.exchange(url, HttpMethod.PUT, requestEntity);
    //if (response.getStatusCode() == HttpStatus.OK) {
      //  System.out.println("Resource update successfully.");
    //} else {
      //  System.out.println("Failed to update resource. status code" + response.getStatusCode());
    //}
}

}
