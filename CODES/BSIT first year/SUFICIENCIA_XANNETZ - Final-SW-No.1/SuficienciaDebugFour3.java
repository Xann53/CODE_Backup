// This class uses a DebugBox class to instantiate two Box objects
public class SuficienciaDebugFour3
{
   public static void main(String args[])
   {
      int width = 12,
      length = 10,
      height = 8;
      SuficienciaDebugBox box1 = new SuficienciaDebugBox();
      SuficienciaDebugBox box2 = new SuficienciaDebugBox(width, length, height);
      System.out.println("The dimensions of the first box are");
      box1.showData();
      System.out.print("  The volume of the first box is ");
      showVolume(box1);
      System.out.println("The dimensions of the second box are");
      box2.showData();
      System.out.print("  The volume of the second box is ");
      showVolume(box2);
   }
   public static void showVolume(SuficienciaDebugBox aBox)
   {
      double vol = aBox.getVolume();
      System.out.println(vol);
   }
}