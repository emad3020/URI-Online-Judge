
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header. choose License Headers in Project Properties.
 * To change this template file. choose Tools | Templates
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
        Scanner input = new Scanner(System.in);
        double num,dig;
        num = input.nextDouble();
        int hund = (int) (num / 100);
        dig =  (num % 100);
        
        int fif = (int) (dig / 50);
        dig %= 50;
        int twn = (int) (dig / 20);
        dig %= 20;
        int ten = (int) (dig / 10);
        dig %= 10;
        int five = (int) (dig / 5);
        dig %= 5;
        int two = (int) (dig / 2);
        dig %= 2;
        int one = (int) (dig / 1);
        double dig2 = dig % 1;
        
        int x1 = (int) (dig2 / 0.50);
        dig2 %= .50;
        int x2 = (int) (dig2 / .25);
        dig2 %= .25;
        int x3 = (int) (dig2 / .10);
        dig2 %= .10;
        int x4 = (int) (dig2 / .05);
        dig2 %= .05;
//        new DecimalFormat("#0.00").format(dig2);
        int x5 = (int) ( dig2/ .01);
        System.out.println("NOTAS:");
        System.out.println(hund + " nota(s) de R$ 100.00");
        System.out.println(fif + " nota(s) de R$ 50.00");
        System.out.println(twn + " nota(s) de R$ 20.00");
        System.out.println(ten + " nota(s) de R$ 10.00");
        System.out.println(five + " nota(s) de R$ 5.00");
        System.out.println(two + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(one + " moeda(s) de R$ 1.00");
        System.out.println(x1 + " moeda(s) de R$ 0.50");
        System.out.println(x2 + " moeda(s) de R$ 0.25");
        System.out.println(x3 + " moeda(s) de R$ 0.10");
        System.out.println(x4 + " moeda(s) de R$ 0.05");
        System.out.println(x5 + " moeda(s) de R$ 0.01");

    }

}
