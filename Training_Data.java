package Grading_System;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Training_Data {
    
                          //*******************Industrial Training**************** */

private static final Map<Integer , String > training = new HashMap<>();




    /**********************************************************************************************************************************/
    public static void addTraining(Scanner sc)
    {
        //Taking input from user

      boolean isEntry = true;

      while(isEntry) {
      System.out.println("Enter the year : ");
      int year = sc.nextInt();
      sc.nextLine();
      System.out.println("Enter the training description : ");
      String description = sc.nextLine();


      //Putting in the map
      training.put(year, description);
      System.out.println("Training added successfully !!");

          System.out.println("Press 0 for stop adding or Press any key to continue : ");
          int isStop = sc.nextInt();
      if(isStop == 0) {
          isEntry = false;
      }
      }
    }




    /**********************************************************************************************************************************/
    public static void displayTraining()
    {
        if(training.isEmpty())
        {
            System.out.println("You have not done any training yet.\n" +
                    " Please record your Industrial Training first by pressing 5 \n"
            );
            return;
        }
        System.out.println("Training Details : ");
        for(Map.Entry<Integer , String> entry : training.entrySet())
        {
            System.out.println(entry.getKey()+" year : "+entry.getValue());
        }
    }




/**********************************************************************************************************************************/
}
