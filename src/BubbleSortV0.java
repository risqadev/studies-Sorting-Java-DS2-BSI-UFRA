public class BubbleSortV0 {
  public static int [] ordenar (int [] lista) {
    System.out.println("\n########## Bubble Sort v0 ####");
    int t = lista.length, aux;
    for (int n = 0; n < t-1; n++) {
      System.out.printf("ITERACAO %d %n", n+1);
      for (int i = 0; i < t-1; i++) {
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