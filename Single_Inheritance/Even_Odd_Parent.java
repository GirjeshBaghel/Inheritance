
//WAP to do the process of  Even Odd Operation Using Single Inheritance
package Inheritance;
import java.util.Scanner;
class Even_Odd_Parent
{
  
  static int no;
  public static void even_odd()
  {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a no : ");
      no = sc.nextInt();
      System.out.println("The no is : "+no);
      if(no%2 ==0)
      {
          System.out.println("Even no : "+no);
      }
      else
      System.out.println("Odd no : "+no);

  }
}
