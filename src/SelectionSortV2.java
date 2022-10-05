public class SelectionSortV2 {
  public static int [] ordenar (int [] lista) {
    System.out.println("\n########## Selection Sort v2");
    int aux;
    for (int i = 0; i < lista.length-1; i++) {
      System.out.printf("ITERACAO %d %n", i+1);
      for (int j = i+1; j < lista.length; j++) {
        System.out.printf("ITERACAO %d.%d %n", i+1, j-i);
        if(lista[j] < lista[i]) {
          System.out.println("menor colocado na pos " + i);
          aux = lista[i];
          lista[i] = lista[j];
          lista[j] = aux;
        }
      }
    }
    return lista;
  }
}