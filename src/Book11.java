import java.util.Scanner;

public class Book11 {
	
	private static Scanner keyboard;

	public static void main(String[] args)
	{
		
		// enter number of pages
		keyboard = new Scanner(System.in);
		System.out.print("Enter the number of pages: ");
		int numPages = keyboard.nextInt();
		int currentPage = 1;
		
		//print page one
		System.out.println(currentPage);
		
		//print flipped pages
		for (int i = currentPage; i < numPages; i++){
			
			if (currentPage < numPages) {
				currentPage++; System.out.println(currentPage); }
			
		}
	}
	
/*	
		public nextPage() {

			if (currentPage < numPages)
				currentPage++; System.out.println(currentPage);
			else
				System.out.println("The book is finished.");
		}	
	
	*/

}
