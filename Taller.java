

import java.util.Scanner;


public class Taller {


    public static void main(String[] args) {
        System.out.println("Digite la base y potencia. Separada con Enter:");
        Scanner numero = new Scanner(System.in);
        Scanner potencia=new Scanner(System.in);
        String numerostr= numero.nextLine();
        
        int numero1=Integer.parseInt(numerostr);
        
        String potenciastr= potencia.nextLine();
        
        int potencia1=Integer.parseInt(potenciastr);
        int resultado = potencia(numero1, potencia1, 1,0);
         
        System.out.println("El resultado de la operación es: " + resultado);
        
    }
    
    public static int multiplicar(int numeroASumar,int cantidadVeces,int contador,int resultado) {
    
    if(contador == cantidadVeces) {
    return resultado;
  }
  
  var nuevoContador = contador + 1;
  var nuevoResultado = resultado + numeroASumar;
  
  return multiplicar(numeroASumar, cantidadVeces, nuevoContador, nuevoResultado);
}



    
public static int potencia(int base, int nroPotencia, int resultado, int contador ) {
  
    if(contador == nroPotencia) {
    return resultado;
  }
  
  var nuevoResultado = multiplicar(resultado, base,0,0);
  var nuevoContador = contador + 1;
  
  return potencia(base, nroPotencia, nuevoResultado, nuevoContador);
}


}
