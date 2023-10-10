class Person
{
    String firstname;
    String lastname;
    int birthYear;
    int birthMonth;
    int birthDay;

    public void printPerson()
    {
        System.out.println("Vezetéknév: " + firstname);
        System.out.println("Keresztnév: " + lastname);
        System.out.println("Születési idő: " + birthYear + "." + birthMonth + "." + birthDay + ".");
    }

    public String get_firstname()
    {
        return firstname;
    }
    public String get_lastname()
    {
        return lastname;
    }
    public int get_birthYear()
    {
        return birthYear;
    }
    public int get_birthMonth()
    {
        return birthMonth;
    }
    public int get_birthDay()
    {
        return birthDay;
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



public class OsztályDefiniálása {
    public static void main(String[] args) {
        
    }    
}
