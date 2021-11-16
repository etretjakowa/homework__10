package ru.skypro;

import java.util.Objects;

public class Book {
    private Author author;
    private String titleBook;
    private int publicationYear;

    public Book(Author author, String titleBook, int publicationYear) {
        this.author = author;
        this.titleBook = titleBook;
        this.publicationYear = publicationYear;
    }

    public Author getAuthor() {
        return author;
    }

    public String getAuthorsName() {
        return author.getAuthorsName() + author.getSurName();
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getTitleBook() {
        return titleBook;
    }
    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }
    public String toString() {

        return  "Book" + "author =" + this.author + ", titleBook" + '\'' + this.titleBook + " , publicationYear = " +this.publicationYear + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && author.equals(book.author) && titleBook.equals(book.titleBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, titleBook, publicationYear);
    }
}
