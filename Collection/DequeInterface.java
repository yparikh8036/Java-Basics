import java.util.ArrayDeque;
import java.util.Deque;

class SplQueue{
    private Deque<String> splq=new ArrayDeque<>();
    void add(String a){
        splq.add(a);
    }
    void removefront(){
        splq.removeFirst();
    }
    void removelast(){
        splq.removeLast();
    }
    void print(){
        System.out.println(splq);
    }
}


class Aaa{
    public static void main(String[] args) {
        SplQueue s = new SplQueue();
        s.add("a");
        s.add("yash");
        s.add("parikh");

        s.print();
        s.removefront();
        s.removelast();
        s.print();
        
    }
}