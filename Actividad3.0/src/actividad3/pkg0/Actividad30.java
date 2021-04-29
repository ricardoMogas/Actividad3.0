/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3.pkg0;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author RicardoMoo
 */
public class Actividad30 {
    public static void ejercicio1 () {
       System.out.println("suma consecutiva del 0 al 10");
       int num = 0;
       int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + num ;
            num++;
            System.out.println(sum);
        } 
    }
    
    public static void ejercicio2() {
        System.out.println("factorial del 1 al 10");
        int num = 1;
        int sum = 1;
        for (int i = 0; i < 11; i++) {
            sum = sum * num;
            num++;
            System.out.println(sum);
        }
        
    }
    public static void ejercicio3(){
        System.out.println("Factorial, ingresa un numero");
        Scanner leer = new Scanner (System.in);
        int num = 1;
        int sum = 1;
        int cont = leer.nextInt();
        for (int i = cont; i > 0; i--) {
            sum = sum * num;
            num++;
            
        }
        System.out.println("el factorial de: "+cont+" es:"+sum);
        
    }
    public static void ejercicio4(){
        System.out.println("ingrese el un numero entero para sacar la media:");
        Scanner leer = new Scanner (System.in);
        int sum = 0;
        int num = 0;
        int cont = leer.nextInt();
        for (int i = cont; i >=0 ; i--) {
            sum= sum + num;
            num++;
        }
        float media = sum/cont;
        System.out.println("la media es:"+media);
    }
    public static void ejercicio5(){
        Scanner leer = new Scanner (System.in);
        int num [] = new int [3];
        System.out.println("Ingrese los numeros que va a sumar y sacar el promedio");
        int sum = 0; 
        for (int i = 0; i < 3; i++) {
            num[i] = leer.nextInt();
            sum = sum+ num[i];
            System.out.println("suma="+sum);
        }
        int mayor = num[0];
        int menor = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]>mayor) {
                mayor = num[i];
            }
            if (num[i]<menor) {
                menor = num[i];
            }
            
        }
        int distacia = mayor-menor;
        float promedio = sum/3;
        System.out.println("El promedio es: "+ promedio );
        System.out.println("El numero mayor es: " + mayor +" y el numero menor es: "+ menor );
        System.out.println("La distancia entre entre los numeros es: "+ distacia );
    }
    public static void ejercicio6(){
        System.out.println("Matriz de dias de la semana");
        String[] diasSem;
        diasSem = new String[7];
        diasSem [0] = "Lunes";
        diasSem [1] = "Martes";
        diasSem [2] = "Miercoles";
        diasSem [3] = "Jueves";
        diasSem [4] = "Viernes";
        diasSem [5] = "sabado";
        diasSem [6] = "domingo";
        for (String diasSem1 : diasSem) {
            System.out.println(diasSem1);

        } 
    }
    public static void ejercicio7(){
        System.out.println("Matriz de personajes");
        String sWar[][] = new String[3][4];
        sWar[0][0]="Darth Vader";
        sWar[0][1]="Luke Skywalker";
        sWar[0][2]="Han solo";
        sWar[0][3]="Lea Organa";
        sWar[1][0]="Obi-Wan Kenobi";
        sWar[1][1]="Chewbacca";
        sWar[1][2]="Yoda";
        sWar[1][3]="Palpatine";
        sWar[2][0]="R2-D2";
        sWar[2][1]="C-3PO";
        sWar[2][2]="Boba Fett";
        sWar[2][3]="Darth Maul";
        int i,j;
        for (i = 0;i < sWar.length; i++){
            for(j = 0; j < sWar[i].length; j++){
                System.out.print("["+sWar[i][j]+"]");
                
            }
        }   
    }
    public static void juegoGato(){
        System.out.println("Modelo del gato");
        char cat[][]= new char[3][3];
        cat[0][0]='x';
        cat[0][1]='o';
        cat[0][2]='x';
        cat[1][0]='o';
        cat[1][1]='x';
        cat[1][2]='o';
        cat[2][0]='o';
        cat[2][1]='o';
        cat[2][2]='x';
        for (int i = 0; i < cat.length; i++) {
            System.out.println("|" + cat[i][0]+"|" + cat[i][1]+"|"+cat[i][2]+"|");
        }
    }
    
    

    public static void main(String[] args) {
        System.out.println("ingrese el numero del ejercicio, del 1 al 8");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        switch (num){
            case 1:
                ejercicio1();
                break;
            case 2:
                ejercicio2();
                break;
            case 3:
                ejercicio3();
                break;
            case 4:
                ejercicio4();
                break;
            case 5:
                ejercicio5();
                break;
            case 6:
                ejercicio6();
                break;
            case 7:
                ejercicio7();
                break;
            case 8:
                juegoGato();
                break;
        }
    }
    
}
