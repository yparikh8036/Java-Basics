public class InnerClass {

    class Point {
        private int xPos, yPos;

       // static int i = 10; // error
       static final int i = 10; // no error

        public Point(int x, int y){
            xPos = x;
            yPos = y;
        }

        public String toString(){
            return xPos + " " + yPos;
        }
    }

    private Point center;
    private int radius;

    public InnerClass(int x, int y, int r){
        center = this.new Point(x, y);
        radius = r;
    }

    public String toString(){
        return center + " " + radius;
    }
    public static void main(String[] args) {
        System.out.print(new InnerClass(10, 10, 20));
    }
}