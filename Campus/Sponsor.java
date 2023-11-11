package Campus;

public class Sponsor extends Person {
    public String Company;
    public int HiredStudents;

    @Override
    public void Introduce()
    {
        System.out.println("Hi, I'm " + this.Name + ", a " + this.Age + " year old " + this.Gender + 
            "who represents " + this.Company +" and hired " + this.HiredStudents + "students so far.");
    }

    public void hire()
    {
        this.HiredStudents++;
    }

    @Override
    public void getGoal()
    {
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }

    public Sponsor()
    {
        Name = "Jane Doe";
        Age = 30;
        Gender = "female";
        Company = "Google";
        HiredStudents = 0;
    }

    public Sponsor(String _name, int _age, String _gender, String _company)
    {
        Name = _name;
        Age = _age;
        Gender = _gender;
        Company = _company;
        HiredStudents = 0;
    }
}
