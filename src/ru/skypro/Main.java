package ru.skypro;

public class Main {


    public static void main(String[] args) {
        System.out.println("Author:");

        Author bulgakov = new Author("Mikhail", "Bulgakov");
        Author dreiser = new Author("Theodore", "Dreiser");
        Author dreiser2 = new Author("Theodore", "Dreiser");

        Book theWhiteGuard = new Book(bulgakov, "The White Guard", 2008);
        Book titan = new Book(dreiser, "Titan", 2016);

        titan.setPublicationYear(2021);
        System.out.println("Титан - " + titan.getPublicationYear()+ " год переиздания.");

        System.out.println("Author сравниваем екалз " + dreiser.equals(dreiser2));
        System.out.println("Author сравниваем еклаз и хэшкод" + (bulgakov.hashCode() == dreiser2.hashCode()));
        System.out.println("Author " + bulgakov.equals(dreiser2));
    }
}
