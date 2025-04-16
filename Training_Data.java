package Grading_System;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Training_Data {
    
                          //*******************Industrial Training**************** */
public  Map<Integer , String > IndustrialTraining(Scanner sc)
{
    System.out.println("Enter your Training Details : ");
    Map<Integer , String > training = new HashMap<>();
    for(int i=1;i<5;i++)
    {
        System.out.println("Have you participated in Training after "+i+" year(true/false) : ");
        Boolean isPart = sc.nextBoolean();

        if(isPart)
        {
            System.out.println("Enter your domain : ");
            String domain = sc.nextLine();
            training.put(i , domain);
        }
        else
        {
            training.put(i , "Not Done");
        }
      
    }
    return training;
}            
public static void trainingDisplay(Map<Integer, String> training) {
    System.out.println(" Participation Summary:");
    for (Map.Entry<Integer, String> entry : training.entrySet()) {
        Integer year = entry.getKey();
        String participated = entry.getValue();
        System.out.println(year + ": " + participated);
    }
}

}
