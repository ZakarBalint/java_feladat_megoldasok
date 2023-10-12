package konstruktorfeladatok;

class Person
{
    String firstname;
    String lastname;
    int birthYear;
    int birthMonth;
    int birthDay;

    public Person(String fname, String lname)
    {
        firstname = fname;
        lastname = lname;
        birthYear = 1;
        birthMonth = 1;
        birthDay = 1;
    }

    public Person(String firstN, String lastN, int year, int month, int day)
    {
        firstname = firstN;
        lastname = lastN;
        birthYear = year;
        birthMonth = month;
        birthDay = day;
    }

    public void printPerson()
    {
        System.out.println("Vezetéknév: " + firstname);
        System.out.println("Keresztnév: " + lastname);
        System.out.println("Születési idő: " + birthYear + "." + birthMonth + "." + birthDay + ".");
    }

    public void set_firstname(String newE)
    {
        firstname = newE;
    }
    public void set_lastname(String newE)
    {
        lastname = newE;
    }
    public void set_birthYear(int newE)
    {
        birthYear = newE;
    }
    public void set_birthMonth(int newE)
    {
        birthMonth = newE;
    }
    public void set_birthDay(int newE)
    {
        birthDay = newE;
    }
}

public class Konstruktor_1_feladat {
    public static void main(String[] args) {

        Person p1 = new Person("bas", "daw");
        Person p2 = new Person("qwe", "regf", 1200, 5, 12);

        p2.printPerson();
        
        p1.printPerson();

        p1.set_birthYear(1000);
        p1.set_birthMonth(11);
        p1.set_birthDay(9);

        p1.printPerson();

        p2.set_lastname("asd");
        p2.printPerson();
    }
}
