
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
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int emply_number,Hours;
        emply_number=input.nextInt();
        Hours=input.nextInt();
        String salary_per_hour=new DecimalFormat("#0.00").format(input.nextDouble());
        float ss=Float.parseFloat(salary_per_hour)*Hours;
        System.out.println("NUMBER = "+emply_number);
        System.out.println("SALARY = U$ "+new DecimalFormat("#0.00").format(ss));
    }
    
}
