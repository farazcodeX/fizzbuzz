public class Main {

    public static void main(String[] args) {

        int n = 100;

        fizzBuzz(n);



    }
    public static void fizzBuzz(int n) {


        
        for(int i = 1; i <= n; ++i) {

            // if you want to expand the code , you just add more number and letter here
             
            String res = ((i % 3 == 0) ? "Fizz" : "") + ((i % 5 == 0) ? "Buzz" : "");

            System.out.println((res.isEmpty()) ? i : res );

            
        }

    }
}