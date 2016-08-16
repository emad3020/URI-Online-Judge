
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
        float num1,num2,num3;
        num1=input.nextFloat();
        num2=input.nextFloat();
        num3=input.nextFloat();
        if(num1>=0.0&&num1<=10.0
                ||num2>=0.0&&num2<=10.0||num3>=0.0&&num3<=10.0){
            float avg= (float)( (((2)*num1)+((3)*num2)+(5*num3))/10.0);
            System.out.println("MEDIA = "+new DecimalFormat("#0.0").format(avg));
        }
        
    }
    
}
