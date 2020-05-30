//Q3

object assignment3_Q3 extends App{
	def addition(num : Int  ):Int = {
		if(num==1) 1
		
		else num+addition(num-1)
	}
	println(addition(5));
}
