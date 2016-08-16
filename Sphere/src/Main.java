
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
        double PI=3.14159;
        int R;
        R=input.nextInt();
        double size=(4/3.0)*PI*Math.pow(R, 3.0);
        System.out.println("VOLUME = "+
                new DecimalFormat("#0.000").format(size));
    }
    
}
