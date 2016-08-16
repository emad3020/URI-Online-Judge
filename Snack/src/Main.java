
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
        int x,y;
        x=input.nextInt();
        y=input.nextInt();
        if(x==1){
            System.out.println("Total: R$ "+new DecimalFormat("#0.00").format(y*4.00));
        }else if(x==2){
          System.out.println("Total: R$ "+new DecimalFormat("#0.00").format(y*4.50));  
        } else if(x==3){
           System.out.println("Total: R$ "+new DecimalFormat("#0.00").format(y*5.00)); 
        } else if(x==4){
            System.out.println("Total: R$ "+new DecimalFormat("#0.00").format(y*2.00));
        } else if(x==5){
            System.out.println("Total: R$ "+new DecimalFormat("#0.00").format(y*1.50));
        }
                
    }
    
}
