/* This is a stub for the House class */

import java.util.ArrayList;

/**
 * Class contains information for creating a house. 
 */
public class House extends Building implements HouseRequirements{

  private ArrayList<Student> residents; // The <Student> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom; 

  /**
   * House constructor
   * @param name Name of House
   * @param address Address of House
   * @param nFloors Number of floors of house
   * @param hasDiningRoom whether the house has a dining room
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<>();
    this.hasDiningRoom = hasDiningRoom;

    System.out.println("You have built a house: 🏠");
  }

  /**
   * Says whether the house has a dining room
   * @return T/F: yes or no dining hall
   */
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  } 

  /**
   * Says the number of residents in the house (returns size of the list of residents)
   * @return number of residents 
   */
  public int nResidents(){
    return this.residents.size();
  }

  /**
   * Says whether or not a student can move in and adds them to the list of residents if they can move in
   * @param s is the student who is trying to move in
   */
  public void moveIn(Student s) {
    if(!this.residents.contains(s)){
        this.residents.add(s);
      }else{
        throw new RuntimeException(s.getName() + " already lives here, cannot move in.");
      }
    } 

  /**
   * Says whether or not a student can move out. If they don't live in the house, they cannot move out.
   * Otherwise, they are removed from the list of residens
   * @param s Student trying to move out.
   * @return the Student moving out. If no one is moving out, an error gets thrown. 
   */
  public Student moveOut(Student s){
    if (this.residents.contains(s)){
      this.residents.remove(s);
      return s;
    }
    else{
      throw new RuntimeException(s.getName() + " does not live here, cannot be removed.");
    }
  } 
  
  /**
   * Says whether or not a student lives in the house
   * @param s Student that the method checks if they are a resident
   * @return T/F: are they a resident 
   */
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