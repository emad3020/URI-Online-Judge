
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
        float a,b;
        a=input.nextFloat();
        b=input.nextFloat();
        if(a==0&&b!=0){
            System.out.println("Eixo Y");
        }
        if(a!=0&&b==0){
             System.out.println("Eixo X");
        }
        if(a==0&&b==0){
            System.out.println("Origem");
            
        } if(a>0&&b>0){
            System.out.println("Q1");
        }
        if(a<0&&b>0){
          System.out.println("Q2");
    }
           if(a<0&&b<0){
          System.out.println("Q3");
    }
                if(a>0&&b<0){
          System.out.println("Q4");
    }
    }
    
}
