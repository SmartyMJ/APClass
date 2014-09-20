package BookTestPackage;

public class Book2 {
	private int numPages;
	private int currentPage;

	public void initialize(int page){
		numPages = page;
		currentPage=1;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	public void nextPage(){
		if (currentPage < numPages){
			currentPage++;
		}
	}
	
}
