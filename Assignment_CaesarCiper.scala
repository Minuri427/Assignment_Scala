object Caesarciper extends App{
	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	val string = "HelloWorld"
	val Encryption = (c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
	val Decryption = (c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key)%a.size)
	val ciper = (algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))
	
	println("Encryption - "+"  "+ciper(Encryption,string,6,alphabet))
	println("Decryption - "+"  "+ciper(Decryption,string,3,alphabet))
}