
import java.text.DecimalFormat;
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
        Double A,B,C;
        A=input.nextDouble();
        B=input.nextDouble();
        C=input.nextDouble();
        if((Math.pow(B, 2)-4*A*C)<0||A==0){
            System.out.println("Impossivel calcular");
    } else{
            System.out.println("R1 = "+
                    new DecimalFormat("#0.00000").format((-B+Math.sqrt(Math.pow(B, 2)-4*A*C))/(2*A)));
            System.out.println("R2 = "+
                    new DecimalFormat("#0.00000").format((-B-Math.sqrt(Math.pow(B, 2)-4*A*C))/(2*A)));
        }
    }
    
}
