package com.baseclass;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() { return name; }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public String getAuthor() {
        String auth = getName() + getEmail() +getGender();
        return  auth;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Author equal = (Author) obj;
        return gender == equal.gender &&
                name.equals(equal.name) &&
                email.equals(equal.email);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + (int) gender;
        result = 37 * result + (name == null ? 0 : name.hashCode());
        result = 37 * result + (email == null ? 0 : email.hashCode());
        return result;
    }
}
