package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException{
    public StudentNotFoundException() {
        this("Could not find student with ID");
    }
    public StudentNotFoundException(String message) {
        super(message);
    }
}
