/*

Interface => is a collection of abstract methods (used to implement multiple inheritance)
interface main agr koi method h toh us method ki koi defination nahi hogi and agr aap usko inherit kroge then you need to override all the abstract functions present in the interface
1. a class implements an interface

Note => unless the class that implements the interface is abreract, all the methods of the interface needs to be defined in the class

synatax => class c1 implements i1

example
interface i1{
function 1
function 2
}
class c implements i1{ // if i write abstract in front of this class then only it can contain interface normally otherwise needs to be defined again

}

interface implementation program => left

*/

public interface a {
  default public void greet(){
    System.out.println("hello");
  }

  public void namaste(); // needs to be overriden
}
public class b implements a{
  @Override
  public void namaste(){
    System.out.println("namaste");
  }

}
public class interfaces{
  public static void main(String[] args){
    // interfaces, have abstract classes and we can make, contains default methods static methods and method with their declaration only
    // ujjwal a => new sharma();
  }
}