package practice02;

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

    public String introduce() {
        return "My name is " + name + ". " +  "I am " +  age + " years old.";
    }
}