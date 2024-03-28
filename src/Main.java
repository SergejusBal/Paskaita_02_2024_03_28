import javax.xml.transform.Source;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Math SimpleMath;

    public static void main(String[] args) {



        ///////////////////////////////////////////
        ////// Klases darbas 1 (Fizz Buzz)

        System.out.println("");
        System.out.println("Klasės darbas (Fizz Buzz)");
        System.out.println("");

        for (int i = 1; i<=100; i++) {
            if (i%3 != 0 && i%5 != 0) System.out.println(i);
            else if (i%3==0 && i%5 != 0) System.out.println("FIZZ");
            else if (i%3!=0 && i%5 == 0) System.out.println("BUZZ");
            else System.out.println("FIZZBUZZ");
        }

        ///////////////////////////////////////////
        ////// WorkFlow_uzduotis_01

        System.out.println("");
        System.out.println("WorkFlow_uzduotis_01");
        System.out.println("");

        System.out.println();
        String vardas = "Sergejus";
        int j = 0;
        while (j<vardas.length()) {
            System.out.println(vardas);
            j++;
        }

        System.out.println();
        j = 220;
        int i = 0;
        while (j<=300)
        {
            if (i==3) {
                System.out.println(j);
                i=0;
            }
            i++;
            j++;
        }

        System.out.println();
        j=0;
        while (j<=100) {
            if (j%3==0) System.out.println(j);
            j++;
        }


        ///////////////////////////////////////////
        ////// WorkFlow_uzduotis_02

        System.out.println("");
        System.out.println("WorkFlow_uzduotis_01");
        System.out.println("");

        String diena = "Ketvirtadienis";

         j = 0;
        do  {
            System.out.println(diena);
            j++;
        } while (j<diena.length());

        System.out.println();


        j = -1;
        i = 0;
        do {
            if (i==5) {
                System.out.println(j);
                i=0;
            }
            i++;
            j--;
        } while (j>=-150);

        j=1;
        do {
            if (j%4==0) System.out.println(j);
            j++;
        } while (j<=200);

        ///////////////////////////////////////////
        ////// WorkFlow_uzduotis_03

        System.out.println("");
        System.out.println("WorkFlow_uzduotis_03");
        System.out.println("");


        String mieno = "kovas";

        for (int x=0; x<mieno.length();x++) System.out.println(mieno);

        i=0;
        for (int x=-50;x>-100;x--){

            if (i==2){
                System.out.println(x);
                i=0;
            }
            i++;
        }

        for (int x=50; x<=250; x++){

            if (x%5==0 && x%10 ==0) System.out.println("Bingo");
            else if (x%5==0) System.out.println(x);

        }

        String zodis = "Nebeprisikiškiakopūsteliaujantiesiems";

        for (int x=0; x<zodis.length();x++){
            System.out.println(zodis.charAt(x));
        }
        for (int x=0; x<zodis.length();x+=3){
            System.out.println(zodis.charAt(x));
        }

        ///////////////////////////////////////////
        ////// Extra
    //// Pavyzdys pagal kita kolega.
        System.out.println("Primes");

        for (int x = 9; x < 2778; x++) {
            int d = 0;
            int isdu = 1;
            for (int y = 2; y <=x; y++) {
                int k = x % y;
                switch (k) {
                    case 0:
                        d +=1;
                        break;
                    default:
                      //  isdu=x%2;
                }
            }

            switch (d)  {
                case 0:
                    System.out.println(x);
                    break;
                case 1:
                    System.out.println(x);
                    break;
            }

        }
    }


}