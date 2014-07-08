public class Exercise7{
  public static void main(String []args){
  StaticTest st1 = new StaticTest(); 
  StaticTest st2 = new StaticTest(); 
  System.out.println("StaticTest.i="+StaticTest.i);
  System.out.println("st1.i="+st1.i);
  System.out.println("st2.i="+st2.i);
  Incrementable sf = new Incrementable(); 
  sf.increment();
  System.out.println("After sf.increament() called:");
  System.out.println("st1.i="+st1.i);
  System.out.println("st2.i="+st2.i);
  Incrementable.increment();
  System.out.println("After Incrementable.increment() called:");
  System.out.println("st1.i="+st1.i);
  System.out.println("st2.i="+st2.i);
  }
} 
class StaticTest { 
 static int i = 47; 
} 
class Incrementable { 
 static void increment() { 
 StaticTest.i++; 
 } 
} 
