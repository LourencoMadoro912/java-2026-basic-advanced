package oop_generics_colecoes_java;

import java.util.Scanner;

public class TiposPrimitivos {
    short aShort;  //8 bits
    byte aByte;    //16 bits
    int anoNascimento;     //32 bits
    long aLong;    //64 bitss
    float aFloat;  //7 casas decimais
    double aDouble; //15 casas decimais
    boolean aBoolean; //true or false
    char aChar;  //unico caractere


    public static void main(String[] args){
        TiposPrimitivos tiposPrimitivos=new TiposPrimitivos();
        Scanner sc=new Scanner(System.in);

        //calculando idade atual
        System.out.println("Digita o seu ano de nacimento: ");
        tiposPrimitivos.anoNascimento=sc.nextInt();
        int idade=2026- tiposPrimitivos.anoNascimento;
        System.out.println("idade: " +idade);

        //somando numero de 1 a 100
        for (int j=1;j<=10;j++){
            System.out.println("deigite dois numeros\n\n\n");

            System.out.println("Digite o primeiro: ");
            int primeiro=sc.nextInt();
            System.out.println("Digite o segundo: ");
            int segundo=sc.nextInt();
            int n=0;
            for (int i=primeiro;i<=segundo;i++){
                n=n+i;
            }
            System.out.println(("a soma nesses intervalo e: "+n));
        }
    }
}
