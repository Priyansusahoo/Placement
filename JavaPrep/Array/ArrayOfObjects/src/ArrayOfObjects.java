public class ArrayOfObjects {
    public static void main(String[] args) {

        Student s1 = new Student("Priyansu", 101);
        Student s2 = new Student("Jewel", 102);
        Student s3 = new Student("Deepshikha", 103);

//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);

        //Array of Reference
        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        //Student s pickup all the elements from student
        for(Student s : students){
            System.out.println(s);
        }
    }
}
class Student{
    String sname;
    int roll;

    public Student(String sname, int roll) {
        this.sname = sname;
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", roll=" + roll +
                '}';
    }
}
