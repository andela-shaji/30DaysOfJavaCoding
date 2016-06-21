package day5;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i = 1; i < 11; i++) {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
    }
}
