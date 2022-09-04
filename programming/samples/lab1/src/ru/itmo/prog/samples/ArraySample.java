package ru.itmo.prog.samples;

public class ArraySample {
    public static void main(String[] args) {
        var elementFrom = 12;
        var elementTo = 36;
        var sequentialArray = createSequentialIntArray(elementFrom, elementTo);
        printArray(sequentialArray);
    }

    private static int[] createSequentialIntArray(int elementFrom, int elementTo) {
        var sequentialArray = new int[elementTo - elementFrom + 1];

        for (int i = elementFrom; i <= elementTo; i++) {
            sequentialArray[i - elementFrom] = i;
        }

        return sequentialArray;
    }

    private static void printArray(int[] array) {
        System.out.printf("Sequential int array of size: %d" + System.lineSeparator(), array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3d", array[i]);
        }
        System.out.println();
    }
}
