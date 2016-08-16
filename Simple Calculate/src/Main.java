
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
        int []prod1,prod2;
        prod1=new int[2];
        prod2=new int[2];
        String price1="",price2="";
       for(int i=0;i<2;i++){
           prod1[i]=input.nextInt();
           
       }
        price1=new DecimalFormat("#0.00").format(input.nextFloat());
        for(int i=0;i<2;i++){
           prod2[i]=input.nextInt();
            
       }
        price2=new DecimalFormat("#0.00").format(input.nextFloat());
        float total=(prod1[1]*Float.parseFloat(price1))+(prod2[1]*Float.parseFloat(price2));
        System.out.println("VALOR A PAGAR: R$ "
                +new DecimalFormat("#0.00").format(total));
    }
    
}
