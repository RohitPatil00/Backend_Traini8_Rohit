package com.example.demo.model;

public class TrainingCenter {

    private Long id;
    private String name;
    private String address;

    // Default constructor
    public TrainingCenter() {}

    // Parameterized constructor (optional)
    public TrainingCenter(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Getter for id
    public Long getId() {
        return id;
    }

    // Setter for id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Setter for address
    public void setAddress(String address) {
        this.address = address;
    }

    // Optionally, you can override the toString() method for easy printing
    @Override
    public String toString() {
        return "TrainingCenter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
