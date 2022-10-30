public class Heapsort {
    public Heapsort() {}

    public static void maxHeapify(int vetor[], int i, final int tamanho) {
        int esquerdo = filhoEsquerdo(i);
        int direito  = filhoDireito(i);
        int maior = i;

        if (esquerdo <= tamanho && vetor[esquerdo-1] > vetor[i-1])
            maior = esquerdo;
        if (direito <= tamanho && vetor[direito-1] > vetor[maior-1])
            maior = direito;

        if (maior != i) {
            int temp = vetor[i-1];
            vetor[i-1] = vetor[maior-1];
            vetor[maior-1] = temp;

            maxHeapify(vetor, maior, tamanho);
        }
    }

    public static void buildMaxHeap(int vetor[], final int tamanho) {
        // Aplica a propriedade max-heap apartir do nó mais interno (que é index / 2)
        // Até a raiz da Heap index 1
        int noMaisInternoComFolha = (int) (tamanho / 2);
        for(int i = noMaisInternoComFolha; i >= 1; i--) {
            maxHeapify(vetor, i, tamanho);
        }
    }

    public static void heapSort(int vetor[]) {
        int tamanho = vetor.length;
        buildMaxHeap(vetor, tamanho);

        for(int i=tamanho; i >= 2; i--) {
            int maiorElemento = vetor[0];
            int aux = vetor[tamanho-1];
            vetor[tamanho-1] = maiorElemento;
            vetor[0] = aux;

            tamanho--;
            maxHeapify(vetor, 1, tamanho);
        }
    }

    public static int pai(int i) {
        return i / 2;
    }

    public static int filhoEsquerdo(int i) {
        return 2 * i;
    }

    public static int filhoDireito(int i) {
        return (2 * i) + 1;
    }

    public static void printHeap(int vetor[]) {
        int altura = (int)(Math.log(vetor.length) / Math.log(2));
        int index = 0;
        for (int i=0; i <= altura; i++) {
            int quantidadeNos = (int) Math.pow(2, i);
            for (int j = 0; j < quantidadeNos; j++) {
                if(index < vetor.length)
                    System.out.print(vetor[index] + " ");
                index++;
            }
            System.out.println("");
        }
    }
}
