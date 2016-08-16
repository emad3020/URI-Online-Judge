
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
int SIZE=10, n=input.nextInt();
int arr []=new int[SIZE];
arr[0]=n;
for(int i=1;i<SIZE;i++){
    arr[i]=arr[i-1]*2;
}
for(int i=0;i<SIZE;i++)
            System.out.println("N["+i+"] = "+arr[i]);

        }
    
}
