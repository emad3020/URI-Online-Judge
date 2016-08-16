
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
        int t=input.nextInt(),counter=0;
        int arr[]=new int[1000];
        for(int i=0;i<1000;i++){
            arr[i]=counter;
            
            
            if(counter>=t-1)
                counter=0;
            else
                counter++;
        }
        for(int i=0;i<1000;i++){
             System.out.println("N["+i+"] = "+arr[i]);
        }
    }
    
}
