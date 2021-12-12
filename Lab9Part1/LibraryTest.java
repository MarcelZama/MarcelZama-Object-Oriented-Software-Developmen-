public class LibraryTest {

	public static void main(String[] args) {
		LoanItem[] items = new LoanItem[2];
		
		items[0] = new CD("Beatles", "With the Beatles", 20);
		items[1] = new Book("Astronaut Mark Kelly", "Mousetronaut", 100);        

	    for (LoanItem item : items) {
			System.out.println(item.calculatePrice());
	    }
	}

}