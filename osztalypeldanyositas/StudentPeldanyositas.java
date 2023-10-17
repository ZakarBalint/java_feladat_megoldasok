package osztalypeldanyositas;

class Student
{

    int id;
    String name;
    double cgpa;

    public Student(int _id, String _name, double _cgpa)
    {
        id = _id;
        name = _name;
        cgpa = _cgpa;
    }

    public int get_id()
    {
        return this.id;
    }

    public String get_name()
    {
        return this.name;
    }

    public double get_cgpa()
    {
        return this.cgpa;
    }

    public void set_cgpa(int[] grades)
    {
        int sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }

        this.cgpa = sum / grades.length;
    }

    @Override
    public String toString() {
        return String.format("Student: id: %d, name: %s, cgpa: %.2f", this.id, this.name, this.cgpa);
    }
}

public class StudentPeldanyositas {
    public static void main(String[] args) {
        
    }
}
