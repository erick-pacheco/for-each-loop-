# Instructions  

### Description:
In this activity you will learn how to use a for each loop/enhanced for loop. The for each loop is used exclusively for iterating over an array or a collection. 

Let's compare a `for loop` to a `for each loop`. Look at the syntax below:
```
for (int i = 0; i < array.length; i++) {

}
```
With a for loop, you can specify a starting value for your variable, the condition, and the update statement. This allows you to create loops for a wide variety of situations.
```
for (int i : array) {

}
```
Because the for-each loop is specifically designed for iterating over an array or collection, the syntax is more concise and does not require you to initialize the variable, provide a condition, or update the variable. The loop is guaranteed to start at the beginning of the array or collection, and go no further than the last element.

Please follow the steps below:

### Steps:
1. There is a file called ListCreator.java already created. It defines a static Scanner object and a static method named *generateIntArrayList()*. You do not need to look at this file to complete this exercise, but it is highly recommended that you step through the method to learn more about how it works.
    <br><br>
    What we do need to understand is what the *generateIntArrayList()* does: it takes in 5 integers from the console and returns a List containing those elements. We'll use this method to create the lists we'll iterate over in the next steps.

2. Inside the main() method, add in the following code:
```Java
    List<Integer> intListExample = ListCreator.generateIntArrayList();
    System.out.println("Integers you added to the first list:");
    for (Integer num : intListExample) {
        System.out.println(num);
    }
```
  The first statement creates a list of 5 integers using the the *generateIntArrayList()* method mentioned in the previous step. This list is saved into the variable *intListExample*. The next statement prints a String to the console. The last statement is a for-each loop. In our for-each loop's parameters, we create a variable named *num* that will temporarily hold the current element during every iteration. We also name the collection we want to iterate over, which is *intListExample*. In the loop's code block, we simply print the current element's value to the console.

Run the program. Enter in 5 integers into the console and see if the results are what you expected.

3. The next thing we'll do is find the maximum value in a collection. To do this, we can follow this simple algorithm:

    1. Create a variable to hold the maximum value
    2. Iterate through each element in the collection
    3. For-each of those elements: 
        - Compare the current element to the max
        - if the current element is greater, set the max equal to the current element

After the for-each loop ends, the variable max will hold the greatest value in the collection.

Let's start implementing the algorithm. Inside the main() method, add in the following code below any code you have in it so far:
```Java
    List<Integer> intList = ListCreator.generateIntArrayList();
    int max = intList.get(0);
```
This code generates another list from console input and saves it into a variable. Then, the variable *max* is created and is initialized to the first element in the list. This completes step 1 of the algorithm.

4. From what you've learned about for-each loops, create your own to loop over *intList* so that you finish the algorithm and save the maximum integer into *max*. 
  
5. To see if the correct value is stored in *max*, let's print it out. Add in the following code inside the main() method, below any code you have in it so far:
```Java
 System.out.println("Maximum number in second list: " + max);
```
Run the program. Enter in your own values and see if each for-each loop is behaving as intended.

### Test:
Use the test provided.

#### Sample:
Input:
```
1
2
3
4
5

50
40
30
20
10
```
Output:
```
Enter 5 integers (press enter after every integer): 
1
2
3
4
5
Integers you added to the first list:
1
2
3
4
5
Enter 5 integers (press enter after every integer): 
50
40
30
20
10
Maximum number in second list: 50
```
  