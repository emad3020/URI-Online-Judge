
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
    int N=input.nextInt(),no_in=0,no_out=0;
    for (int i=0;i<N;i++){
        int x=input.nextInt();
        if(x>=10&&x<=20)
            no_in++;
        else
            no_out++;
    }
        System.out.println(no_in+" in");
        System.out.println(no_out+" out");
    }
    
}
