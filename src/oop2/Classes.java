package oop2;

public class Classes {
    private CanFacebookInterface students[] = new CanFacebookInterface[10];
    private int counter = 0;

    public int getCounter() {
        return this.counter;
    }

    public void addStudent(CanFacebookInterface student) {
        students[this.counter++] = student;
    }

    public void start(CanFacebookInterface... students) {
        for(int i=0; i<students.length; i++) {
            addStudent(students[i]);
        }
        for(int i=0; i<counter; i++) {
            students[i].writeComments(); // polimorfizm
        }
    }

    public void doTheHomework(CanLearnJavaInterface student) {
        student.learnJava(); // polimorfizm
        System.out.println("Doing the homework");
    }
}
