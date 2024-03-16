public class Color {
    public enum Color {
        RED, BLUE, GREEN, YELLOW, PURPLE, ORANGE  // Six colors of your choice
    }
}

public class Model {
    public enum Model {
        GRETA, FREYA, ELLA, DANA
    }
}

public class CamellaHome {
    private int year;
    private Model model;
    private Color.Color color;  // Accessing Color enum from Color class

    public CamellaHome(int yr, Model m, Color.Color c) {
        year = yr;
        model = m;
        color = c;
    }

    public void display() {
        System.out.println("CamellaHome Details:");
        System.out.println("Year: " + year);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }
}

public class CamellaHomeDemo {
    public static void main(String[] args) {
        CamellaHome home1 = new CamellaHome(2014, Model.GRETA, Color.Color.RED);
        CamellaHome home2 = new CamellaHome(2020, Model.ELLA, Color.Color.BLUE);

        home1.display();
        home2.display();
    }
}