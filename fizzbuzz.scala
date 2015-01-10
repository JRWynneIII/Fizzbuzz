object FizzBuzz
{
  def main(args: Array[String])
  {
    var i = 0;
    for (a<-1 to 100)
    {
      if (a%3 == 0)
      {
        print("Fizz");
      }
      if (a%5 == 0)
      {
        print("buzz");
      }
      else if (a%5 != 0 && a%3 != 0)
      {
        print(a);
      }
      print("\n");
    }
  }
}
