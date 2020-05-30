//Q4

object assignment3_Q4 extends App{
	def isEven(n : Int): Boolean = n match{
		case 0 => true
		case _ => isOdd(n-1)
	}
	def isOdd(n : Int): Boolean = !(isEven(n));
	
	println(isEven(5));
	println(isOdd(23));
	println(isEven(10));
	println(isOdd(22));
}
