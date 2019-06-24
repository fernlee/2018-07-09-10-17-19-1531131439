package practice04;

public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    protected String basicIntroduce() {
        return "My name is " + name + ". " +  "I am " +  age + " years old.";
    }

    public String introduce() {
        return basicIntroduce();
    }
}