package BookTestPackage;

public class BookTest {
	
	public static void main(String[] args){
		Book2 twilight = new Book2();
		twilight.initialize(3);
		
		Book2 newMoon = new Book2();
		newMoon.initialize(45);
		
		for(int i =0; i<3; i++){
			System.out.println("The current page is:" + twilight.getCurrentPage());
			twilight.nextPage();
			System.out.println("newMoon is on page:" + newMoon.getCurrentPage());
			newMoon.nextPage();
		}
		
		
	}

}
