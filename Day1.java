import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner sc = new Scanner(System.in);
        int secondInteger;
        double secondDouble;
        String secondString;

        secondInteger = sc.nextInt();
        secondDouble = sc.nextDouble();
        sc.nextLine();
        secondString = sc.nextLine();
        System.out.println(i + secondInteger);
        System.out.println(d + secondDouble);
        System.out.println(s + secondString);
       
        sc.close();
