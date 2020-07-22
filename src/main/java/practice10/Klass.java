package practice10;

public class Klass {
    private int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void assignLeader(Student student) {
        if (student.getKlass().getNumber() != getNumber()) {
            System.out.printf("It is not one of us.\n");
            return ;
        }
        this.leader = student;
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        student.setKlass(this);
    }

    public String getDisplayName() {
        return "Class " + number;
    }
}
