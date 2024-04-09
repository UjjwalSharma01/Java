import java.util.Scanner;
public class staticVariable {
  static int count = 0;
  Student() {
    count++;
    System.out.println(count);
  }
  public static void main (String[] args){
    Student obj1 = new Student();
    Student obj2 = new Student(); // initalises the object
    // System.out.println(Student.count);
  }
}

// static variables that shares the memory with all the instances and belongs to the class they are not initalised newly with the creation of new object everytime
// static methods => just like static variables they share memory among all the instances of the class, it can access only static members and cannot access noon static members
