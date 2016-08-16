
package Attar;
import java.util.Scanner;


public class Task51 {

    
    public static void main(String[] args) {
        int N;
        Scanner input = new Scanner (System.in);
        N = input.nextInt();
        if (N > 0 && N < 1000000)
	{
	   System.out.println(N);
	   System.out.print(N/100); System.out.println(" nota(s) de R$ 100,00"); 
	   System.out.print((N%100)/50); System.out.println(" nota(s) de R$ 50,00");
	   System.out.print(((N%100)%50)/20); System.out.println(" nota(s) de R$ 20,00");
           System.out.print((((N%100)%50)%20)/10); System.out.println(" nota(s) de R$ 10,00");
           System.out.print(((((N%100)%50)%20)%10)/5); System.out.println(" nota(s) de R$ 5,00");
           System.out.print((((((N%100)%50)%20)%10)%5)/2); System.out.println(" nota(s) de R$ 2,00");
           System.out.print(((((((N%100)%50)%20)%10)%5)%2)/1); System.out.print(" nota(s) de R$ 1,00");
	}
    }
    
}
