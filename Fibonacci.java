public class Fibonacci {
    int fib(int n) {
        if (n >= 3) { 
                    return fib(n-1) + fib(n-2);
                   }
                else {
                    return 1;
                  }
      }
    
    
}
