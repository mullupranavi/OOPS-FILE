public class Book {
  String title;
  String author;
  int year_of_publication;

  public Book(String title, String author, int year_of_publication ) {
      this.title = title;
      this.author = author;
      this.year_of_publication = year_of_publication;
  }
public void displayDetails() {
     System.out.println(this.title);
     System.out.println(this.author);
     System.out.println(this.year_of_publication);
     System.out.println();
  }
}