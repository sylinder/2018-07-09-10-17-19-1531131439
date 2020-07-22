package practice10;

import java.util.ArrayList;
import java.util.LinkedList;

public class Teacher extends Person{
    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public LinkedList<Klass> getKlass() {
        return classes;
    }

    public String introduce() {
        if (getKlass() == null) {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach No Class.";
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (Klass k : classes) {
            arrayList.add(k.getNumber());
        }
        for (int i = 0; i < arrayList.size() - 1; i++) {
            sb.append(arrayList.get(i) + ", ");
        }
        sb.append(arrayList.get(arrayList.size() - 1));
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach Class " + sb.toString() + ".";
    }

    public String introduceWith(Student student) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Klass klass: getClasses()) {
            arrayList.add(klass.getNumber());
        }
        for (int i : arrayList) {
            if (student.getKlass().getNumber() == i) {
                return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach " + student.getName() + ".";
            }
        }
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public boolean isTeaching(Student student) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Klass klass: getClasses()) {
            arrayList.add(klass.getNumber());
        }
        for (int i : arrayList) {
            if (student.getKlass().getNumber() == i) {
                return true;
            }
        }
        return false;
    }
}