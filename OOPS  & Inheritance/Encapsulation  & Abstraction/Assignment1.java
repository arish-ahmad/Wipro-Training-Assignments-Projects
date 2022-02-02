
public class Assignment1 {

	public static void main(String[] args) {
		Author author1 = new Author("Arish Ahmad", "arishahmad70@gmail.com",'M');
		Book book1 = new Book("Java Programming",author1 ,2500,12);
		
		System.out.println(book1.toString());
	}
}

class Author{
	
	private String name;
	private String email;
	private Character gender;
	
	//declare parameterized constructor
	Author(String name, String email, Character gender){
		this.name = name;
		this.email = email;
		this.gender = gender;	
	}
	
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
	public char getGender() {
		return gender;
	}
	@Override
	public String toString() {
		return "Author Name: " + name + "\nAuthor Email: " + email + "\nAuthor Gender: " + gender ;
	}
}
class Book{
	
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	Book(String name, Author author, double price, int qtyInstock){
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInstock;
		
	}
	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qty) {
		this.qtyInStock = qty;
	}
	@Override
	public String toString() {
		return "Book Name: " + name +"\n"+ author + "\nPrice: " + price + "\nQtyInStock: " + qtyInStock;
	}
}