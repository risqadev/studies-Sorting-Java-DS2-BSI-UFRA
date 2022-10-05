public class SelectionSortV1 {
  public static int [] ordenar (int [] lista) {
    System.out.println("\n########## Selection Sort v1");
    int menorPos, aux;
    for (int i = 0; i < lista.length-1; i++) {
      System.out.printf("ITERACAO %d %n", i+1);
      menorPos = i+1;
      for (int j = menorPos+1; j < lista.length; j++) {
        System.out.printf("ITERACAO %d.%d %n", i+1, j-i-1);
        if(lista[j] < lista[menorPos]) {
          System.out.println("menor encontrado");
          menorPos = j;
        }
      }
      if (lista[menorPos] < lista[i]) {
        System.out.println("menor colocado na pos " + i);
        aux = lista[i];
        lista[i] = lista[menorPos];
        lista[menorPos] = aux;
      }
    }
    return lista;
  }
}
