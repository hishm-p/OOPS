class Value
{
  int meter;
  double centimeter;
  void getData()
    {
     meter=19;
     centimeter=190;
    }
}

class Area
{
 public static void main(String args[])
 {
  Value d=new Value();
  d.getData();
  System.out.println("Value in Meter: "+d.meter);
  System.out.println("Value in Centimeter: "+d.centimeter);
 }

}




