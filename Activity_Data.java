package Grading_System;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Activity_Data {
                         //*******************ACTIVITIES**************** */
public Map<String, String> Activities(Scanner sc)
{
    System.out.println("Enter your activities which you have performed : ")
   ;

   String[] activities = { "presentation", "research", "photoGraphyClub", "danceClub" };
   Map<String, String> participationMap = new HashMap<>();

   
   for (String activity : activities) {
       System.out.print("Did you participate in " + activity + "? (yes/no): ");
       String response = sc.nextLine().trim().toLowerCase();
       participationMap.put(activity, response);
   }
  return participationMap;

}
public static void activityDisplay(Map<String, String> participationMap) {
    System.out.println("\n📋 Participation Summary:");
    for (Map.Entry<String, String> entry : participationMap.entrySet()) {
        String activity = entry.getKey();
        String participated = entry.getValue();
        System.out.println(activity + ": " + participated);
    }
}
 


            
}
