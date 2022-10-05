public class App {
  public static void main(String[] args) {
    // int n = 5;
    // int lista[] = Entrada.pedir(n);
    
    // int lista[] = {1,2,3,4,5};      // bs2 melhor caso
    // int lista[] = {5,4,3,2,1};      // bs2 pior caso
    int lista[] = {3,5,4,2,1};

    // Imprimir.array(lista);
    
    // BubbleSortV2.ordenar(lista);
    // Imprimir.array(lista);
    
    // int lista1[] = BubbleSortV0.ordenar(lista.clone());
    // System.out.printf("         Lista ordenada: ");
    // Imprimir.array(lista1);

    // int lista2[] = BubbleSortV1.ordenar(lista.clone());
    // System.out.printf("         Lista ordenada: ");
    // Imprimir.array(lista2);

    // int lista3[] = BubbleSortV2.ordenar(lista.clone());
    // System.out.printf("         Lista ordenada: ");
    // Imprimir.array(lista3);

    int lista4[] = SelectionSortV1.ordenar(lista.clone());
    System.out.printf("         Lista ordenada: ");
    Imprimir.array(lista4);

    int lista5[] = SelectionSortV2.ordenar(lista.clone());
    System.out.printf("         Lista ordenada: ");
    Imprimir.array(lista5);
  }
}
