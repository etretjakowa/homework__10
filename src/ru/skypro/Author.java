package ru.skypro;

import java.util.Objects;

public class Author {
    private final String authorsName;
    private final String surName;

    public Author(String authorsName, String surName) {
        this.authorsName = authorsName;
        this.surName = surName;
    }

    public String getAuthorsName() {
        return authorsName;
    }

    public String getSurName() {
        return surName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorsName='" + authorsName + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorsName.equals(author.authorsName) && surName.equals(author.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorsName, surName);
    }
}


