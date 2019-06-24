enum PrinterType{
    DOTMATRIX(5), INJET(10), LASER(50);

    private int pagePrintCapacity;

    private PrinterType(int pagePrintCapacity){
        this.pagePrintCapacity = pagePrintCapacity;
    }

    public int getPageCapacity(){
        return pagePrintCapacity;
    }
}

public class Enum{
    PrinterType printerType;
     
    public Enum(PrinterType printerType){
        this.printerType = printerType;
    }

    public void feature(){
        switch(printerType){
            case DOTMATRIX: System.out.print("DOTMATRIX ");
            break;
            case INJET: System.out.print("INJET ");
            break;
            case LASER: System.out.print("LASER ");
            break;
        }

        System.out.println(printerType.getPageCapacity());
    }
    public static void main(String[] args) {
        // Enum enum1 = new Enum(PrinterType.LASER);
        // enum1.feature();

        // Enum enum2 = new Enum(PrinterType.DOTMATRIX);
        // enum2.feature();

        System.out.println(PrinterType.values());
        }
}