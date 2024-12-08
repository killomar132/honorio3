/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package honorio3;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Honorio3 {

    public static int sumaPerimetro(int[][] matriz, int filas, int columnas) {
        int suma=0;
        for(int i=0;i<columnas;i++){
            suma+=matriz[0][i];
        }

        if(filas>1){
            for (int i = 0; i < columnas; i++){
                suma += matriz[filas - 1][i];
            }
        }
        if(columnas>1){
            for (int i=1;i<filas-1;i++) {
                suma+=matriz[i][0];
            }
        }
        if(columnas>1){
            for (int i=1;i<filas-1;i++){
                suma+=matriz[i][columnas-1];
            }
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.print("Introduce el número de filas: ");
        int filas=leer.nextInt();
        System.out.print("Introduce el número de columnas: ");
        int columnas=leer.nextInt();
        int[][] matriz = new int[filas][columnas];
        System.out.println("Introduce los elementos de la matriz:");
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print("Elemento en la posición ("+i+","+j+"): ");
                matriz[i][j]=leer.nextInt();
            }
        }
        int resultado=sumaPerimetro(matriz, filas, columnas);
        System.out.println("La suma del perímetro de la matriz es: "+resultado);
        leer.close();
    }
}
