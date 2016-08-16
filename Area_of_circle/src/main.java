
import java.math.BigDecimal;
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
public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double P=3.14159;
        String R=new DecimalFormat("#0.00").format(input.nextDouble());
        double A=(Double.parseDouble(R)*Double.parseDouble(R)*P);
//        A=new BigDecimal(A).setScale(4,BigDecimal.ROUND_UP).doubleValue();
        System.out.println("A="+new DecimalFormat("#0.0000").format(A));
    }
    
}
