import java.util.Scanner;

public class Entrada {
  public static int[] pedir(int n) {
    int lista[] = new int [n];
    Scanner entrada = new Scanner (System.in);
    for (int i=0; i<n; i++) {
      System.out.printf("Digite o %dº numero: ", i+1);
      lista[i] = entrada.nextInt();
    }
    entrada.close();
    return lista;    
  }
}