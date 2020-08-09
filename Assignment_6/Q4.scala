object Assignment_q4 extends App{
	val point_1 = Point(3,7)
	
	println(point_1)
	println("Inverse of point : "+point_1.invert)
}

case class Point(x:Int,y:Int){
	
	def invert = Point(y,x)
	
}