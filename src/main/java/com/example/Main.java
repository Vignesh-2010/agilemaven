package com.example;

import java.util.*;

public class Main {

    static class Student {
        String name;
        double cat, assignment, fat;

        Student(String name, double cat, double assignment, double fat) {
            this.name = name;
            this.cat = cat;
            this.assignment = assignment;
            this.fat = fat;
        }

        double getTotal() {
            return cat + assignment + fat;
        }

        double getGPA() {
            double total = getTotal();
            if (total >= 90) return 10;
            else if (total >= 80) return 9;
            else if (total >= 70) return 8;
            else if (total >= 60) return 7;
            else if (total >= 50) return 6;
            else return 5;
        }

        String getGrade() {
            double gpa = getGPA();
            if (gpa >= 9) return "A";
            else if (gpa >= 8) return "B";
            else if (gpa >= 7) return "C";
            else if (gpa >= 6) return "D";
            else return "F";
        }
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 25, 18, 40));
        students.add(new Student("Bob", 20, 15, 35));
        students.add(new Student("Charlie", 28, 19, 45));
        students.add(new Student("David", 22, 16, 38));
        students.add(new Student("Eva", 30, 20, 48));

        students.sort((a, b) -> Double.compare(b.getGPA(), a.getGPA()));

        System.out.println("Student Performance Report\n");

        for (Student s : students) {
            System.out.println(
                s.name +
                " | Total: " + s.getTotal() +
                " | GPA: " + s.getGPA() +
                " | Grade: " + s.getGrade()
            );
        }

        System.out.println("\nTop Performer:");
        Student topper = students.get(0);
        System.out.println(topper.name + " with GPA: " + topper.getGPA());
    }
}