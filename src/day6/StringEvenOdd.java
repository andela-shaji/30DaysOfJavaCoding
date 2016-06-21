package day6;

import java.util.Scanner;

/**
 Sample Input

 2
 Hacker
 Rank

 Sample Output

 Hce akr
 Rn ak*/

public class StringEvenOdd {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());
        String[] str = new String[count];
        //String input = scan.nextLine();

        for (int i = 0; i < count; i++) {
            str[i] = scan.next();
        }
        for (int temp = 0; temp < count; temp++)
        {
            for (int j = 0; j < str[temp].length(); j = j + 2)
            {
                System.out.print(str[temp].charAt(j));
            }

            System.out.print(" ");

            for (int j = 1; j < str[temp].length() ; j = j + 2)
            {
                System.out.print(str[temp].charAt(j));
            }

            System.out.println();

        }





    }
}
