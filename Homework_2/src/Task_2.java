/*
  Задание 2. Если необходимо, исправьте данный код
     try {
          int d = 0;
          double catchedRes1 = intArray[8] / d;
          System.out.println("catchedRes1 = " + catchedRes1);
      } catch (ArithmeticException e) {
           System.out.println("Catching exception: " + e);
     }
 */

public class Task_2 {
    public static void main(String[] args) {
        except();
    }

    public static void except() {
        // int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        // int[] intArray = {0, 1, 2, 3};
        Integer[] intArray = { 0, 1, 2, 3, 4, 5, 6, 7, null };
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (NullPointerException e) {
            System.out.println("Catching exception: " + e);
        }
    }

}
