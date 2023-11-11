package Campus;

public class Student extends Person {
    public String PreviousOrganization;
    public int SkippedDays;

    @Override
    public void getGoal()
    {
        System.out.println("My goal is: Be a junior software developer.");
    }

    @Override
    public void Introduce()
    {
        System.out.println("Hi, I'm " + this.Name +", a " + this.Age + " year old " + this.Gender +
            " from " + this.PreviousOrganization + " who skipped " + this.SkippedDays +" days from the course already.");
    }

    public void skipDays(int numberOfDays)
    {
        this.SkippedDays += numberOfDays;
    }

    public  Student(String _name, int _age, String _gender, String _previousOrganization)
    {
        Name = _name;
        Age = _age;
        Gender = _gender;
        PreviousOrganization = _previousOrganization;
        SkippedDays = 0;
    }

    public Student()
    {
        Name = "Jane Doe";
        Age = 30;
        Gender = "female";
        PreviousOrganization = "The School of Life";
        SkippedDays = 0;
    }
}
