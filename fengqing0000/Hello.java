public class Hello
{
  public static void main(String args[])
  { 
   Cat cat1=new Cat();
   cat1=new Cat();
   cat1.name="С��";
   cat1.color="��ɫ";
   System.out.println("cat1.name="+cat1.name);
   System.out.println("cat1.color="+cat1.color);
   }
 }
 class Cat
 {
  String name;
  String color;
 }