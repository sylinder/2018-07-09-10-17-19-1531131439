package practice08;

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

//    public boolean equals(Person person) {
//        if (getId() != person.getId()) {
//            return false;
//        }
//        if (!getName().equals(person.getName())) {
//            return false;
//        }
//        if (getAge() != person.getAge()) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
