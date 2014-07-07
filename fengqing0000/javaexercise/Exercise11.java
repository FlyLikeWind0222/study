public class Exercise11
{
  public static void main(String []args){
  AllTheColorsOfTheRainbow color1=new AllTheColorsOfTheRainbow();
  color1.changeTheHueOfTheColor();
  System.out.println(color1.changeTheHueOfTheColor());
  }

}
class AllTheColorsOfTheRainbow { 
  int anIntegerRepresentingColors; 
  void changeTheHueOfTheColor(int newHue);
}