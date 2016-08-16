
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
        Scanner input =new Scanner(System.in);
        String a,b,c;
        a=input.nextLine();
        b=input.nextLine();
        c=input.nextLine();
        if(a.toLowerCase().equals("vertebrado")&&b.toLowerCase().equals("ave")&&c.toLowerCase().equals("carnivoro"))
            System.out.println("aguia");
        else if(a.toLowerCase().equals("vertebrado")&&b.toLowerCase().equals("ave")&&c.toLowerCase().equals("onivoro"))
            System.out.println("pomba");
        else if(a.toLowerCase().equals("vertebrado")&&b.toLowerCase().equals("mamifero")&&c.toLowerCase().equals("onivoro"))
            System.out.println("homem");
        else if (a.toLowerCase().equals("vertebrado")&& b.toLowerCase().equals("mamifero")&& c.toLowerCase().equals("herbivoro"))
            System.out.println("vaca");
        else if (a.toLowerCase().equals("invertebrado")&& b.toLowerCase().equals("inseto")&& c.toLowerCase().equals("hematofago"))
            System.out.println("pulga");
        else if (a.toLowerCase().equals("invertebrado")&& b.toLowerCase().equals("inseto")&& c.toLowerCase().equals("herbivoro"))
            System.out.println("lagarta");
        else if (a.toLowerCase().equals("invertebrado")&& b.toLowerCase().equals("anelideo")&& c.toLowerCase().equals("hematofago"))
            System.out.println("sanguessuga");
        else if (a.toLowerCase().equals("invertebrado")&& b.toLowerCase().equals("anelideo")&& c.toLowerCase().equals("onivoro"))
            System.out.println("minhoca");
    }
    
}
