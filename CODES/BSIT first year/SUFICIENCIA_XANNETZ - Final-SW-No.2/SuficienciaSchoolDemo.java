public class SuficienciaSchoolDemo
{
   public static void main(String[] args)
   {
      int enrl = 350;
      SuficienciaNameAndAddress q = new SuficienciaNameAndAddress("Audubon Elementary", "3500 Hoyne", 60618);
      SuficienciaSchool p = new SuficienciaSchool(enrl);
      q.display();
      p.display();
   }
}
