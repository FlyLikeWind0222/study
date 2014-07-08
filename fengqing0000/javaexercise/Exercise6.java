public class Exercise6{
   public static void main(String []args){
    A a1=new A();
	a1.storage(4);
    System.out.println(a1.storage);
   }
}
class A{
    int b;
    int storage(String s) { 
    return s.length() * 2; 
    } 
}