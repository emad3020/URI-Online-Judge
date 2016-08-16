
import java.util.Arrays;
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
        int a,b,c,num[];
        num=new int[3];
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
       num[0]=a;num[1]=b;num[2]=c;
       Arrays.sort(num);
       for(int i=0;i<num.length;i++){
           System.out.println(num[i]);
       }
        System.out.println("");
        System.out.println(a+"\n"+b+"\n"+c);
    }
    
}
