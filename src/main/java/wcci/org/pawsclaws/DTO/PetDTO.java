package wcci.org.pawsclaws.DTO;

import wcci.org.pawsclaws.*;
import wcci.org.pawsclaws.Enums.PetType;

public class PetDTO extends ErrorDataDTO {

    private Long id;

    private PetType petType;

    private String name;

    private Integer age;

    private int health;

    private int happiness;

    private int deathBy;

    private int hunger;

    private int thirst;

    private boolean dead;

    private String status;

    private int oil;

    private int battery;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PetType getPetType() { //Gets the type of the pet.
        return petType;
    }

    public void setPetType(PetType petType) {  // Sets the type of the pet.
        this.petType = petType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getDeathBy() {
        return deathBy;
    }

    public void setDeathBy(int deathBy) {
        this.deathBy = deathBy;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public int getOil() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }


}
