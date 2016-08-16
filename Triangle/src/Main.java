
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
        float a,b,c;
        a=input.nextFloat();
        b=input.nextFloat();
        c=input.nextFloat();
        if((a+b)>c&&(a+c)>b&&(b+c)>a){
            System.out.println("Perimetro = "+(a+b+c));
        } else {
            System.out.println("Area = "+((a+b)/2)*c);
        }
    }
    
}
