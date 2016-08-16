
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
        // TODO code application logic here\
        Scanner input=new Scanner(System.in);
        int N;
        N=input.nextInt();
        if(N<=3600){
            int y=N/60;
            N-=(y*60);
            System.out.println("0:"+y+":"+N);
        } else{
            int h=N/3600;
            int m=((N-h*3600)/60);
            int s=(N-h*3600)-(m*60);
            System.out.println(h+":"+m+":"+s);

        }
        
    }
    
}
