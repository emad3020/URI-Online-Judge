
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
        float num1,num2;
        num1=input.nextFloat();
        num2=input.nextFloat();
        if(num1>=0.0&&num1<=10.0
                ||num2>=0.0&&num2<=10.0){
            float avg= (float)( (((3.5)*num1)+((7.5)*num2))/11.0);
            System.out.println("MEDIA = "+new DecimalFormat("#0.00000").format(avg));
        }
        
    }
    
}
