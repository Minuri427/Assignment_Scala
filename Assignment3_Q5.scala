//Q5

object assignment3_Q5 extends App{

	def evenNum(num : Int) : Int = {
		if(num%2 == 0) addEven(num-2);
		else addEven(num-1);
	}
	def addEven(num : Int) : Int=num match{
		case 0 => 0;
		case 1 => 0;
		case num if(num<0) => 0;
		case num => (num + addEven(num-2));
	}
	println(evenNum(10));

}
	
	
	
	
	
	
	
	
	
	
