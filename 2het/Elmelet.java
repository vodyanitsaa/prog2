import java.time.Year;

class Book
{
    public String title;
    public String author;
    public int pages;
}

class Person
{
    public String name;
    public String email;
    public int yearOfBirth;
    
    public int howOldAreYou()
    {
        int currentYear = Year.now().getValue();
        return currentYear - yearOfBirth;
    }
}

public class Elmelet
{
    public static void main(String[] args)
    {
        Book book1 = new Book();
        book1.title = "Dune";
        book1.author = "Frank Herbert";
        book1.pages = 412;

        Book book2 = new Book();
        book2.author = "Alapítvány";
        book2.author = "Asimov";
        book2.pages = 255;

        System.out.println(book1.title);
        System.out.println(book2.author);


        Person p1 = new Person();
        p1.name = "Kristof";
        p1.email = "kutyakristof@gmail.com";
        p1.yearOfBirth = 2006;

        System.out.println(p1.email);
        System.out.println(p1.howOldAreYou());
    }
}