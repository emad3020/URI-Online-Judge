
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
        Scanner input =new Scanner(System.in);
        int a,b,sum=0;
        a=input.nextInt();
        b=input.nextInt();
        for(int i=a-1;i>b;i--){
             
            if(i%2==1||i%2==-1){
                sum+=i;
//                System.out.println(sum);
                
        }
            
        }
        System.out.println(sum);
    }
    
}
