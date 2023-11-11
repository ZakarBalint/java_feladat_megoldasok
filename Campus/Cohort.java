package Campus;

import java.util.ArrayList;

public class Cohort {
    public String Name;
    public ArrayList<Student> Students;
    public ArrayList<Mentor> Mentors;

    public void addStudent(Student _student)
    {
        this.Students.add(_student);
    }

    public void addMentor(Mentor _mentor)
    {
        this.Mentors.add(_mentor);
    }

    public void info()
    {
        System.out.println("The " + this.Name + " cohort has " +   this.Students.size() + " students and " + this.Mentors.size() + " mentors.");
    }

    public Cohort(String _name)
    {
        Name = _name;
        Students = new ArrayList<>();
        Mentors = new ArrayList<>();
    }
}
