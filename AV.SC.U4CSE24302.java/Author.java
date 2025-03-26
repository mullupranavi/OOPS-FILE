public class Book{
   String title;
   String author;
   int yearOfpublication;
   int price;
   public Book(String title, String author, int yearOfpublication, int price){
          this.title = title;
          this.author = author;
          this.yearOfpublication = YearOfpubication;
          this.price=price;
         }
    public void displayDetails(){
       System.out.println("Title:"+this.title);
       System.out.println("Author:"+this.author);
       System.out.println("Year Of publication:"+this.yearOfpublication);
       System.out.println("Price:"+this.price);
       System.out.println();

    }
  }
  public class Author{
    public static void main(String[]args){
    Book bookone = new Book("Car's Outside","James Aruthur",1985,1500);
    Book booktwo = new Book("Golden Hour","JVKE",2022,2000);
    System.out.println("Book one details:");
    bookone.displayDetails();
    System.out.println("Book two details:");
    booktwo.displayDetails();
    }
  } 
   
