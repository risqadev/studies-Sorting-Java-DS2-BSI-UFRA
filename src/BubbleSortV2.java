public class BubbleSortV2 {
  public static int [] ordenar (int [] lista) {
    System.out.println("\n#### Bubble Sort v2 ####");
    int t = lista.length, n = t-1, troca = 1, aux;
    while (n > 0 && troca == 1) {
      System.out.printf("ITERACAO %d %n", t-n);
      troca = 0;
      for (int i = 0; i < n; i++) {
        System.out.printf("comparando pos %d com %d - ", i, i+1);
        Imprimir.array(lista);
        if (lista[i] > lista[i+1]) {
          troca = 1;
          aux = lista[i];
          lista[i] = lista[i+1];
          lista[i+1] = aux;
        }
      }
      n--;
    }
    return lista;
  }
}