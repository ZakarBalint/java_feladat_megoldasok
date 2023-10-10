class Person
{
    String firstname;
    String lastname;
    int birthYear;
    int birthMonth;
    int birthDay;

    public Person()
    {
        firstname = "";
        lastname = "";
        birthYear = 0;
        birthMonth = 0;
        birthDay = 0;
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

class Date
{
    int year;
    int month;
    int day;

    public Date()
    {
        year = 0;
        month = 1;
        day = 1;
    }

    public Date(int y, int m, int d)
    {
        year = y;
        month = m;
        day = d;
    }

    public boolean isCorrectDate()
    {
        if(month >= 1 && month <= 12)
        {
            if(month == 2)
            {   
                if(year % 4 == 0 && year % 100 != 0 && year % 400 != 0)
                {
                    if(day >= 1 && day <= 29)
                    {
                        return true;
                    }
                    else
                    {
                        return false;                       
                    }
                }
                else
                {
                    if(day >= 1 && day <= 28)
                    {
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }
            }
            else if(month == 1 || month == 3 || month == 5 || month == 7 
                || month == 8 || month == 10|| month == 12)
            {
                if(day >= 1 && day <= 31)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else if(month == 4 || month == 6 || month == 9 || month == 11)
            {
                if(day >= 1 && day <= 30)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        else
        {
            return false;
        }    
        
        return false;
    }

    public void printDate()
    {
        System.out.println(year + "." + month + "." + day + ".");
    }

    public int get_year()
    {
        return year;
    }
    public int get_month()
    {
        return month;
    }
    public int get_day()
    {
        return day;
    }

    public void set_year(int newYear)
    {
        year = newYear;
    }
    public void set_month(int newMonth)
    {
        month = newMonth;
    }
    public void set_day(int newDay)
    {
        day = newDay;
    }
}

class Animal
{
    int numberOfLegs;
    int numberOfEyes;
    String name;

    public Animal()
    {
        numberOfLegs = 0;
        numberOfEyes = 0;
        name = "";
    }

    public Animal(int legs, int eyes, String n)
    {
        numberOfLegs = legs;
        numberOfEyes = eyes;
        name = n;
    }

    public void printAnimal()
    {
        System.out.println(name + ", lábai száma: " + numberOfLegs + ", szemek száma: " + numberOfEyes);
    }

    public int get_numberOfLegs()
    {
        return numberOfLegs;
    }
    public int get_numberOfEyes()
    {
        return numberOfEyes;
    }
    public String get_name()
    {
        return name;
    }

    public void set_numberOfLegs(int newe)
    {
        numberOfLegs = newe;
    }
    public void set_numberOfEyes(int newe)
    {
        numberOfEyes = newe;
    }
    public void set_name(String newe)
    {
        name = newe;
    }
}

public class OsztályDefiniálása {
    public static void main(String[] args) {

    }    
}
