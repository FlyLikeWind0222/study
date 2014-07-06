//Exercise 7
class StaticTest {
static int i = 47;
}
public class Incrementable {
	static void increment() { StaticTest.i++; }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//Incrementable sf = new Incrementable();
		//sf.increment();
		System.out.println(StaticTest.i);
		Incrementable.increment();
		System.out.print(StaticTest.i);
	}
}
