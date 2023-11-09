package Campus;

public class Mentor extends Person {
    public String Level;

    @Override
    public void getGoal()
    {
        System.out.println("Educate brilliant junior software developers.");
    }

    @Override
    public void Introduce()
    {
        System.out.println("Hi, I'm " + this.Name + ", a " + this.Age + " year old " + this.Gender + ", " + this.Level + " mentor.");
    }

    public Mentor()
    {
        Name = "Jane Doe";
        Age = 30;
        Gender = "female";
        Level = "intermediate";
    }

    public Mentor(String _name, int _age, String _gender, String _level)
    {
        Name = _name;
        Age = _age;
        Gender = _gender;
        Level = _level;
    }
}
