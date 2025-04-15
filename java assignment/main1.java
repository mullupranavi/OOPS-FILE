public class main1 { 
    public static void main(String[]args) {
       System.out.println("M.Pranavi");
       System.out.println("CSE-B");
       System.out.println("AV.SC.U4CSE24302");
       Book book_one = new Book("Golden Hour", "JVKE", 2007);
       Book book_two = new Book("Car’s Outside", "JAMES ARTHUR", 2001);
       System.out.println("Book one details: ");
       book_one.displayDetails();
       System.out.println("Book two details: ");
       book_two.displayDetails();
      }
  }