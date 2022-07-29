import java.util.Scanner;

class OnlineLibrary {// to create the class of online linbrary
  Scanner on = new Scanner(System.in);// creating the object of the input Scanner

   String[] book = {"","","",""," "};

  public void addBook() {// create the function to add the book
    System.out.println("Enter the book to add...");
    for (int i = 0; i < book.length-1; i++) {// for loop is use to taking the input and store the element int the array of
                                           // quntity of the book
      System.out.print(i + 1 + ".");
      book[i] = on.nextLine();// taking the input
    }
    System.out.println("successfuly stored...");// after complete storeing the array of bookname. print this message
  }
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  String[] Isbook = new String[3];// create the issue book array
  String[] removed = new String[Isbook.length];// create the removedbook array

  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  public void issuedBook() {// function of issue book
    for (int i = 0; i < book.length -1; i++) {
      System.out.println("*"+book[i]);
    }

    int number = 0;// create the number assign 0 to it.
    System.out.println("Enetr the book(Stringsss)");
    for (int i = 0; i < Isbook.length; i++) {// to take the list of book to buy
      Isbook[i] = on.nextLine();// taking input of the book
      String mac = BookFind(book, Isbook, Isbook[i], "");
      removed[number] = mac;
      number++;
    }
    System.out.println("issued books...");
    int i = 1;
    for (String num : removed) {
      System.out.println(i + "." + num);// then it will show the issued book
      i++;// to incriment OnlineLibrary yes = new OnlineLibrary();
    }
    System.out.println("present book in array");
    int kl=Isbook.length;
    int jk=book.length-1;
    int jj=jk-kl;
    for (int k = 0; k < jj; k++) {
      System.out.println("*"+book[k]);
  
    }
    System.out.println(book.length+"the length of the book");
    System.out.println(jj+" book is prasent\n\n");
  }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  public void returnBook() {
    int i = 1;
    System.out.println("issued books to you :");
    for (String number : removed) {// showing the customer to issued book from them.
      // show all the list of the issued books
      System.out.println(i + "." + number);
      i++;
    }
    System.out.println("which book you will return..");
    int retu = on.nextInt();
    int len = book.length-retu;
    
    for (int j = len; j < 4; j++) {// which book to return enter it
      String ne = on.nextLine();// it will store the string
      book[len] = retuBook(book, Isbook, ne);
      len++;// incriment
    }

    System.out.println(retu + " books are returned");

  }
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  /*
   * function for removing the elements
   */

  public static String BookFind(String[] book, String[] Isbook, String ib, String Bname) {
    Bname=ib;
    for (int i = 0; i < book.length; i++) {
      String pro=book[i];
      if(pro.equals(ib)){
        for (int j = i; j < book.length- 1; j++) {
          book[j] = book[j + 1];
        

      }

    }

  }
  return Bname;
  }
  public static String retuBook(String[] book, String[] Isbook, String na) {
    String Bname = "";
    for (int i = 0; i < Isbook.length; i++) {
      if (na.equals(Isbook[i])) {
        Bname = na;
        for (int j = i; j < Isbook.length - 1; j++) {
          Isbook[j] = Isbook[j + 1];
          break;
        }
      }

    }
    return Bname;
  }
}

public class library {
  public static void main(String[] args) {
    Scanner on = new Scanner(System.in);
    OnlineLibrary yes = new OnlineLibrary();
    System.out.println("Enter the length of the array:");
    while (true) {
      System.out.println("1.add books\n2.issue book\n3.return book");
      System.out.println("Enter your choice :");
      int choice = on.nextInt();
      if (choice == 1) {
        yes.addBook();
      } else if (choice == 2) {
        yes.issuedBook();
      } else if (choice == 3) {
        yes.returnBook();
      } else {
        break;
      }
    }

  }

}
