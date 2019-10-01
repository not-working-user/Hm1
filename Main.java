package com.company;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String[] names = new String[5];

        for(int a = 0; a < 5; a++)
        {
            names[a] = input.nextLine().toUpperCase();
        }
        System.out.println("Normal");
        for(int a = 0; a < 5; a++)
    {
        System.out.println(names[a] + "     ");
    }
        Arrays.sort(names, Collections.reverseOrder());
        System.out.println("Reverse");
        for(int a = 0; a < 5; a++)
        {
            System.out.println(names[a] + "     ");
        }
        System.out.println("Sorry i didn't find how sort names by alphabet, so i add things like: normal and reverse." +
                "If you want to know why i din't find that type of sort, dont ask me just look at name of my work.");
    }
}
