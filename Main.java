package Grading_System;
import java.io.IOException;
import java.util.*;

import static Grading_System.Subjects_Data.*;
import static Grading_System.Activity_Data.*;
import static Grading_System.Training_Data.*;



/* ******************************************** MISTAKES  *******************************************
* 1. Jo saare subjects ki strings ka array banaya tha usko inititalize krna bhul gyi toh voh array null hai usko access krne par null pointer
     Exception aayega toh usko main method mai initialize karna hai yaad se
* 2.
*
 */



/*  *****************************************  THINGS TO ADD LATER ---->>>>>>>>>
 *1.  Authorization ki marks sirf teacher enter kar skte hai bacche sirf apna data dekh skte hai write nahi kr skte hai
 *2. Teachers ka login alag hoga
 *3. Students ka UI alag hoga
 *4. Saare semester ka ek saath result ek hi file mai /// Ya ek hi click mai sabka result show ho jana chahiye
  5. SceneController banana achhe se sikhna hai

 6. Jo bhi GUI ki classes hai unki deep study krni hai

 */

public class Main{


    public static void main(String[]args) throws IOException {


       Scanner sc = new Scanner(System.in);
        boolean running = true;

        initializeSubjects();

        while (running) {


            System.out.println("\n\t\t----------------- Student Grading System ----------------");
            System.out.println("\n\nChoose the options below : ");
            System.out.println("1. Enter Semester Marks");
            System.out.println("2. Display Marks for Semester");
            System.out.println("3. Add Activity");
            System.out.println("4. View Activities");
            System.out.println("5. Add Industrial Training");
            System.out.println("6. View Trainings");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");


            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch(choice)
            {
                case 1 : addSemesterMarks(sc);
                         break;

                case 2 :  generateReport(sc);
                         break;

                case 3 :  addActivity(sc);
                         break;

                case 4 : displayActivity();
                        break;

                case 5 : addTraining(sc);
                        break;

                case 6 : displayTraining();
                       break;

                case 0 : System.out.println("Exiting....");
                         running = false;
                         sc.close();
                         break;

                default : System.out.println("Incorrect chosen option !! Please try again  ");
            }
        }

        }

}



    
