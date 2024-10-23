import java.util.ArrayList;
import java.util.List;

public class part2 {
    public static void main(String[] args) {
        // Initialize an ArrayList of names
        ArrayList<String> names = new ArrayList<>(List.of("Alice", "Bob", "Charlie", "David", "Eve"));

        // Print the original list of names
        System.out.print("Names = { ");
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i));
            if (i < names.size() - 1) System.out.print(", ");
        }
        System.out.println(" }");

        // Process each name by switching the first and last letters
        ArrayList<String> switchedNames = new ArrayList<>();
        for (String name : names) {
            String switchedName = switchFirstAndLastLetter(name);
            switchedNames.add(switchedName);
        }

        // Print the list of names with switched first and last letters
        System.out.print("Names (switched) = { ");
        for (int i = 0; i < switchedNames.size(); i++) {
            System.out.print(switchedNames.get(i));
            if (i < switchedNames.size() - 1) System.out.print(", ");
        }
        System.out.println(" }");
    }

    // Method to switch the first and last letters of a name and adjust the case
    private static String switchFirstAndLastLetter(String name) {
        if (name.length() <= 1) return name;  // Handle single-letter names
        String firstLetter = name.substring(0, 1).toLowerCase();
        String lastLetter = name.substring(name.length() - 1).toUpperCase();
        String middle = name.substring(1, name.length() - 1).toLowerCase();
        return lastLetter + middle + firstLetter;
    }
}

