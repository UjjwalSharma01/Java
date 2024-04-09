import java.util.Scanner;
public class array {
  public static void main (String [] args){
    // wrapper functions and wrapper class
    /*
    used to convert primitive datatypes into objects and vice versa
    
    */
    // int i = 10;
    // Integer iobj = i; // autoboxing

    // Integer iobj2 = 3;
    // int j = iobj2; //unboxing


    // arrays in java
    /* 
    array is a object in java and you can also pass objects into it 
    created using new operator
    syntax
    int[] var1;
    int var2[]; 

    [] => known as subscript operator
    */
    int arr[] = new int[5]; // this can be used to make dynamic array but putting n here and taking it as input
    int arr1[] = {10,20,30}; //static array
    System.out.println(arr1[1]);
    // using loop to print everything
    for(int u = 0;u<3;u++){
      System.out.println(arr1[u]);

      // creating dynamic array
      Scanner r  = new Scanner(System.in);
      int number = r.nextInt();
      // similarly nextline, nextdouble etc to read other datatypes
    }
  }
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}