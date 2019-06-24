package practice07;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, Integer age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, Integer age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Teacher. I teach " + (klass != null ? klass.getDisplayName() : "No Class") + ".";
    }

    public String introduceWith(Student student) {
        return super.introduce() + " I am a Teacher. " + (student.getKlass().getNumber() == klass.getNumber() ? "I teach " : "I don't teach ") + student.getName()+".";
    }
}
