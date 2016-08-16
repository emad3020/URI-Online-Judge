/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package power;

import java.util.Scanner;

/**
 *
 * @author emadahmed
 */
public class Power {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int num,sum=2,count=1;
        num=input.nextInt();
        if(num%2==1){
            System.out.println("Invalid number");
        } else{
            for(;;){ 
                sum=sum*2;
                if(sum<=num)
                    count++;
                else
                    break;
                
            }
        System.out.println(count);

        }
    }
    
    
}
