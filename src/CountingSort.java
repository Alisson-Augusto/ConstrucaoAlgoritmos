public class CountingSort {
     public static void CountingSort(int A[], int B[], int k) {
        int C[] = new int[k+1];

        for(int i=0; i < k; i++) { C[i] = 0; }

        // Calcula frequência simples
        for(int j=0; j < k; j++) {
            C[A[j]]++;
        }

        // Calcula frequência acumulada


        for(int elemento: C) {
            System.out.println(elemento);
        }
     }
}
