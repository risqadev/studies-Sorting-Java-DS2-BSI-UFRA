public class App {
  public static void main(String[] args) {
    // int n = 5;
    // int[] lista = Entrada.pedir(n);
    int[] lista = {4,3,5,2,1};
    // int[] lista = {1,2,3,4,5};

    // lista = BubbleSortV0.ordenar(lista);
    lista = BubbleSortV1.ordenar(lista);
    // lista = BubbleSortV2.ordenar(lista);

    Imprimir.array(lista);
  }
}
