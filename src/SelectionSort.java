public class SelectionSort {
    public static int [] ordenar (int [] lista) {
        System.out.println("\n########## Selection Sort");
        int t = lista.length, eleito, menor, pos;
        for (int i = 0; i < t-1; i++) {
            System.out.printf("ITERACAO %d %n", i+1);
            eleito = lista[i];
            menor = lista[i+1];
            pos = i+1;
            for (int j = i+2; j < t; j++) {
                System.out.printf("comparando pos %d com %d - ", pos, j);
                Imprimir.array(lista);
                if(lista[j] < menor) {
                    menor=lista[j];
                    pos=j;
                }
            }
            if (menor < eleito) {
                System.out.printf("troca pos %d com %d - ", i, pos);
                Imprimir.array(lista);
                lista[i] = lista[pos];
                lista[pos] = eleito;
            }
        }
        return lista;
    }
}
