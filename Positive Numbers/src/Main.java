
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
        float [] num=new float[6];
        int count=0;
       
        for(int i=0;i<num.length;i++){
            num[i]=input.nextFloat();
            if(num[i]>0)
                count++;
            
        }
        System.out.println(count+" valores positivos");
    }
    
}
