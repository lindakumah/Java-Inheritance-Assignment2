package JavaInheritanceAssign2;

class Author{
	private String name;
	private String email;
	private char gender;
	
	Author(String name, String email,char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public String toString() {
		return (name + " (" + gender + ")" + " at " + email);
	}
}

class Book{
	private String name;
	private Author author;
	private double price;
	private int qty;
	
	Book(String name, Author author, double price, int qty ){
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Author getAuthor() {
		return this.author;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getQty() {
		return this.qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String toString() {
		return (name + " by " + author.toString());
	}
}

public class Q1 {

	public static void main(String[] args) {
		Author details = new Author("Tan Ah Teck", "ahTech@somewhere.com", 'm');
		Book B = new Book("Life Lessons ", details, 5000, 50);
        
		System.out.println(details.toString());
		System.out.println(B.toString()); 
	}

}
