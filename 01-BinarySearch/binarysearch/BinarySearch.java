package binarysearch;

public class BinarySearch {

    public static int binarySearch(int[] list, int item) {
        if (isListEmpty(list)) {
            return -1;
        }

        int low = 0;
        int high = list.length -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];

            if (guessEqualsItem(guess, item)) {
                return  mid;
            } else if (guessGreaterThanItem(guess, item)) {
                high = mid - 1;
            } else if (guessLessThanItem(guess, item)) {
                low = mid + 1;
            }
        }

        return -1;
    }

    // Verifica se a lista esta vazia
    public static boolean isListEmpty(int[] myList) {
        int listSize = myList.length;

        if (listSize == 0) {
            return true;
        }

        return false;
    }

    // Verifica se o elemento a ser encontrado é igual ao item pesquisado
    public static boolean guessEqualsItem(int guess, int item) {
        if (guess != item) {
            return false;
        }

        return true;
    }

    // Verifica se o elemento a ser encontrado foi maior que o item pesquisado
    public static boolean guessGreaterThanItem(int guess, int item){
        if (guess > item) {
            return true;
        }

        return false;
    }

    // Verifica se o elemento a ser encontrado foi menor que o item pesquisado
    public static boolean guessLessThanItem(int guess, int item) {
        if (guess < item) {
            return true;
        }

        return false;
    }
}