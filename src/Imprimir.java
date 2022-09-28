public class Imprimir {
  public static void array(int[] lista) {
    System.out.printf("[ ");
    for (int i = 0; i < lista.length; i++) {
      String mask = (i == lista.length - 1) ? "%d" : "%d, ";
      System.out.printf(mask, lista[i]);
    }
    System.out.println(" ]");
  }
}
