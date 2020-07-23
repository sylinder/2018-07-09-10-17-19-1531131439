package practice09;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String introduce() {
        return "My name is " + getName() + ". I am " + getAge() + " years old.";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return  false;
        }
        Person person = (Person) obj;
        if (getId() != person.getId()) {
            return false;
        }
        if (!getName().equals(person.getName())) {
            return false;
        }
        if (getAge() != person.getAge()) {
            return false;
        }
        return true;
    }
}
