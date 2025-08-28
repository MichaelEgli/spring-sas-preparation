package ch.egli.michael.spring.sas.preparation.beans;

import org.springframework.stereotype.Component;

@Component
public class Customer {
    private String name;
    private Address address;
 
    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public Address setAddress(Address address) {
        return this.address = address;
    }
}
