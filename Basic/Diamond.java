// interface Interface1 {
//     default public void foo() {
//         System.out.println("Interface 1 foo");
//     }
// }

// interface Interface2 {
//     default public void foo() {
//         System.out.println("Interface 2 foo");
//     }
// }

class BaseClass{
     public void foo() {
        System.out.println("BaseClass  foo");
    }
}

interface BaseInterface {
    default public void foo() {
        System.out.println("BaseInterface  foo");
    }
}


// public class Diamond implements Interface1, Interface2 {
    public class Diamond extends BaseClass implements BaseInterface {
    // public void foo() {
    //     Interface1.super.foo();
    // }

    public static void main(String[] args) {
        new Diamond().foo();
    }
}