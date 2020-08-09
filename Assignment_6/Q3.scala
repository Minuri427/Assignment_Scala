object Assignment_q3 extends App{
	val point_1 = Point(3,4)
	val point_2 = Point(4,6)
	
	val dis = point_1.distance(point_2)
	
	println("point 1 : "+point_1)
	println("point 2 : "+point_2)
	println("Distance between point 1 and point 2 is "+dis)
}

case class Point(x:Int,y:Int){
	
	def pow2(a:Int)=a*a
	
	def distance(that:Point)= math.sqrt(pow2(this.x-that.x)+pow2(this.y-that.y))
}