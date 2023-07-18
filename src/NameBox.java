public class NameBox {
    public static void main(String[] args) {
        String name = "Emon";
        int boxWidth = name.length() + 4; // Adjust the box width based on the name length
        int boxHeight = 3; // Set the box height

        // Print the top border
        for (int i = 0; i < boxWidth; i++) {
            System.out.print("-");
        }
        System.out.println();

        // Print the sides with name
        for (int i = 0; i < boxHeight; i++) {
            System.out.print("|");
            if (i == 1) {
                int padding = (boxWidth - name.length()) / 2;
                for (int j = 0; j < padding; j++) {
                    System.out.print(" ");
                }
                System.out.print(name);
                for (int j = 0; j < padding + (boxWidth - name.length()) % 2; j++) {
                    System.out.print(" ");
                }
            } else {
                for (int j = 0; j < boxWidth; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }

        // Print the bottom border
        for (int i = 0; i < boxWidth; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
