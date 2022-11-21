import java.util.*;

class Main {
  public static void main(String[] args) {
    List<Integer> intListExample = ListCreator.generateIntArrayList();

    log("Integers you added to the first list:");

    /* Sample */
    for (int num : intListExample) {
      log(num);
    }

    /* Section 3 */
    List<Integer> intList = ListCreator.generateIntArrayList();
    int max = intList.get(0);

    /* Section 4 */
    for (int val : intList) {
      if (max < val) {
        max = val;
      }
    }

    /* Section 5 */
    log("Maximum number in second list: " + max);
  }

  public static void log(Object message) {
    System.out.println(message);
  }
}