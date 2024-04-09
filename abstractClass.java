public class abstractClass{
  public static void main(String [] args){
    /*
    Abstract classes and methods
    abstract methods are those methods which donot have their implementations defined by abstract keyword

    any class that contains abstract method is known as abstract class and uski implementation nahi kri ja skti 

    agr ek bhi abstract method hua toh then the class should be declared as abstract and usko inherit krke override krna pdega uska function
    can also contain concrete methods and interface main sab abstract hote h
    */



    abstract class ujjwal{
      public void greet(){
        System.out.println("Hello jiii");
      }
      abstract public void sName();
    }

    class sharma extends ujjwal{
      @Override
      public void sName(){
      System.out.println("aatrey");
      }
    }

    // creating an object 
    sharma a = new sharma();
    a.sName();






    
  }
}