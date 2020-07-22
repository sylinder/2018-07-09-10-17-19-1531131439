package practice08;

public class Student extends Person{
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }


    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (klass.getLeader()!= null && (klass.getLeader().getId() == getId())) {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Student. I am Leader of " + getKlass().getDisplayName() + ".";
        }
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Student. I am at " + getKlass().getDisplayName() + ".";
    }
}