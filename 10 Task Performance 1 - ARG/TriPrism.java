public class TriPrism<T extends Number> { // Generic class with Number constraint

    private T length;
    private T base;
    private T height;

    // Getters and Setters
    public T getLength() {
        return length;
    }

    public void setLength(T length) {
        this.length = length;
    }

    public T getBase() {
        return base;
    }

    public void setBase(T base) {
        this.base = base;
    }

    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }

    // Calculate volume
    public double getVolume() {
        return (double) length * (0.5 * (double) base * (double) height); // Cast to double for decimal result
    }
}

public class TriPrismDemo {

    public static void main(String[] args) {
        // TriPrism objects for Integer and Double
        TriPrism<Integer> tp1 = new TriPrism<>();
        TriPrism<Double> tp2 = new TriPrism<>();

        // Set values using setters
        tp1.setLength(10);
        tp1.setBase(7);
        tp1.setHeight(5);

        tp2.setLength(9.10);
        tp2.setBase(6.25);
        tp2.setHeight(4.20);

        // Display information and calculate volume using getters
        System.out.println("Triangular Prism 1");
        System.out.println("Length: " + tp1.getLength());
        System.out.println("Base: " + tp1.getBase());
        System.out.println("Height: " + tp1.getHeight());
        System.out.println("The volume of the triangular prism is " + tp1.getVolume() + ".");

        System.out.println("\nTriangular Prism 2");
        System.out.println("Length: " + tp2.getLength());
        System.out.println("Base: " + tp2.getBase());
        System.out.println("Height: " + tp2.getHeight());
        System.out.println("The volume of the triangular prism is " + tp2.getVolume() + ".");
    }
}