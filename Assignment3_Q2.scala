//Q2

object assignment3_Q2 extends App{
	def GCD(p : Int,q : Int):Int = q match{
	case 0 => p
	case q if q>p => GCD(q,p)
	case _ => GCD(q,p%q)
  }
  
  def prime(p_number : Int, num : Int=2): Boolean = num match {
    case num if(p_number==num) => true
    case num if (GCD(p_number,num))>1 => false
    case num => prime(p_number,num+1)
  }
  

  def primeSeq(p : Int, n : Int=2): Any ={
		if(p>=n){
			if(prime(n)) println(n);
					primeSeq(p, n+1)};
		
	}
	primeSeq(10);
}
