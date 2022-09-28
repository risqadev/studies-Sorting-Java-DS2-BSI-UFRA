public class BubbleSortV1 {
  public static int [] ordenar (int [] lista) {
    System.out.println("\n########## Bubble Sort v1");
    int t = lista.length, aux;
    for (int n = t-1; n > 0; n--) {
      System.out.printf("ITERACAO %d %n", t-n);
      for (int i = 0; i < n; i++) {
        System.out.printf("comparando pos %d com %d - ", i, i+1);
        Imprimir.array(lista);
        if(lista[i] > lista[i+1]) {
          aux = lista[i];
          lista[i] = lista[i+1];
          lista[i+1] = aux;
        }
      }
    }
    return lista;
  }
} 