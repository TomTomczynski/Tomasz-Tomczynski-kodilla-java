import java.util.*;
import java.lang.*;
import java.io.*;

class Book{
    private String author;
    private String title;
    
    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }
    @Override
    public boolean equals(Object o){
        final Book e = (Book) o;
        return this.author.equals(e.author) && this.title.equals(e.title);
    }
	@Override
	public int hashCode(){
		return Integer.parseInt(author.substring(7));
	}	
    @Override
    public String toString(){
    	return  author;
    } 
    public String getTitle(){
        return title;    
    }
}

class Kodilla {
   public static void main (String[] args) {
       LinkedList<Book> theList = new LinkedList<>();
           	for(int n = 0; n < 800000; n++) {
			 theList.add(new Book("author_" + n, "title_"+n));
		}
		
		//Displaying quantity of elements
		System.out.println("Quantity of elements in the collection: " + theList.size());
		
		
		Book thebook = new Book("author_0", "title_0");
		//Removing the first elements
		long begin = System.nanoTime();
        theList.remove(thebook);
		long end = System.nanoTime();
		
		//Displaying time of the operation
		System.out.println("Removing the first elements from the collection has taken: " + (end - begin) + "ns");

        //Removing the last elements
		begin = System.nanoTime();
		theList.remove(theList.size() -1);
		end = System.nanoTime();

		//Displaying time of the operation
		System.out.println("Removing the last elements from the collection has taken: " + (end - begin) + "ns");
    
		begin = System.nanoTime();
		theList.add(0,new Book("author", "title"));
		end = System.nanoTime();

		//Displaying time of the operation
		System.out.println("Adding the first elements to the collection has taken: " + (end - begin) + "ns");
   
   		//Adding element at the end of the collection
		begin = System.nanoTime();
		theList.add(new Book("author_", "title"));
		end = System.nanoTime();
		
		//Displaying time of the operation
		System.out.println("Adding element to the end the collection has taken: " + (end - begin) + "ns");
        System.out.println();
    
        HashMap<Book,String> theMapList = new HashMap<>();
        for(int n = 0; n < 800000; n++) {
			 Book book = new Book("author_" + n, "title_"+n);
			 theMapList.put(book,book.getTitle());
        }
        Book book = new Book("author_0", "title_0");
        //Searching the Object in the HashMap
        begin = System.nanoTime();
        System.out.println(theMapList.get(book));
        end = System.nanoTime();
        System.out.println("Searching the Object in the HashMap has taken: " + (end - begin) + "ns");
        
        //Adding element to the HashMap
        begin = System.nanoTime();
        Book theBook = new Book("author_800000", "title_800000");
        theMapList.put( theBook,theBook.getTitle());
        end = System.nanoTime();
        System.out.println("Adding element to the HashMap has taken: " + (end - begin) + "ns");
        
        //Removing the element from the HashMap
        begin = System.nanoTime();
        theMapList.remove(theBook);
        end = System.nanoTime();
        System.out.println("Removing the element from the HashMap has taken: " + (end - begin) + "ns");
   }
}