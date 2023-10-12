package konstruktorfeladatok;

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

    public void set_numberOfLegs(int newl)
    {
        numberOfLegs = newl;
    }
    public void set_numberOfEyes(int newe)
    {
        numberOfEyes = newe;
    }
    public void set_name(String newn)
    {
        name = newn;
    }
}

public class Konstruktor_3_feladat
{
    public static void main(String[] args) {
        
        Animal a = new Animal(4, 2, "bark");

        a.printAnimal();

        a.set_name("meow");
        a.set_numberOfEyes(2);
        a.set_numberOfLegs(4);

        a.printAnimal();
    }
}