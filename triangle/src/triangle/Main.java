/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

import java.util.Scanner;

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
        int a=input.nextInt(),b=input.nextInt(),c=input.nextInt(),d=input.nextInt();
        if((a<b+c)&&(b<a+c)&&(c<a+b)||
                (b<c+d)&&(c<b+d)&&(d<c+b)||
                a<b+d&&b<a+d&&d<a+b||
                a<c+d&&c<a+d&&d<c+a)
            System.out.println("S");
        else
            System.out.println("N");
    }
    
}
