
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
        Scanner input=new Scanner(System.in);
    int a,b,r,q;
    a=input.nextInt();
    b=input.nextInt();
    r=a%b;
    q=(a-r)/b;
        System.out.println(q+" "+r);
    
    }
    
}
