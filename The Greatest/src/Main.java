
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
        Scanner input=new Scanner(System.in);
        int a,b,c,big,Max;
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        big=(a+b+Math.abs(a-b))/2;
        Max=(big+c+Math.abs(big-c))/2;
        System.out.println(Max+" eh o maior");
        
        
        
    }
    
}
