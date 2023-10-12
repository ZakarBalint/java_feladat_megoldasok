
class Date
{
    int year;
    int month;
    int day;

    public Date(int y, int m, int d)
    {
        if(isCorrectDate(year, month, day))
        {
            year = y;
            month = m;
            day = d;
        }
        else
        {
            System.out.println("Hibás adat!");
        }

        
    }

    public Date(int y, int m)
    {
        year = y;
        month = m;
        day = 1;
    }


    public boolean isCorrectDate(int year, int month, int day)
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
}

public class Konstruktor_2_feladat {
    public static void main(String[] args) {
        Date a = new Date(310, 12, 23);
        Date b = new Date(3000, 31, -1);
        Date c = new Date(901, 3);

        a.printDate();
        b.printDate();
        c.printDate();

    }
}
