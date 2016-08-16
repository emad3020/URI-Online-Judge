
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
        int A,B,C,D;
        A=input.nextInt();
        B=input.nextInt();
        C=input.nextInt();
        D=input.nextInt();
        
        if(B>C&&D>A&&(C+D)>(A+B)&&C>0&&D>0&&A%2==0){
            System.out.println("Valores aceitos");
        }else
            System.out.println("Valores nao aceitos");
    }
    
}
