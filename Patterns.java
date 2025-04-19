import java.util.*;
public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the A : ");
        //int a  = sc.nextInt();
        // System.out.print("Enter the B : ");
        // int b = sc.nextInt();
        
        
        
        // for (int i=1; i<=a; i++) {     *****
        //     for(int j=1; j<=b; j++) {  *****
        //         System.out.print("* ");*****
        //     }                           ***** 
        //     System.out.println();
        // }

        // for(int i=0; i<a; i++) {
        //     for (int j=0; j<b; j++) {
        //         if (i == 0 || i == a - 1 || j == 0 || j == b - 1) {
        //             System.out.print("* "); //Single space
        //         } else {
        //             System.out.print("  ");  // duble space
        //         }
        //     }
        //     System.out.println();
        // }

        // for (int i=a; i>=1; i--) {
        //     for (int j=1; j<i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j=0; j<=a-i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for (int i=1; i<=a; i++) {        *
        //     for(int j=1; j<=i; j++) {     **
        //         System.out.print("*");    ***
        //     }                             ****
        //     System.out.println();         *****
        // }

        // for(int i=a; i>=1; i--) {        ****
        //     for(int j=1; j<=i; j++) {    ***
        //         System.out.print("*");   **
        //     }                            *
        //     System.out.println();
        // }

        // for(int i=a; i>=1; i--) {
        //     for(int j=1; j<i; j++) {             *
        //         System.out.print(" ");          **
        //     }                                  ***
        //     for(int j=0; j<=a-i; j++) {       ****
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=a; i>=1; i--) {       // change i=1; i<=a; i++ second loop does not change  1
        //     for(int j=1; j<=i; j++) {           // 12345                                        12
        //         System.out.print(j);            // 1234                                         123
        //     }                                    //123                                          1234
        //     System.out.println();                //12                                           12345
        // } 
        
        //   int b = 1;
        // for(int i=a; i>=1; i--) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(b + " ");
        //         b++;
        //     }
        //     System.out.println();
        // }
            
        // for(int i=1; i<=a; i++) {                    //1
        //     for(int j=1; j<=i; j++) {                //01          
        //         if((i+j) % 2 == 0) {                 //101
        //             System.out.print(1+ " ");        //0101
        //         } else {
        //             System.out.print(0+ " ");
        //         }
        //     }
        //     System.out.println();
        // }
        

        // for(int i=8; i>=1; i--) {               //          1
        //     for(int j=1; j<=i; j++) {           //         1 1
        //         System.out.print(" ");        //        1 1 1
        //     }                                   //       1 1 1 1
        //     for(int j=1; j<=8-i; j++) {
        //         System.out.print(1 + " ");
        //     }
        //     System.out.println();
        // }



        // int n = 1;
        // for(int i=5; i>=1; i--) {                   //      1
        //     for(int j=1; j<=i; j++) {               //     2 3
        //         System.out.print(" ");            //    4 5 6
        //     }                                       //   7 8 9 10
        //     for(int j=1; j<=5-i; j++) {
        //         System.out.print(n++ + " ");
        //     }
        //     System.out.println();
        // }


       // int n = 1;
        // for(int i=1; i<=5; i++) {                   //      1
        //     for(int j=5; j>i; j--) {                //     2 2
        //         System.out.print(" ");            //    3 3 3
        //     }                                       //   4 4 4 4
        //     for(int k=1; k<=i; k++) {
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }

        for(int i=1; i<=5; i++) {                   //      1
            for(int j=5; j>i; j--) {                //     2 2
                System.out.print(" ");            //    3 3 3
            }                                       //   4 4 4 4
            for(int k=1; k<=i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
