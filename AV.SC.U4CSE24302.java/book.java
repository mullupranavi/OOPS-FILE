public class Book{
   String title;
   String author;
   int yearOfpublication;
   int price;
   public Book(String title, String author, int year of publication, int price){
          this.title=title;
          this.author=author;
          this.yearOfpublication=yearOfpubication;
          this.price=price';}
    public void displayDetails(){
       System.out.println("this.title);
       System.out.println("this.author");
       System.out.println("this.yearOfpublication");
       System.out.println("this.price");
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
   
