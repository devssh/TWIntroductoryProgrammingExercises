/**
 * Created by DEVASHISH on 7/15/2016.
 */
public class FizzBuzz {

    public static void fizzbuzz(int n){
        for (int i = 1; i <n ; i++) {
            if(i%3==0){
                System.out.print("Fizz");
            }
            if (i%5==0){
                System.out.print("Buzz");
            }
            if(i%3!=0&&i%5!=0)
                System.out.println(i);
            else
                System.out.println();
        }
    }

    public static void main(String[] args) {
        fizzbuzz(100);
    }
}
