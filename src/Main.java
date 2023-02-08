import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // NUMBER DEFINE AND INITIALIZATION
        Scanner scanner = new Scanner(System.in);
        int number = (int) (Math.random() * 100);
        int userInput;

        // DISPLAY MESSAGE
        System.out.println("NUMBER GASSING GAME");
        System.out.println("If you want to exit, Enter -1.");


        do{
            // PROCESSING
            System.out.print("Enter number : ");
            userInput = scanner.nextInt();

            if(userInput>number){
                System.out.println("Number is less then you gas.");
            }else if(userInput<number){
                System.out.println("Number is grater then you gas.");
            }else{
                System.out.println("Wow!! you did this!!");
                break;
            }

        }while (userInput>=0);
        System.out.println("Is the game so hard??");
    }
}