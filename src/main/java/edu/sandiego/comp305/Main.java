package edu.sandiego.comp305;

/**
 * Main application class.
 */
public final class Main {

    /**
     * Private constructor
     */
    private Main() {

    }

    /**
     * Main entry point.
     * @param args Command line arguments
     */
    public static void main(final String[] args) {
        System.out.printf("Hello and welcome!%n");

        final int max = 5;
        for (int i = 1; i <= max; i++) {
            System.out.println("i = " + i);
        }
    }
}
