public class Exercise5{
    public static void main(String []args){
	DataOnly data = new DataOnly(47,1.1,false);
	System.out.println("data.i «"+data.i+"data.d «"+data.d+"data.b «"+data.b);
	}
}
class DataOnly { 
  int i; 
  double d; 
  boolean b; 
  public DataOnly(int i,double d,boolean b){
  this.i=i;
  this.d=d;
  this.b=b;
 }  
} 
