package practice11;

import java.util.ArrayList;

public class Klass {
    private Integer number;
    private Student leader;
    private ArrayList<Student> students;
    private Teacher teacher;

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

    public void assignTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void assignLeader(Student leader) {
        if (students.indexOf(leader) > -1) {
            this.leader = leader;
            if (teacher != null) {
                System.out.println("I am " + teacher.getName() + "." + " I know " + leader.getName() + " become Leader of Class " + number + ".");
            }
        } else {
            System.out.println("It is not one of us.");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void appendMember(Student student) {
        students.add(student);
        if (teacher != null) {
            System.out.println("I am " + teacher.getName() + "." + " I know " + student.getName() + " has joined Class " + number + ".");
        }
    }

    public boolean isIn(Student student) {
        return this == student.getKlass();
    }
}

