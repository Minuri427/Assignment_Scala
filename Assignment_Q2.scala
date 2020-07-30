object Assignment_q2 extends App{
  val x = new Rational(3,4)
  val y = new Rational(5,8)
  val z = new Rational(2,7)
   
  println("x-y-z ="+x.sub(y).sub(z));
}

class Rational(p:Int,q:Int){
  def numer = p/gcd(p,q)
  def denom = q/gcd(p,q)
  
  def neg = new Rational(-this.numer,this.denom)
  def +(r:Rational) = new Rational(this.numer*r.denom + r.numer*this.denom,denom*r.denom)
  def sub(r:Rational) = this+r.neg
  private def gcd(x:Int,y:Int):Int = if(y==0) x else gcd(y,x%y)

  override def toString = numer+"/"+denom
}
