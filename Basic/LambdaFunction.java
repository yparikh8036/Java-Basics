
interface LambdaFun {
    public void call();
}

public class LambdaFunction {
    public static void main(String[] args) {
        // LambdaFun lambdaFun = () -> System.out.print("Hello World");//Expression lambda
        // LambdaFun lambdaFun = () -> { System.out.print("Hello World"); }; //Block lambda

        // LambdaFun lambdaFun = new LambdaFun() {
        //     //if you don't write public then it will throw compil time error
        //     public void call() {
        //         System.out.print("Hello World");
        //     }
        // };
        // lambdaFun.call();
                String word = "hello";
        LambdaFun lambdaFun = () -> System.out.print(word + " World");//Expression lambda
        //word = word + "avc";
        lambdaFun.call();
    }
}