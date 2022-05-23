package CSharp;

public class Program  {
    static void Main(string[] args)
    {
        try
        {
            int[] myNumbers = {1, 2, 3};
            Console.WriteLine(myNumbers[10]);
        }
        catch (Exception e)
        {
            Console.WriteLine("Ups, error appeared.");
        }

          interface IAnimal
          {
            void animalSound();
          }

          class Cow : IAnimal
          {
            public void animalSound()
            {

              Console.WriteLine("The cow says: moo moo");
            }
          }

          class Program
          {
            static void Main(string[] args)
            {
              Cow myCow = new Cow();
              myCow.animalSound();
            }
          }
    }

        static int PlusMeetod(int x, int y)
        {
          return x + y;
        }

        static double PlusMeetod(double x, double y)
        {
          return x + y;
        }

        static void SecondMain(string[] args)
        {
          int myNum1 = PlusMeetod(8, 5);
          double myNum2 = PlusMeetod(4.3, 6.26);
          Console.WriteLine("Int: " + myNum1);
          Console.WriteLine("Double: " + myNum2);
        }
}