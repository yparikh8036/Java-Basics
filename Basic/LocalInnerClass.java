abstract class Shape {
    public static class Color {
      
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
}
public class LocalInnerClass{

    static Shape.Color getDescripiveColor(final Shape.Color color){
       // static Shape.Color getDescripiveColor(Shape.Color color){
        // class DescriptivrColor extends Shape.Color {
        //     public String toString() {
        //         return ""+color;
        //     }
        // }
        // //color = null;
        // return new DescriptivrColor();

        return new Shape.Color(){
            public String toString() {
                        return ""+color;
                    }
        };
    }
    public static void main(String[] args) {
        Shape.Color white = LocalInnerClass.getDescripiveColor(new Shape.Color(0, 0, 0));
        System.out.print(white);
    }
}