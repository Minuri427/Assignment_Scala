object assignment extends App{

//Q1  convert Celsias into Fahrenheit 
  def temperature(c:Double)=c*1.8+32;
    println(temperature(35));

//Q2  Volume of a sphere
  def volume(r:Double)=4/3*3.14*r*r*r;
    println(volume(5));

//Q3  Total wholesale cost
  def cost(b:Int): Double = {
	if(b<=50) (b*(24.95*60/100)+3);

	else (b*(24.95*60/100)+3+(b-50)*0.75);
  }
  
  println(cost(60));
  
}

