package switchnumber;

import java.util.Scanner;

public class SwitchNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NumA = ");
        int numA = scanner.nextInt();
        System.out.println("NumB = ");
        int numB = scanner.nextInt();
        switching(numA, numB);
    }
    
    public static void switching(int numA, int numB) {
        int aux;
        aux = numA;
        numA = numB;
        numB = aux;
        
        System.out.println("NumA = " + numA);
        System.out.println("NumB = " + numB);
    }
    
}
