package Campus;

abstract class Person {
    public String Name;
    public int Age;
    public String Gender;


    public void getGoal()
    {
        System.out.println("My goal is: Live for the moment!");
    }

    public void Introduce()
    {
        System.out.println("Hi, I'm " + this.Name + ", a " + this.Age + " year old " + this.Gender + ".");
    }

    public Person()
    {
        Name = "Jane Doe";
        Age = 30;
        Gender = "female";
    }

    public Person(String _name, int _age, String _gender)
    {
        Name = _name;
        Age = _age;
        Gender = _gender;
    }
}
