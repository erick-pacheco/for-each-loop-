import java.util.*;


public class ListCreator {

  // create Scanner object
  public static  Scanner sc = new Scanner(System.in);

  // create List generator method
  public static List<Integer> generateIntArrayList() {

    // create list
    List<Integer> tempList = new ArrayList<>();

    // set max size of list to 5
    int maxSize = 5;
    // start count at 1
    int count = 1;

    System.out.println("Enter 5 integers (press enter after every integer): ");
    // while there is an integer entered in the console 
    // AND 
    // while count is less than or equal to maxSize
    while(sc.hasNextInt() && count <= maxSize) {
      // add next integer to list
      tempList.add(sc.nextInt());
      // increment count
      count++;

      // prevent I/O test from reading next int from input
      if (count == 6) {
        break;
      }
    }

    // return the list with 5 elements added to it
    return tempList;
  }
  
}