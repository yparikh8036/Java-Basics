public class ConstroctorOver {
    int x, y, z;

    public ConstroctorOver(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public ConstroctorOver(int x, int y) {
        this(x, y, 10);
    }

    public ConstroctorOver(int x) {
        this(x, 10, 10);
    }

    public ConstroctorOver() {
        this(10, 10, 10);
    }

    void print() {
        System.out.println(" " + x + " " + y + " " + z);
    }

    public static void main(String[] args) {
        new ConstroctorOver().print();
        new ConstroctorOver(20).print();
        new ConstroctorOver(20, 20).print();
        new ConstroctorOver(20, 20, 20).print();

    }
}