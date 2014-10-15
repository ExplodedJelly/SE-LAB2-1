import java.util.Date;


public class Book {
	private int isbn;
	private String title;
	private int authorid;
	private String publisher;
	private Date publishDate;
	private float price;
	public int getIsbn(){
		return isbn;
	}
	public String getTitle(){
		return title;
	}
	public int getAuthorid(){
		return authorid;
	}
	public String getPublisher(){
		return publisher;
	}
	public Date getPublishDate(){
		return publishDate;
	}
	public float getPrice(){
		return price;
	}
	public void setIsbn(int isbn){
		this.isbn=isbn;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public void setAuthorid(int authorid){
		this.authorid=authorid;
	}
	public void setPublisher(String publisher){
		this.publisher=publisher;
	}
	public void setPublishDate(Date publishDate){
		this.publishDate=publishDate;
	}
	public void setPrice(float price) {
		this.price=price;
	}
}
