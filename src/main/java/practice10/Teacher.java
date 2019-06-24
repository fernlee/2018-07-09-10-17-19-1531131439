package practice10;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private LinkedList<Klass> classes;

    public Teacher(Integer id, String name, Integer age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Teacher. I teach " + (classes != null && classes.size() != 0 ? "Class " + printClasses() : "No Class") + ".";
    }

    private String printClasses() {
        return classes.stream()
                .map(n -> n.getNumber().toString())
                .collect(Collectors.joining(", "));
    }

    public String introduceWith(Student student) {
        return super.introduce() + " I am a Teacher. " + (this.isTeaching(student) ? "I teach " : "I don't teach ") + student.getName() + ".";
    }

    public boolean isTeaching(Student student) {
        return classes.stream().anyMatch(klass -> klass.isIn(student));
    }
}
