import java.util.Scanner;
import java.util.Random;
public class Numbergame{
    public static void numberguessing(){
        Scanner obj=new Scanner(System.in);
        int num=1+(int)(100*Math.random());
        int trial=5;
        int i,guess;
        System.out.println("welcome to number guessing game ,a number can be chosen between 1 to 100");
        System.out.println("you have 5 chances ");
        System.out.println("lets start the game!! ");
        for(i=0;i<trial;i++)
        {
            System.out.println("Guess the number: ");
            guess=obj.nextInt();
            if(num==guess){
                System.out.println("congrats!! you guessed the number"+ " you won the game");
                break;
            }
            else if (num>guess && i!=trial-1){
                    System.out.println("the number is greater than "+ guess  + "try again");
                    
                }
            else if (num < guess && i!=trial-1){
                    System.out.println("the number is lesser than " + guess + " try again");
            }
        }
        if(i==trial) {
          System.out.println("chance was over you lose the game");
          System.out.println("the number was "+ num);
          System.out.println("thanks for playing the game!!");
                }
         }
         public static void main(String args[])
         {
            numberguessing();
            }
}
