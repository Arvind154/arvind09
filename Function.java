import java.util.Scanner;
public class Function {
    
    // n number of  factorial;
    
    
    // public static void printFactorial (int n) {
    //     int fact = 1;
    //     for (int i = 1; i <= n; i++) {
    //         fact *= i;
    //     }
    //     System.out.println(fact);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     printFactorial(n);
      
//   Calculate the product of two numbers
// public static void printCalculateProduct(int a, int b) {
//     int product = a * b;
//     System.out.println(product);
//     return;
// }

//         public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         printCalculateProduct(a, b);
//         }



//    to check if a number is prime or not

public static boolean isPrime(int n) {
    if (n <= 1) 
        return false; // Not prime
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return true; // Not prime
        } if ( n % 2 == 0) {
            return false; // Not prime
        }
    }
    
    }
}
           public static void main(String[] args) {
        
       }
//     
}
