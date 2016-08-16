
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
        int day;
        day=input.nextInt();
        if(day<360){
            int month=day/30;
            day-=(month*30);
            System.out.println("0 ano(s)");
            System.out.println(month+" mes(es)");
            System.out.println(day+" dia(s)");
            
        } else{
             int y=day/365;
            int m=((day-y*365)/30);
            int d=(day-y*365)-(m*30);
             System.out.println(y+" ano(s)");
            System.out.println(m+" mes(es)");
            System.out.println(d+" dia(s)");
        }
    }
    
}
