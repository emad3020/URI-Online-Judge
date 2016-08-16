
import java.text.DecimalFormat;
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
        Scanner input = new Scanner(System.in);
        double n=input.nextDouble();
        double arr[] = new double[100];
        arr[0]=n;
        for (int i = 1; i < 100; i++) {
            arr[i] = arr[i - 1] / 2;
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("N[" + i + "] = " + new DecimalFormat("#0.0000").format(arr[i]));
        }
    }
}
    