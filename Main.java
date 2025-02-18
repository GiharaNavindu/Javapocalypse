class Main {
    public static void main(String[] args) {
        int arr1[] = new int[] {1, 2, 3, 5};
        int arr2[] = new int[arr1.length];

        // Corrected line
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i]; // Changed 'arr' to 'arr1'
        }

        System.out.println("Elements of original array: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        // Displaying elements of array arr2
        System.out.println("Elements of new array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
