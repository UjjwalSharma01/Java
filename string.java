/*

in java string is a object that represents the sequence of characters

library to be used 
java.lang.String

=> string is immutable and string buffer class in mutable



syntax;
string literal => String s."Hello";
agr maine same value ki string dobara bnadi then java will check that is there any string with this in string constant pool that matches the assign value, if yes then the new variable will point towards that value without creating a new object, otherwise a new object will be created with that value and the variable will point towards that value

in short different memory address is not created for same strings in java, and hence Strings are very efficient in java


new keyword=> creates object
String S1 = s1.new String("hello");


STRING TOKENIZER
in java.util package
allows you to break the string into peaces as per the requrements 

for example => ujjwalsh2004@gmail.com, now i want to to get sepeerated before "@" and after "@" symbol



*/
import java.lang.String;
public class string {
  public static void main(String [] args){
    String s = "ujjwal";
    // s.concat(" sharma"); = string will be contatenated but it will not be stored in s
    s = s.concat(" sharma");
    System.out.println(s);

    // String comparison operators
    /*
    equals() => compare the actual content within the string
    "==" => compare the reference of the string if same reference then true otherwise false => agr content same h but ek literal se bnai h ek object se then it will return false
    compareto() => if string s == s ->0
    s>s => some positive value
    s<s => some negative value



    // STRING BUFFER kro dobara
    
    */
  }
}