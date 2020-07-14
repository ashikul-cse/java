package uriproblems;

import java.util.Scanner;

public class UriTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double A, R;
        
        R = input.nextDouble();
        A = 3.14159*R*R;
        
        System.out.printf("A=%.4f\n",A);
    }
}
