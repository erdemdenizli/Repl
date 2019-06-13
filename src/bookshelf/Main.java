package bookshelf;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book = new Book(10, "erdem deniz", "let's goo", 5);
		
		//book.setAuthor("erdem deniz");
		
		System.out.println(book.getAuthor());
		
		System.out.println(Shelf.addBook(new Book(10, "erdem deniz", "let's OF goo", 5)));
		
		System.out.println(Shelf.addBook(book));
		
		System.out.println(Shelf.getTitleByID(10));
		
	}

}
