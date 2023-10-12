package osztalypeldanyositas;

class Person
{
    String name;
    int age;
    String gender;

    public Person(String n, int a, String g)
    {
        name = n;
        age = a;
        gender = g;
    }

    public void getGoal()
    {
        System.out.println("My goal is: Live for the moment!");
    }

    public void  introduce()
    {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + ".");
    }
}

public class Person2 {
    public static void main(String[] args) {
        
        Person szemely = new Person("Jane Doe", 30, "female");

        szemely.introduce();
        szemely.getGoal();
    }
}
