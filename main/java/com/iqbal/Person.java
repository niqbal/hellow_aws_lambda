package com.iqbal;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class Person {

    static ObjectMapper mapper = new ObjectMapper();

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person() {
    }

    public static Person createPersonObject(String json) {
        Person person = new Person();
        try {
            Map map = mapper.readValue(json, Map.class);
            person.firstName = (String) map.get("firstName");
            person.lastName = (String) map.get("lastName");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return person;
    }
}