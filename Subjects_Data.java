package Grading_System;

import java.util.Scanner;

public class Subjects_Data {

    
//*******************Subjects**************** */

    private double calculateCGPA(String[] subjects, Scanner sc) {
        double totalGrades = 0;
    
        System.out.println("Enter your marks for the subjects:");
        for (String subject : subjects) {
            System.out.print(subject + ": ");
            int marks = sc.nextInt();
            totalGrades += marks / 10.0;
        }
    
        return totalGrades / subjects.length;
    }


    private double FirstSem(int semester , Scanner sc)
    {
        String[] subjects = { "Maths", "Chemistry", "Mechanical", "Electrical", "English" };
        return calculateCGPA(subjects, sc);
    }

    private double SecondSem(int semester , Scanner sc)
    {
        String[] subjects = { "Physics", "C", "Engineering Graphics", "Electronics", "EnvS" };

        return calculateCGPA(subjects, sc);
    }

    private double ThirdSem(int semester , Scanner sc)
    {
        String[] subjects = {"DSA", "DE", "Discrete Mathematics", "OOP", "Computer Organization" }
        ;
        return calculateCGPA(subjects, sc);
    }
   

    private double FourthSem(int semester, Scanner sc) {
        String[] subjects = { "OS", "DBMS", "TOC", "SE", "MPI" };
        return calculateCGPA(subjects, sc);
    }
    
    private double FifthSem(int semester, Scanner sc) {
        String[] subjects = { "AOA", "Web Technologies", "Compiler Design", "Computer Networks", "AI" };
        return calculateCGPA(subjects, sc);
    }
    
    private double SixthSem(int semester, Scanner sc) {
        String[] subjects = { "Machine Learning", "Cloud Computing", "CS", "ISS ", "DIP" };
        return calculateCGPA(subjects, sc);
    }
    
    private double SeventhSem(int semester, Scanner sc) {
        String[] subjects = { "Blockchain Technology", "DevOps", "Elective I", "Project Phase I", "Seminar" };
        return calculateCGPA(subjects, sc);
    }
    
    private double EighthSem(int semester, Scanner sc) {
        String[] subjects = { "Project Phase II", "Comprehensive Exam" };
        return calculateCGPA(subjects, sc);
    }



}
