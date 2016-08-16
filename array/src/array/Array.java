/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author emadahmed
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] num = new int[9];
        int sum=0;int avg=0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            num[i]=input.nextInt();
        }
        for(int i=0;i<num.length;i++){
            sum+=num[i];
             avg=sum/num.length;
            
        }
        System.out.println("sum ="+sum+"\n"+"avg ="+avg);
    }
    
}
