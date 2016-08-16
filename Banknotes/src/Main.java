
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emadahmed
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        int num,dig;
        num =input.nextInt();
        int hund=num/100;
        dig=num%100;
        int fif=dig/50;
        dig%=50;
        int twn=dig/20;
        dig%=20;
        int ten=dig/10;
        dig%=10;
        int five=dig/5;
        dig%=5;
        int two=dig/2;
        dig%=2;
        int one=dig/1;
        System.out.println(num);
        System.out.println(hund+" nota(s) de R$ 100,00");
        System.out.println(fif+" nota(s) de R$ 50,00");
        System.out.println(twn+" nota(s) de R$ 20,00");
        System.out.println(ten+" nota(s) de R$ 10,00");
        System.out.println(five+" nota(s) de R$ 5,00");
        System.out.println(two+" nota(s) de R$ 2,00");
        System.out.println(one+" nota(s) de R$ 1,00");
        
    }

}
