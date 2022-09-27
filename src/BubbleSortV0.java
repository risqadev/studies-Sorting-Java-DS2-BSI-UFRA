public class BubbleSortV0 {
  public static int [] ordenar (int [] lista) {
    int t = lista.length, aux;
    for (int n = 0; n < t; n++) {
      System.out.printf("iteracao %d %n", n+1);
      for (int i = 0; i < t-1; i++) {
        System.out.printf("comparando pos %d com %d %n", i, i+1);
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