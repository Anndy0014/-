package Aiwa.Test;

import java.util.Scanner;

/**
 * Demo1
 */
public class Demo1 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int m =sc.nextInt();
        int p  =sc.nextInt();
        int kg;
        int count;
        int result;
        count=m*(p*(80/100));
        kg=m-count;
        result=count*kg;
        System.out.println(result);
        
    }
}