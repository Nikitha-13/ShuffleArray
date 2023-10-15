import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
        int[] shuffledArray = originalArray.clone(); // Create a copy of the original array

        shuffleArray(shuffledArray);

        System.out.print("Original Array: ");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.print("Shuffled Array: ");
        for (int num : shuffledArray) {
            System.out.print(num + " ");
        }
    }

    public static void shuffleArray(int[] array) {
        Random random = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);

            // Swap array[i] and array[index]
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
}
