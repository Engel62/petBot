package ru.skypro.tgbot_petsingoodhands.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Shelter {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "shelter_id")
    private Long shelterId;
    @ManyToOne
    @JoinColumn (name = "animalId")
    private Animal animal;
    private String about;
    private String address;
    private String workHours;
    private String contacts;
    private String safetyWithPets;
    private String documentsForAdoption;
    @OneToMany (mappedBy = "shelter")
    private List<Client> clientsBase;

    public Long getShelterId() {
        return shelterId;
    }

    public Animal getAnimal() {
        return animal;
    }

    public String getAbout() {
        return about;
    }

    public String getAddress() {
        return address;
    }

    public String getWorkHours() {
        return workHours;
    }

    public String getContacts() {
        return contacts;
    }

    public String getSafetyWithPets() {
        return safetyWithPets;
    }

    public String getDocumentsForAdoption() {
        return documentsForAdoption;
    }
}
