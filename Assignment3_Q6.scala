//Q6

object assignment3_Q6 extends App{
	def fibo(n : Int): Int =n match{
		case n if n==0 => 0
		case n if n==1 => 1
		case n => fibo(n-1)+fibo(n-2)
	}
	
	def fibo_seq(n : Int):Unit = {
		if(n>0) fibo_seq(n-1)
		println(fibo(n));
	}
	
	fibo_seq(10);
}
