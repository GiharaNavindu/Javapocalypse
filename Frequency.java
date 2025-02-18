class Main {
    public static void main(String[] args) {
        int arr[] = new int[] {1, 2, 3, 4, 4, 5, 7, 7, 7, 7};
        int freq[] = new int[arr.length];
        int visited = -1;

        // Count frequency of each element
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) { // Fixed 'J' to 'j'
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = visited; // Mark as visited
                }
            }
            if (freq[i] != visited) {
                freq[i] = count;
            }
        }

        // Print the frequency table
        System.out.println("-----------------------------------------------");  
        System.out.println("  Element   |   Frequency   ");  
        System.out.println("-----------------------------------------------");  
        for (int i = 0; i < freq.length; i++) {  
            if (freq[i] != visited)  
                System.out.printf("    %-8d |    %-10d%n", arr[i], freq[i]);  
        }  
        System.out.println("-----------------------------------------------"); 
    }
}
