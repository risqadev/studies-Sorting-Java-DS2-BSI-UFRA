import java.util.*;

public class BubbleSortV1 {
  public static void main (String args []) {
    int X[] = new int [5];
    int n,i,aux;
    Scanner entrada = new Scanner (System.in);
    for (i=0; i<=4; i++) {
      System.out.println("Digite o "+(i+1) +"o numero: " );
      X[i] = entrada.nextInt();
    }

    for (n=1; n<=4; n++) {
      for (i=4; i>=n; i--) {
        if(X[i] < X[i-1]) {
          aux = X[i];
          X[i] = X[i-1];
          X[i-1] = aux;
        }
      }
    }
    for (i=0;i<=4;i++) {
      System.out.println((i+1)+"o numero: " + X[i]);
    }
  }
} 