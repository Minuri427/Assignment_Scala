//Q1 calculate salary

object assignment2 extends App{

  def normal(nh : Int) = 150*nh;
  def ot(oth : Int) = 75*oth;
  def salWithoutTax(nh : Int,oth : Int) = normal(nh)+ot(oth);
  def tax(nh : Int,oth : Int):Double = salWithoutTax(nh,oth)*10/100;
  def salary(nh : Int,oth : Int):Double = salWithoutTax(nh,oth)-tax(nh,oth);
    println(salary(60,40));
}
 