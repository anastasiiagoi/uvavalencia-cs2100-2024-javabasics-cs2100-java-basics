public class SumofInts {

        public static void main(String[] args) {
    
            int targetSum = 30;
    
            int[] array = {10, 20, 30, 40, 50, 60};
    
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == targetSum) {
                        
                        System.out.println("Pair found: " + array[i] + " + " + array[j] + " = " + targetSum);
                    }
                }
            }
        }
    }
   
