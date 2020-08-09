object Assignment_q2 extends App{
	val point_1 = Point(3,7)
	
	println("Point 1 : "+point_1)
	println("After moving : "+point_1.move(2,1))
}

case class Point(x:Int,y:Int){
	
	def move(dx:Int,dy:Int)= Point(this.x+dx,this.y+dy)
}