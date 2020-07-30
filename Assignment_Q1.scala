object Assignment_q1{
	def main(argc: Array[String]): Unit={
	val r1=new Rational(3,5)
	
	println("Rational number:"+r1)
	println("Negative of Rational number:"+r1.neg)
	}
}

class Rational(p:Int,q:Int){
	def numer = p
	def denom = q
	
	def neg = new Rational(-this.numer,this.denom)
	
	override def toString = numer+"/"+denom 
}
