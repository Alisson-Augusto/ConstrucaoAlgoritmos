public class QuickSort {
    public static void quicksort(int A[], int p, int r) {
        if(p < r) {
            int q = partition(A, p, r);
            quicksort(A, p, q - 1);
            quicksort(A, q + 1, r);
        }
    }

    public static int partition(int A[], int p, int r) {
        // p, r => Indices Inicial e final do subvetor
        int x = A[r]; // Pivo
        int i = p - 1;
        // É utilizado 2 índices auxiliares i e j
        // Onde J efetivamente percorre o subvetor exceto o pivo
        for(int j = p; j <= r - 1; j++) {
            if (A[j] <= x) {
                // Troca A[i] com A[j]
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        // Coloca pivo em sua posição definitiva
        int temp = A[i + 1];
        A[i + 1] = A[r];
        A[r] = temp;

        // Retorna indice do pivo
        return i + 1;
    }
}
