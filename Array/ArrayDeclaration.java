public class ArrayDeclaration {
    public static void main(String[] args) {
        // Declaration + Initialization
        int[] numbers = new int[5]; // Default values: 0 
        //here 5 refers to the Size of Array:
        // Assigning values
        //Indexing always start from 0 to Size-1
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Printing the array
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]); //numbers[i] will give the array that is present at index(i) 
        }

        // Another way: Declaration + Initialization together
        int[] otherNumbers = { 5, 10, 15, 20 };
        System.out.println("\nOther array:");
        for (int num : otherNumbers) {
            System.out.print(num + " ");
        }
    }
}
