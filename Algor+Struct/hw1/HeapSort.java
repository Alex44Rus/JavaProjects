package Algorithmes.HomeWork.hw1;

public class HeapSort {
    public static void sort(int[] array) {
        //Построение кучи (перегруппируем массив)
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapify(array, array.length, i);
        }
        //Один за другим извлекаем элементы из кучи
        for (int i = array.length - 1; i >= 0; i--) {
            //Перемещаем текущий корень в конец
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Вызываем heapify на уменьшенной куче
            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex; //Инициализируем наибольший элемент как корень
        int leftChild = rootIndex * 2 + 1;
        int rightChild = rootIndex * 2 + 2;

        // Если левый дочерний элемент больше "largest"
        if (leftChild < heapSize && array[leftChild] > array[largest]) {
            largest = leftChild;
        }
        // Если правый дочерний элемент больше "largest"
        if (rightChild < heapSize && array[rightChild] > array[largest]) {
            largest = rightChild;
        }
        // Если наибольший не корень
        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;
        }
        // Рекурсивно преобразуем в двоичную кучу затронутое поддерево

        heapify(array, heapSize, largest);
    }
}

