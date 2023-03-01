package chapter_01.projects.p_1_29;

/*
The birthday paradox says that the probability that two people in a room will
have the same birthday is more than half, provided n, the number of people in the
room, is more than 23. This property is not really a paradox, but many people
find it surprising. Design a Java program that can test this paradox by a series
of experiments on randomly generated birthdays, which test this paradox for n =
5, 10, 15, 20, . . ., 100.
 */

import java.util.Random;

public class Solution {

    public static final int DAYS_OF_YEAR = 365;

    public static void main(String[] args) {
        int numOfPeople = 5;

        //DOB array
        int[] birthday = new int[DAYS_OF_YEAR];


        //Creates an array that represents 365 days
        for (int i = 0; i < birthday.length; i++)
            birthday[i] = i + 1;

        //Random Number generator
        Random randNum = new Random();

        int iteration = 1;

        //iterates around peopleBirthday array
        while (numOfPeople <= 100)
        {
            System.out.println("Iteration: " + iteration);
            System.out.println();

            //Creates array to hold peoples birthday
            int[] peopleBirthday = new int[numOfPeople];


            //Assigns people DOB to people in the room
            for (int i = 0; i < peopleBirthday.length; i++)
            {
                int day = randNum.nextInt(DAYS_OF_YEAR);
                peopleBirthday[i] = birthday[day];


            }
            for (int i = 0; i < peopleBirthday.length; i++)
            {


                //stores value for element before and after
                int person1 = peopleBirthday[i];
                int person2 = i + 1;

                //Checks if people have same birthday
                for (int j = person2; j < peopleBirthday.length; j++)
                {


                    //Prints matching Birthday days
                    if (person1 == peopleBirthday[j])
                    {
                        System.out.println("P1: " + person1 + " P2: " + peopleBirthday[j]);
                        System.out.println("Match!!! \n");

                    }
                }
            }


            //Increments the number of people in the room
            numOfPeople += 5;
            iteration++;
        }

    }
}
