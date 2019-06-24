package practice06;

public class Teacher extends Person{
    private Integer klass;

    public Teacher(String name, Integer age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }
    public Teacher(String name, Integer age) {
        super(name, age);
    }

    public Integer getKlass() {
        return klass;
    }

    @Override
    public String introduce(){
        return super.introduce() + " I am a Teacher. I teach " + (klass != null ? "Class " + klass : "No Class") + ".";
    }
}
