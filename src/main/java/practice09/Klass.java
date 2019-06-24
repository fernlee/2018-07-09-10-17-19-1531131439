package practice09;

import java.util.ArrayList;

public class Klass {
    private Integer number;
    private Student leader;
    private ArrayList<Student> students;

    public Klass(Integer number) {
        this.number = number;
        this.students = new ArrayList<>();
    }

    public Integer getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student leader) {
        if (students.indexOf(leader) > -1) {
            this.leader = leader;
        } else {
            System.out.println("It is not one of us.");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        students.add(student);
    }
}
