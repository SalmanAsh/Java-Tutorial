public class Student implements Comparable<Student> {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public boolean equals(Student other) {
        if (this.name == other.name) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        return 0;
    }
}
