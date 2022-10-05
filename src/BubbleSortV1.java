public class BubbleSortV1 {
  public static int [] ordenar (int [] lista) {
    System.out.println("\n########## Bubble Sort v1");
    int aux;
    for (int n = lista.length-1; n > 0; n--) {
      System.out.printf("ITERACAO %d %n", lista.length-n);
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