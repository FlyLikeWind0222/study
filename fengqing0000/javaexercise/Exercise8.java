public class Exercise8
{
   static int i=1;
   {
     i++;
   }
   public Exercise8()
   {
     i++;
   }

  public static void main(String []args)
  {
   Exercise8 t1=new Exercise8();
   System.out.println(t1.i);
   Exercise8 t2=new Exercise8();
   System.out.println(t2.i);
   }
 }
 
 //代码缩进问题。
 