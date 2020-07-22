package practice09;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (getKlass() == null) {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach No Class.";
        }
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach " + getKlass().getDisplayName() + ".";
    }

    public String introduceWith(Student student) {
        if (student.getKlass().getNumber() == getKlass().getNumber()) {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach " + student.getName() + ".";
        } else {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }
}