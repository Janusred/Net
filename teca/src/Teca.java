
import java.util.Random;
import java.util.Scanner;


public class Teca {
  private Scanner tecladoA,tecladoB;
    private int[][] mat,matB;
    private int acu,confilas,condig,confilasB,condigB;
    private int res,res1,resB,res1B;
        public void sumaA() {
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
            }System.out.println(); }
    }        int fin=confilas+confilasB;
    public void multimatriz(){
     
              Random r=new Random();
	      Scanner in=new Scanner(System.in);
 
	        System.out.println("ingrese numero de filas de la primera matriz");
	       int x1=in.nextInt();
	        System.out.println("ingrese numero de columnas de la primera matriz");
	       int z1=in.nextInt();
	        System.out.println("ingrese numero de filas de la segunda matriz");
	       int x2=in.nextInt();
	        System.out.println("ingrese numero de columnas de la segunda matriz");
	       int z2=in.nextInt();
 
	       int[][] m1=new int[x1][z1];
	       int[][] m2=new int[x2][z2];
	       int[][] mR=new int[x1][z2];
	        System.out.println("La matriz 1");
                  for(int i=0;i<x1;i++){
	            System.out.print("[ ");
	            for(int j=0;j<z1;j++){
	                m1[i][j]=r.nextInt(9);
	                System.out.print(m1[i][j]+" ");
	            }
	            System.out.print("]");
	            System.out.println("");
	        }
	        System.out.println("La matriz 2");
	        for(int i=0;i<x2;i++){
	            System.out.print("[ ");
	            for(int j=0;j<z2;j++){
	                m2[i][j]=r.nextInt(9);
	                System.out.print(m2[i][j]+" ");
	            }
	                System.out.print("]");
	                System.out.println("");
	        }
                        if(z1==x2){
	                System.out.println("La matriz resultante es: ");
                        for(int i=0;i<x1;i++){
                        System.out.print("[ ");
                        for(int j=0;j<z2;j++){
                        for(int h=0;h<z1;h++){
 
	            	 mR[i][j]+=m1[i][h]*m2[h][j];
                }
                System.out.print(mR[i][j]+" ");
            }
            System.out.print("]");
            System.out.println("");
        }
    }
    else{
        System.out.println("Los rangos de las matrices son incorrectos");
    }
}
    // metodo de impresion y ejecicion en pantalla
                 public void bib(){
        int i = 0,contador = 0; // variables de iimpresion
        int opc = 0;
        int entrad = 0;
        do{
            System.out.println("Que deseas utilizar??");
            System.out.println("Preciona el # de opcion que deseas utilizar");
            System.out.println("Matriz iregular y conteo de elementos; " + 0 );
            System.out.println("Multiplicaion de matriz Cuaadrada; " + 1);
             Scanner entrada=new Scanner(System.in);
             opc=entrada.nextInt();
          switch (opc){ 
              case 0: 
                Teca suma1 = new Teca();
                suma1.sumaA();
                suma1.imprimirA();
                suma1.cargarB();
                suma1.imprimirB();
                 break;
              case 1:
                  Teca mul = new Teca();
                  mul.multimatriz();
                  break;
              case 2:
                  
              default: System.out.println("No hay mas que hacer"+"Nada");
   }
      }while( i <=contador);
   }
    public static void main(String[] args) {
        Teca jj = new Teca();
        jj.bib();
        
    }
    
}
