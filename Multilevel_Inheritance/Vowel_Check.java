package Inheritance;
public class Vowel_Check extends Greater
{
	
	 public static void vowel()
	 {
		 greater();
		 
		 

	     //Taking a input from user
	     System.out.print("Enter the Characters : ");
	     
	     ch = sc.next().charAt(0);

	     //Conditions to check its vowels or consonent
	     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
	     {
	         System.out.println("It is Vowel : "+ch);
	     }

	     else
	         System.out.print("Is is Consonent : "+ch);
	 }
	 
	

}
