
public class Book {
	protected int pages = 1500;
	
	//if you are changing a private/protected variable
	//you call the setter a mutator
	public void setPages (int numPages) {
		pages = numPages;
	}
	
	//if you want to access a private/protected variable
	//you call the getter a accessor
	public int getPages() {
		return pages;
	}

}
