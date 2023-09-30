public class HundredthPrime
{
   public static void main(String[] args) {
      int count = 1;
      int num = 1;

      while (count < 100) {
         num++;
         for (int divisor = num - 1; divisor > 1; divisor--) {
            if (num % divisor == 0) {
               break;
            }
            else if (divisor == 2) {
               count++;

            }
         }
      }
      System.out.println(num);
   }
}


