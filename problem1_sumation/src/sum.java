
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
public class sum {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int x,y;
        x=input.nextInt();
        y=input.nextInt();
        System.out.println("X = "+(x+=y));
    }
}
