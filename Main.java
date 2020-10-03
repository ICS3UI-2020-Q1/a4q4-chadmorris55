import java.util.Scanner;
/**
 * finds the largest integer out of the three given
 * @Chad 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner for user input
    Scanner input = new Scanner(System.in);
    //store constants here
    final int FIZZ_DIV = 3;
    final int BUZZ_DIV = 5;

    System.out.println("Please enter a positive integer to see the FizzBuzz numbers");
    int number = input.nextInt();
    int count = 1;
    while (count <= number){ 
      if(count % FIZZ_DIV == 0 && count % BUZZ_DIV == 0){
        System.out.println("FizzBuzz");
        count = count + 1;
      } else if (count % FIZZ_DIV == 0){
        System.out.println("Fizz");
        count = count + 1;
      } else if (count % BUZZ_DIV == 0){
        System.out.println("Buzz");
        count = count + 1;
      } else {
        System.out.println(count);
        count = count + 1;
      }

    }
  }
}
