package practice09;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(Integer id, String name, Integer age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
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
