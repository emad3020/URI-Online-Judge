/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author mohamed
 */
public class Main {
   static public void main (String []arg){
      int code1, code2 , num1, num2;
      float price1 , price2 ,total;
      Scanner input=new Scanner (System.in);
      code1=input.nextInt();
      code2=input.nextInt();
      num1=input.nextInt();
      num2=input.nextInt();
      price1=input.nextFloat();
      price2=input.nextFloat();
      total=((num1*price1)+(num2*price2));
      System.out.print("Valor a pagar:"+" "+ "R$ "+total);
      
}
}
