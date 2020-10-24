import java.util.Scanner;
public class git {
    private Scanner tecladoA,tecladoB;
    private int[][] mat,matB;
    private int acu,confilas,condig,confilasB,condigB;
    private int res,res1,resB,res1B;
    
    public void cargarA() {
        tecladoA=new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz A:");
        int filasA=tecladoA.nextInt();
        mat=new int[filasA][];// llenado de filas
        for(int f=0;f<mat.length;f++ ) {
            System.out.print("Cuantas elementos tiene la fila " + f + ":");
            int elementosA=tecladoA.nextInt();
            mat[f]=new int[elementosA];// llenado de columnas
            confilas += elementosA;
            // da el conteo de suma A confilas
            //nos da mas datos
            for(int c=0;c<mat[f].length;c++) {
                System.out.print("Ingrese valor:");
                mat[f][c]=tecladoA.nextInt(); // llenado de casiilas 
             condig += filasA;
            }
        }
    }
     public void cargarB() {
         System.out.println("-----------");
        tecladoB=new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz B:");
        int filasB=tecladoB.nextInt();
        matB=new int[filasB][];
        for(int f=0;f<matB.length;f++) {
            System.out.print("Cuantas elementos tiene la fila " + f + ":");
            int elementosB=tecladoB.nextInt();
            matB[f]=new int[elementosB];  
            confilasB += elementosB;
            for(int c=0;c<matB[f].length;c++) {
                System.out.print("Ingrese valor:");
                matB[f][c]=tecladoB.nextInt();
              condigB += filasB;
                      
            }
        }
    
    }
    
    public void imprimirA() {
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                System.out.print(mat[f][c]+" ");
            }
            System.out.println();
        }
    }
        public void imprimirB() {
           
        for(int f=0;f<matB.length;f++) {
            for(int c=0;c<matB[f].length;c++) {
                System.out.print(matB[f][c]+" ");
            }
            System.out.println();
        }
    }
    public void conteo(){
        System.out.println("--------");
         int fin=confilas+confilasB;
        System.out.println(" Elemento en matriz A:" +confilas );
        System.out.println();
        System.out.println(" Elemento en matriz B:" +confilasB);
        System.out.println();
        System.out.println("Conteo total de elementos en ambas matrices "+ fin);
    }
    
    public static void main(String[] ar) {
        git ma=new git();
        ma.cargarA();
        ma.cargarB();
        ma.imprimirA();
        ma.imprimirB();
        ma.conteo();
    }   
}