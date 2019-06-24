abstract class Shape {
    public static class Color {
       // private int red, green, blue;
       int red, green, blue;

        public Color() {
            this(0, 0, 0);
        }

        public Color(int red, int green, int blue) {
            this.blue = blue;
            this.red = red;
            this.green = green;
        }

        public String toString() {
            return red + " " + green + " " + blue;
        }
    }

    // public static class abc {
    //     public static void yy() {
    //         Shape.Color c = new Shape.Color();
    //         c.red;
    //     }
    // }

}

public class StaticNestedClass {
    public static void main(String[] args) {
        Shape.Color white = new Shape.Color(255, 255, 255);
        System.out.print(white.toString());
    }
}