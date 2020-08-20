package oddnumbers;
public class OddNumbers {
    public static void main(String[] args) {
        System.out.println("Odd numbers between 0 - 30:");
        for(int i = 0; i < 30; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
        
        System.out.println("Multiplication of even numbers between 0 - 30:");
        long mult = 1;
        for(int i = 1; i < 30; i++) {
            if(i % 2 == 0) {
                mult *= i;
            }
        }
        System.out.println(mult);
    }
    
}
