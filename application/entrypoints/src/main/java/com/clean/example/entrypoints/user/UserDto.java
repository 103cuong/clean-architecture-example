package com.clean.example.entrypoints.user;

class UserDto {
    private final String firstName;
    private final String lastName;

    public UserDto(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}