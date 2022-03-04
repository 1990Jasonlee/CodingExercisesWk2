public class Solution {

  // use this method as a prototype for your answers...
  //For loop from 100 to 5 by 5. print index var.

    for (int i = 100; i >= 5; i—=5){
    System.out.println(i);
  }
  
  void soln2() {
      //For loop from 100 to 5 by 5. do nothing inside the loop.
    for (int i = 100; i >= 5; i -= 5){

    }
  }

  void soln3() {
      //Sum Integers from 9 to 17, print sum
      int sum=0;
      for (int i=9;i<=17;i++){
        sum+=i;
      }
      System.out.println(sum);
    }
  
  void soln4() {
      //Find and print the smallest integer in an array a = [9, 5, 6, 3, 8, 2, 4];
    int smallest = a[0];
    for(int i =0; i < a.length - 1; i++){
      if (a[i] < smallest){
        smallest = a[i];
      }
    }
    System.out.println(smallest);
  }
  
  void soln5() {
      //Find largest integer in the last array and print it.
    int largest = a[0];
    For (int i = 1; i<a.length; i++) {
      if (a[i] > largest) {
        largest = a[i];
      }
    }System.out.println(largest);
  }
  
  void soln6() {
      //Find and print index of first true element
    // in an array of booleans a = [false, false, false, true, false];
    for (int i = 0; i < a.length; i++){
      if (a[i] == true)
      System.out.println(i);
      break;
    }
  }
  
  void soln7() {
      //Find and print index of first true element in an array of booleans (must use a while loop)
    int i = 0;
      while (a[i] == false) {
        i++;
      }
          System.out.println(i);
    }
  
  void soln8() {
      //add 5 to every element of an array of integers a = [9, 5, 6, 3, 8, 2, 4]
    for (int i = 0; i < a.length; i++) {
      a[i] = a[i] + 5;
     }
  }
  void soln9() {
      //divide each element of an array by 1.3; a = [0.5, 1.4, 6.7, 123.4 -34.6]
      for (int i = 0; i < a.length; i++) {
        a[i] = a[i] / 1.3;
      }
    }
  void soln10() {
    //raise each element of a double array to it's 3rd power and
    // subtract the original element's value by the value divided by 3.0 a = [1.3, 5.4, 6.1, 1.0, 9.2];

    for (int i = 0; i < a.length; i++) {
          Math.pow(a[i], 3) - a[i] / 3);
        }
      }
  void soln11() {
      //getZero( int row, int column)
      // zero out a 4 by 6 integer array
    for (int row = 0; row < array.length; row++){
      for (int column = 0; column < array[row].length); column++){
        array[row][column] = 0;
      }
    }
  }
  
  void soln12() {
  // multiply each element of a 5 by 5 array of integers by 7
    for (int row = 0; row < array.length; row++){
      for (int column = 0; column < array[row].length); column++){
        array[row][column] *= 7;
      }
    }
  }
  
  void soln13() {
  // create a method that takes a 5 by 5 array and produces a 5 by 5 array of booleans.
    // each element in the result should be true if the value in the argument array is even, else it's false.
      boolean[][] result = new boolean[array.length][array[0].length];
      for (int row = 0; row < array.length; row++){
          for (int column = 0; column < array[row].length); column++){
          if ([]  %2 = 0){
            result[i][j] = true;
            return result;
          }
        }
      }
  }
  void soln14() {
  // create a method that takes two doubles and returns the first parameter raised to the second parameter's value
          return Math.pow(firstPerm,secondPerm);
  }
  
  void soln15() {
  // create a method that returns a boolean if the Object passed to it is a Fish or not
           return Object instanceof Fish;
          }
        //study
  void soln16() {
  // There is an object x which has a method (double)Balance().
    // Build an IF statement that prints "Paid Off" if the result of the balance call is less than of equal to 1.0,
    // else it prints the balance as a Dollar figure (2 decimal places)

          if (balance <= 1.0){
            System.out.println("Paid Off");
          }else {
            System.out.println(String.format("%.2f", balance));
          }
  }
  
  void soln17() {
  // Build a WHILE loop that turns on the heat
    // if the thermo.getTemp() is less than 72.0 else it turns on the A/C if thermo.getTemp() is greater that 76.0.

          while (true) {
            if (temp > 76) {
              method acOn
            } else if {
              (temp < 72) {
                method heatOn
              }
            }
          }
  }
  
  void soln18() {
  // Find a number greater than Pi in a double array, print number and its index.
          double pi = Math.PI;
          for (int i = 0; i<a.length; i++) {
            if (a[i] > pi) {
              System.out.println(a[i] +" at index "+ i);
              break;
            }
          }
        }
  
  void soln19() {
  // Given an array of objects (of class Xaction) w/nulls,
    // sum all the values of the objects in the array, using Xaction::getValue(). Print the sum.
        for (int i = 0; i<a.length; i++) {
          if (array[i] != null) {
            sum += i;
          }
          return sum;
        }
  }
  
  void soln20() {
  // reverse an array of objects of type Xaction
        String[] reverse = new String[array.length];
        for (int i = 0; i <= array.length/2 ; i++) {
          reverse[i] =array[array.length - i - 1];
          reverse[reverse.length - i - 1] = array[i];
        }
        return reverse;
  }
  
  void soln21() {
    // Print a 5's times table
    String table = "";
    if (int i= 0; i < 6; i++){
      if int j =0; i < 6; j++){
        table = i*j;
      }table += "\n";
    }return table;
  }
  
  void soln22() {
      //detemine the hypotenuse of a 9 by 7 right triangle, assign it to a double
    return math.pow(9,2.0) + math.pow(7,2.0) }
}