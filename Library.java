/* This is a stub for the Library class */

import java.util.Hashtable;

public class Library extends Building implements LibraryRequirements{

  private Hashtable<String, Boolean> collection;
    
    public Library(String name, String address, int nFloors, Hashtable<String, Boolean> collection) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();

      System.out.println("You have built a library: 📖");
    }

    public void addTitle(String title){
      if (!this.collection.containsKey(title)){
        this.collection.put(title, true);
        System.out.println(title + " added to library");

      }
      else{
        System.out.println(title + " already in collection, cannot be added.");
      }
    }

    public String removeTitle(String title){  // return the title that we removed
      if(this.collection.containsKey(title)){

      }

    } 
     

  
    public static void main(String[] args) {
      new Library();
    }
  
  }