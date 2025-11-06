/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building implements HouseRequirements{

  private ArrayList<Student> residents; // The <Student> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom; 

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<>();
    this.hasDiningRoom = hasDiningRoom;

    System.out.println("You have built a house: 🏠");
  }
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  } 

  public int nResidents(){
    return this.residents.size();
  }

  public void moveIn(Student s){
    if (!this.residents.contains(s)){
      this.residents.add(s);
    }
    else{
      System.out.println(s.getName() + " already lives here! Can't move in!");
    }
  } 


  public Student moveOut(Student s){
    if (this.residents.contains(s)){
      this.residents.remove(s);
      return s;
    }
    else{
      System.out.println(s.getName() + " does not live here! Can't be removed");
      return s;
    }
  } 

  public boolean isResident(Student s){
    if (this.residents.contains(s)){
      return true;
    }
    else{
      return false;
    }
  } 


  public static void main(String[] args) {
    Student Isa = new Student("Isa", "999999999", 2028);
    House Lamont = new House("Lamont", "19 Prospect St", 4, true);
    Lamont.residents.add(Isa);
    System.out.println(Lamont);

    System.out.println(Lamont.hasDiningRoom());
    System.out.println(Lamont.residents);

    Student Iris = new Student("Iris", "999999992", 2028);
    Lamont.moveOut(Iris);

  }

}