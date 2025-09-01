// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
      System.out.println("Do you want to play calculator game" + " " + "Please enter Yes or No");
       Scanner console = new Scanner(System.in);
      String response = console.next();
      //System.out.println(response);
      int rounds = 0;
      int addrounds = 0;
      int multiplyrounds = 0;
      int substractrounds = 0;
      int dividerounds = 0;
      while (!(response.equalsIgnoreCase("No"))) {
          if((response.equalsIgnoreCase("Yes"))){
        System.out.println("Please enter the first number of your choice");
        int number1 = console.nextInt();
        System.out.println("Please enter the second number of your choice");
        int number2 = console.nextInt();
        System.out.println("Please enter the the operation that you want to perform i.e. Add/Substract/Divide/Multiply");
        String operation = console.next();
      if (operation.equalsIgnoreCase("Add")){
        int answer =  Add(number1, number2);
        System.out.println("The answer for the addition of the 2 numbers that you chose is" + " " + answer);
        System.out.println("Do you want yo continue..either enter Yes or No ");
        response = console.next();
        rounds++;
        addrounds++;
        
      }
      else if (operation.equalsIgnoreCase("Substract")){
       int answer = Substract(number1, number2);
       System.out.println("The answer for the substraction of the 2 numbers that you chose is" + " " + answer);
       System.out.println("Do you want yo continue..either enter Yes or No ");
        response = console.next();
       rounds++;
       substractrounds++;
      }
      else if (operation.equalsIgnoreCase("Divide")){
        int answer = Divide(number1, number2);
        System.out.println("The answer for the division of the 2 numbers that you chose is" + " " + answer);
        System.out.println("Do you want yo continue..either enter Yes or No ");
        response = console.next();
        rounds++;
        dividerounds++;
      }
      else {
     int answer = Multiply(number1, number2);
      System.out.println("The answer for the Multiplication of the 2 numbers that you chose is" + " " + answer);
      System.out.println("Do you want yo continue..either enter Yes or No ");
        response = console.next();
      rounds++;
      multiplyrounds++;
          
      }
      
    }
      }
      System.out.println("You have played " + " " + rounds + " rounds");
      System.out.println("You have selected addition " + " " + addrounds + " times");
      System.out.println("You have selected substraction " + " " + substractrounds + " times");
      System.out.println("You have selected division " + " " + dividerounds + " times");
      System.out.println("You have selected multipy " + " " + multiplyrounds + " times");
    }  
    static int Add(int x, int y){
        return x + y;
    }
    static int Substract(int x, int y){
        return x - y;
    }
    static int Divide(int x, int y ){
        return x/y ;
    }
    static int Multiply(int x, int y){
        return x*y;
    }
}
