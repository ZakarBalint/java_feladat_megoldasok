package Campus;

public class Campus {
    public static void main(String[] args) {

        Person P1 = new Person("Mark", 46, "male"){};
        P1.Introduce();
        P1.getGoal();

        Person P2 = new Person() {};
        P2.Introduce();
        P2.getGoal();

        Student St1 = new Student("John Doe", 20, "male", "BME");
        St1.Introduce();
        St1.getGoal();

        Student St2 = new Student();
        St2.Introduce();
        St2.getGoal();

        Mentor M1 = new Mentor("Gandhi", 148, "male", "senior mentor");
        M1.Introduce();
        M1.getGoal();

        Mentor M2 = new Mentor();
        M2.Introduce();
        M2.getGoal();

        Sponsor Sp1 = new Sponsor();
        Sp1.hire();
        Sp1.hire();
        Sp1.hire();
        Sp1.Introduce();
        Sp1.getGoal();

        Sponsor Sp2 = new Sponsor("Elon Musk", 46, "male", "SpaceX");
        Sp2.hire();
        Sp2.hire();
        Sp2.hire();
        Sp2.hire();
        Sp2.hire();
        Sp2.Introduce();
        Sp2.getGoal();

        Cohort C1 = new Cohort("AWESOME");
        
        C1.addMentor(M1);
        C1.addMentor(M2);
        C1.addStudent(St1);
        C1.addStudent(St2);
        
        C1.info();
    }
}
