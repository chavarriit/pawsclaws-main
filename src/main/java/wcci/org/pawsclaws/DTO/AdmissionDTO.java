package wcci.org.pawsclaws.DTO;

import wcci.org.pawsclaws.Enums.PetType;

// The AdmissionDTO class serves as a Data Transfer Object (DTO) for handling pet admission data.
public class AdmissionDTO extends ErrorDataDTO { // Private fields to store the pet's name, age, and type.
    private String name; // Name of the pet
    private Integer age; // Age of the pet
    private PetType petType; // Type of the pet

    public String getName() {// Getter method to retrieve the pet's name.
        return name;
    }
    public void setName(String name) { // Setter method to set the pet's name.
        this.name = name;
    }
    public Integer getAge() { // Getter method to retrieve the pet's age.
        return age;
    }
    public void setAge(Integer age) {  // Setter method to set the pet's age.
        this.age = age;
    }
    public PetType getPetType() {   // Getter method to retrieve the pet's type.
        return petType;
    }
    public void setPetType(PetType petType) { // Setter method to set the pet's type.
        this.petType = petType;
    }

}
