import java.util.Arrays;
import java.util.Comparator;

//class Student implements Comparable<Student> {
  class Student{
    String id, name;
    Double cgpa;

    public Student(String id, String name, Double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "{" + " id='" + this.id+ "'" + ", name='" + this.name + "'" + ", cgpa='" + this.cgpa + "'" + "}";
    }

    // @Override
    // public int compareTo(Student o) {
    //     return this.cgpa.compareTo(o.cgpa);
    // }

}
class cpgecom implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

class Test{
    public static void main(String[] args) {
        Student[] stu={
            new Student("1", "yash", 2.6),
            new Student("2", "ayash4", 4.6),
            new Student("22", "eya44sh", 3.6),
            new Student("10", "qya4sh", 1.6)
        };

        System.out.println(Arrays.toString(stu));
        Arrays.sort(stu,new cpgecom());
        System.out.println(Arrays.toString(stu));
    }
}