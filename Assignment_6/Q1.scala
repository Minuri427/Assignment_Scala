object Assignment_q1 extends App{
	val point_1 = Point(4,5)
	val point_2 = Point(2,7)
	
	println("point 1 :"+point_1)
	println("point 2 :"+point_2)
	println("Addition of point 1 and point 2 : "+(point_1+point_2))
	
}

case class Point(x:Int,y:Int){
	
	def +(that:Point) = Point(this.x+that.x,this.y+that.y)
}