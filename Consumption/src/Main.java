
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
        int X;
        double Y;
        X=input.nextInt();
        Y=input.nextDouble();
        System.out.println(new DecimalFormat("#0.000").format(X/Y)+
                " km/l");
    }
    
}
