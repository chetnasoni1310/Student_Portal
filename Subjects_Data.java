package Grading_System;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.FileWriter;

public class Subjects_Data {

    /***
     * Yaha mujhe add karna hai ki agar ek semester ke marks pehle se hi add ho chuke hai toh repeat na ho
     * Semester aur marks valid range mai ho vrna dobara loop lagega
     *
     */
    
                      //*******************Subjects**************** */

    private static final Map<Integer, String[]> semesterSubjects = new HashMap<>();
    private static final Map<Integer , Map<String , Integer>> semSubjectMarks = new HashMap<>();

    public static void initializeSubjects() {
        semesterSubjects.put(1, new String[]{"Maths", "Chemistry", "Mechanical", "Electrical", "English"});
        semesterSubjects.put(2, new String[]{"Physics", "C-Language", "Engineering Graphics", "Electronics", "Environmental"});
        semesterSubjects.put(3, new String[]{"DSA", "DE", "Discrete Mathematics", "OOP", "Computer Organization"});
        semesterSubjects.put(4, new String[]{"OS", "DBMS", "TOC", "SE", "MPI"});
        semesterSubjects.put(5, new String[]{"AOA", "Web Technologies", "Compiler Design", "Computer Networks", "AI"});
        semesterSubjects.put(6, new String[]{"Machine Learning", "Cloud Computing", "CS", "ISS", "DIP"});
        semesterSubjects.put(7, new String[]{"Blockchain Technology", "DevOps", "Elective I", "Project Phase I", "Seminar"});
        semesterSubjects.put(8, new String[]{"Project Phase II", "Comprehensive Exam"});
    }





    /**********************************************************************************************************************************/
    public static void addSemesterMarks( Scanner sc)
    {

        boolean isEntry = true;

        while (isEntry) {
            System.out.println("Enter the semester for which you have to enter marks : ");
            int semester = sc.nextInt();


            //Call the subjects of that semester
            String[] subjects = semesterSubjects.get(semester);

            Map<String, Integer> subjectMarks = new LinkedHashMap<>();

            /*
             * With LinkedHashMap, the order is preserved
             * This looks more neat, predictable, and user-friendly, especially when writing to a file
             * */

            for (String subject : subjects) {
                System.out.println("Enter the marks for " + subject + " : ");
                int marks = sc.nextInt();
                subjectMarks.put(subject, marks);
            }

            semSubjectMarks.put(semester, subjectMarks);

            System.out.println("Marks for " + semester + " semester added successfully !");

            System.out.println("Press 0 for stop adding or Press any key to continue : ");
            int isStop = sc.nextInt();
            if (isStop == 0) {
                isEntry = false;
            }
        }
    }





    /**********************************************************************************************************************************/
    private static double[] calculateCGPA(int semester,  Map<Integer , Map<String , Integer>> semSubjectMarks ) {

        double totalGrades = 0;

        //Uss semester ke subjects with their marks enter hogye hai subjectMarks mai
        Map<String , Integer> subjectMarks  = semSubjectMarks.get(semester);

       for(int marks : subjectMarks.values() )
       {
          totalGrades +=marks ;
       }

       int subjectCount = subjectMarks.size();
       double average = totalGrades / subjectCount ;
       double cgpa = average / 9.5 ;


       return new double[]{ (Math.round(cgpa * 100.0) / 100.0 )
                            , totalGrades  };
       // round off to 2 decimal places
    }





/**********************************************************************************************************************************/
    public static void generateReport(Scanner sc) throws IOException {

        System.out.println("Enter the semester for which you want report : ");
        int semester = sc.nextInt();

        double cgpa = calculateCGPA(semester , semSubjectMarks )[0];
        double totalMarks = calculateCGPA(semester , semSubjectMarks )[1];

        generateReport(semester , cgpa , totalMarks , semSubjectMarks);
    }

    private static void generateReport(int semester , double cgpa , double totalMarks ,  Map<Integer , Map<String , Integer>> semSubjectMarks ) throws IOException {

        String filename = semester+"_Semester_Report.txt";

        try(FileWriter filewriter = new FileWriter(filename))
        {
           filewriter.write("\t\tStudent Report Card \n");
           filewriter.write("\t-------------------------\n");
           filewriter.write("Semester: " + semester + "\n\n");


            filewriter.write("Subjects and Marks :- \n");
            Map<String , Integer > subjectMarks = semSubjectMarks.get(semester);


            for(Map.Entry<String , Integer> entry : subjectMarks.entrySet())
            {
                filewriter.write(entry.getKey()+" ---> "+ entry.getValue()+"\n");
            }


            filewriter.write("\n\nTotal Marks  --->"+totalMarks+"\n");
            filewriter.write("\n\nTotal CGPA  --->"+cgpa+"\n");


            String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
            filewriter.write("\nGenerated On : "+date+"\n");
        }
        catch(Exception e)
        {
            System.out.println("Error while writing the report !!!! \n" + e.getMessage() );
        }
    }






/**********************************************************************************************************************************/
}
