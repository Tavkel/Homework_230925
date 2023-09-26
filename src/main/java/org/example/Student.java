package org.example;

import java.util.Objects;

public class Student {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return this.age == student.getAge()
                && Objects.equals(this.name, student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.age, this.name);
    }
}