public class Imprimir {
  public static void array(int[] lista) {
    System.out.printf("Lista: ");
    for (int i=0; i<lista.length; i++) {
      System.out.printf("%d  ", lista[i]);
    }
    System.out.println("");
  }
}
