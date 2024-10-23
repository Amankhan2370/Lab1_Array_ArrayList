public class part1 {
    public static void main(String[] args) {
        // Initialize arrays x and y
        int[] x = {1, 5, 9, 7, 3};
        int[] y = {2, 6, 4, 8, 3};
        
        // Initialize array z where each element is the max of respective elements from x and y
        int[] z = new int[5];
        for (int i = 0; i < z.length; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        // Print arrays x, y, and z in the required format
        System.out.print("Array x = { ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
            if (i < x.length - 1) System.out.print(", ");
        }
        System.out.println(" }");

        System.out.print("Array y = { ");
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i]);
            if (i < y.length - 1) System.out.print(", ");
        }
        System.out.println(" }");

        System.out.print("Array z = x + y = { ");
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i]);
            if (i < z.length - 1) System.out.print(", ");
        }
        System.out.println(" }");
    }
}
