public class Main {

    public static void main(String[] args) {

        int n = 100;

        fizzBuzz(n);



    }
    public static void fizzBuzz(int n) {


        
        for(int i = 1; i <= n; ++i) {
            
            String res = ((i % 3 == 0) ? "Fizz" : "") + ((i % 5 == 0) ? "Buzz" : "");

            System.out.println((res.isEmpty()) ? i : res );

            
        }

    }
}