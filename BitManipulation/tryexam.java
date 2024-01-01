package BitManipulation;

public class tryexam {
    public static void main(String[] args) {
        int originalValue = 0b011101; // Binary representation of 011101

        // Left shifting the original value by 1 position
        int shiftedValue = originalValue << 1;

        // Printing the shifted value in binary format
        System.out.println("Shifted value in binary: " + Integer.toBinaryString(shiftedValue));
    }
}
