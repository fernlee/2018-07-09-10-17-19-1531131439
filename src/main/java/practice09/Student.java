package practice09;

public class Student extends Person{
    private Klass klass;

    public Student(Integer id, String name, Integer age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce(){
        return super.introduce() + " I am a Student. I am " + (this.equals(klass.getLeader()) ? "Leader of ": "at ") + klass.getDisplayName() + ".";
    }
}
