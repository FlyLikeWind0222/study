//Exercise 11
public class AllTheColorsOfTheRainbow {
	int anIntegerRepresentingColors;
	void changeTheHueOfTheColor(int newHue) {
		anIntegerRepresentingColors=newHue;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		AllTheColorsOfTheRainbow A=new AllTheColorsOfTheRainbow();
		System.out.println(A.anIntegerRepresentingColors);
		A.changeTheHueOfTheColor(1);
		System.out.println(A.anIntegerRepresentingColors);
	}
}
