package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException{
    public StudentNotFoundException(long id) {
        this("Could not find student with ID " + id);
    }
    public StudentNotFoundException(String message) {
        super(message);
    }
}
