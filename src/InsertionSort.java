public class InsertionSort {
  public static int [] ordenar (int [] lista) {
    System.out.println("\n########## Insertion Sort");
    int t = lista.length, eleito;
    for (int i = 1; i < t; i++) {
      eleito = lista[i];
      int j = i-1;
      while (j >= 0 && lista[j] > eleito) {
        lista[j+1] = lista[j];
        j = j-1;
      }
      lista[j+1] = eleito;
    }
    return lista;
  }
}
