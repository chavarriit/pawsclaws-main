package wcci.org.pawsclaws.DTO;

public class EditPetDTO  {// The EditPetDTO class is a Data Transfer Object (DTO) used for editing pet details.
    // Private fields to store the pet's ID, name, and age.
    private long id; // Unique identifier for the pet
    private String name; // Name of the pet
    public Integer age; // Age of the pet

// Constructor that takes a PetDTO object and initializes the EditPetDTO fields with its values.
public EditPetDTO(PetDTO pet) {
    this.id = pet.getId(); // Copy the ID from the PetDTO object
    this.name = pet.getName(); // Copy the name from the PetDTO object
    this.age = pet.getAge(); // Copy the age from the PetDTO object
}

public EditPetDTO() { // Default constructor that allows creating an empty EditPetDTO object.
}

public long getId(){  // Getter method to retrieve the pet's ID.
    return id;
}
public void setId (long id){ // Setter method to set the pet's ID.
    this.id = id;
}

public String getName() { // Getter method to retrieve the pet's name.
    return name;
}

public void setName(String name) { // Setter method to set the pet's name.
    this.name = name;
}

public Integer getAge(){ // Getter method to retrieve the pet's age.
    return age;
}
public void setAge(Integer age) {    // Setter method to set the pet's age.
    this.age = age;
}


}