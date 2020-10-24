
import java.util.Scanner;


public class Allone2 {
       private Scanner teclado;
       private int[][] mat;
       private int filas;
       private int res,res1;
        private int matriza[][] = new int [3][3];
        private int matrizb[][] = new int [3][3];
        private int matrizc[][] = new int [3][3];
        private int i, j;
        private int dato;

public void irregular() {
        teclado=new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        int filas=teclado.nextInt();
        mat=new int[filas][];
        for(int f=0;f<mat.length;f++) {
            System.out.print("Cuantas elementos tiene la fila " + f + ":");
            int elementos=teclado.nextInt();
            mat[f]=new int[elementos];            
            for(int c=0;c<mat[f].length;c++) {
                System.out.print("Ingrese valor:");
                mat[f][c]=teclado.nextInt();
                int res = 0;
                res = filas*elementos;
                res1= res;
                System.out.println(" conteo " +res1);
            }
        }
    
    }
}
