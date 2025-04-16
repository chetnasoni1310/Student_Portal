package Grading_System;
import java.util.*;

public class Main{

    public static void main(String[]args)
    {
       Scanner sc = new Scanner(System.in);
       String exit = "N"; 

       while(exit == "N")
       {
       System.out.println("Press M for Marks Entry : ");
       System.out.println("Press A for Activities Entry : ");
       System.out.println("Press T for Training Entry : ");
       System.out.println("Press 1 for Marks Display : ");
       System.out.println("Press 2 for Activities Display : ");
       System.out.println("Press 3 for Training Display : ");
       System.out.println("Press E for exit");
       String option = sc.next().toUpperCase();

       if(option == "E")
       {
        break;
       }

       switch(option) 
       {
        case "M" : marksEntry();
                    break;
        case "A" : activityEntry();
                    break;
        case "T" : trainingEntry();
                    break;
        case "1" : marksDisplay();
                    break;
        case "2" : activityDisplay();
                    break;
        case "3" : trainingDisplay();
                   break;           
        default : System.out.println("Wrong input ! Please try again ...");
                  option = sc.next().toUpperCase();
       }
    }
      
    } 

}



    
