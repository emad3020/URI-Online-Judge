
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
        String name;
        double salary,sold;
        name=input.nextLine();
        salary=input.nextDouble();
        sold=input.nextDouble();
        System.out.println("TOTAL = R$ "+
                new DecimalFormat("#0.00").format(salary+(sold*.15)));
     
    }
    
}
