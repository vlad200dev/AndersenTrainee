package task_5;

import java.util.Objects;

public class Student implements Human {
    private String name;
    private String surname;
    private int age;
    private int studentId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                studentId == student.studentId &&
                course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, studentId, course);
    }

    private int course;

    public Student(String name, String surname, int age, int studentId, int course) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.studentId = studentId;
        this.course = course;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", studentId=" + studentId +
                ", course=" + course +
                '}';
    }

    @Override
    public void study() {
        System.out.println("Учиться");
    }
}
