package Campus;

import java.util.Collections;
import java.util.List;

public class Cohort {
    public String Name;
    public List<Student> Students;
    public List<Mentor> Mentors;

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
        System.out.println("The " + this.Name + "cohort has" +   this.Students.size() + " students and " + this.Mentors.size() + " mentors.");
    }

    public Cohort(String _name)
    {
        Name = _name;
        Students = Collections.emptyList();
        Mentors = Collections.emptyList();
    }
}
