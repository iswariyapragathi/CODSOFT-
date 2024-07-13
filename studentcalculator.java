import java.util.Scanner;
public class studentcalculator
{
    public static void main(String args[])
    {
        int tot=0,avg=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of subjects :");
        int n=obj.nextInt();
        int marks[]=new int[n];
        System.out.println("Enter the marks of the sublects :");
        for(int i=0;i<n;i++)
        {
            System.out.println("mark of subject" + (i+1) + ":");
            marks[i]=obj.nextInt();
        tot = tot+marks[i];
        }
        System.out.println("your total mark is :" +tot);
        avg=tot/n;
        System.out.println("your average score is :" + avg +"%");
         if(avg>=90)
         {
            System.out.println("you have got : A grade-OUTSTANDING!");
         }
         else if(avg>=80 && avg< 90){
            System.out.println("you have got : B grade- EXCELLENT!");
         }
         else if(avg>=60 && avg <80){
            System.out.println("you have got : C grade- VERY GOOD!");
         }
         else if(avg>=40 && avg<60){
            System.out.println("you have got : D grade- GOOD!");
         }
         else if(avg>=30 && avg <40){
            System.out.println("you have got : E grade -POOR!");
         }
         else{
            System.out.println("you have got : U grade - FAIL!!");
         }
         }
    }

