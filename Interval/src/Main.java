
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
        float num;
        num=input.nextFloat();
        if(num>=0.0&&num<=25.0){
            System.out.println("Intervalo [0,25]");
        }
        else if(num>25.0&&num<=50.0){
            System.out.println("Intervalo (25,50]");
        }
        else if(num>50.0&&num<=75.0){
            System.out.println("Intervalo (50,75]");
        }
        else if(num>75.0&&num<=100.0){
            System.out.println("Intervalo (75,100]");
        }
        else
            System.out.println("Fora de intervalo");
        
    }
    
}
