
package yildizlarlaucgen;
import java.util.Scanner;
public class Yildizlarlaucgen {

    public static void main(String[] args) {
    Scanner Scan = new Scanner(System.in);
    
        System.out.println("basamak sayisini giriniz: ");
        int n = Scan.nextInt();
        
        for (int i = 0; i <= n; i++){
            for(int j = 0; j<=(n-i); j++){
               System.out.print(" "); 
            }
            for (int k = 1; k<=(2*i+1); k++){
                System.out.print("*");
            }
          System.out.println(" ");    
        }
       for (int i = n - 1; i >= 0; i--) {
    
    for (int j = 0; j <= (n - i); j++) { 
        System.out.print(" ");
    }
    
    for (int k = 1; k <= (2 * i + 1); k++) { 
        System.out.print("*");
    }
    System.out.println();
}
           
    }
    
}
