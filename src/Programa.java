public class Programa {
    public static void main(String[] args) {
        int vetor[] = {2, 5, 3, 0, 2, 3, 0, 3};

        int maior = vetor[0];
        for(int elemento: vetor) {
            if(maior < elemento)
                maior = elemento;
        }
        System.out.println(maior);
        CountingSort.CountingSort(vetor, new int[vetor.length], maior);
    }
}
