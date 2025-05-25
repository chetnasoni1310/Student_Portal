package Grading_System;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Activity_Data {

                         //*******************ACTIVITIES**************** */

  private static final  Map<String, String> activity = new HashMap<>();



    /**********************************************************************************************************************************/
public static void addActivity(Scanner sc) {
    System.out.println("Enter your activities which you have performed : ");
    boolean isEntry = true;

    while (isEntry) {
        System.out.println("Enter the activity name : ");
        String activityName = sc.nextLine();
        System.out.println("Enter the activity description : ");
        String activityDescription = sc.nextLine();

        activity.put(activityName, activityDescription);

        System.out.println("Activity added successfully !!");

        System.out.println("Press 0 for stop adding or Press any key to continue : ");

        int isStop = sc.nextInt();
        if (isStop == 0) {
            isEntry = false;
        }
    }
}




    /**********************************************************************************************************************************/

    public static void displayActivity()
    {
        if(activity.isEmpty())
        {
            System.out.println("You have not participated in any activity yet.\n" +
                    " Please record your Activities first by pressing 3 \n"
            );
            return;
        }

        System.out.println("Your activities : ");
        for(Map.Entry<String , String> entry : activity.entrySet())
        {
           System.out.println(entry.getKey() + " : "+entry.getValue());
        }
    }





/**********************************************************************************************************************************/
}
