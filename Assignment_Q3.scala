object Assignment_q3 extends App{
	val acc_1 = new Account("966180056v",0001,54500.56)
	val acc_2 = new Account("122345663v",0002,34555)
	
	println("Befor transfer money : Balance of Account 1 = "+acc_1.balance);
	println("Befor transfer money : Balance of Account 2 = "+acc_2.balance);
	
	println("\nTransfer 5000 from Account 1 to Account 2\n");
	val trans = acc_1.transfer(acc_2,5000)
	
	println("New Balance of Account 1 = "+acc_1.balance);
	println("New Balance of Account 2 = "+acc_2.balance);
    

class Account(id:String,n:Int,b:Double){
	val nic:String = id
	val acc_num:Int = n
	var balance:Double = b
	
	 def transfer(a:Account,b:Double)=
       {
	   if(this.balance>b){
        this.balance=this.balance-b
        a.balance=a.balance+b
		}
	   else
		println("Your balance is insufficient");
       }
		
	override def toString = "[NIC:"+nic+" Acc_num:"+acc_num+" Acc_balance:"+balance+"]"
}
}