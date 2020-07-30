object Assignment_q4 extends App{
	var acc_1 = new Account("955432278v",0001,20000)
	var acc_2 = new Account("897267734v",0002,34220.98)
	var acc_3 = new Account("918720035v",0003,-450)
	var acc_4 = new Account("809831189v",0004,35000.45)
	var acc_5 = new Account("689324478v",0005,-239.32)
	
	val bank:List[Account]=List(acc_1,acc_2,acc_3,acc_4,acc_5)
	val sum_balances = Account.sum_all_balances(bank)
	
	println("\nAll Account details\n");
	bank.foreach(println);
	
	println("\nList of Accounts with negative balances\n");
	Account.neg_balances(bank).foreach(println);
	
	println("\nSum of all account balances\n");
	println(sum_balances);
	
	println("\nFinal balance of all accounts after apply the interest\n");
	bank.foreach(x => if(x.balance > 0) x.new_balance(0.05) else x.new_balance(0.1))
	bank.foreach(println);
}

object Account{
	def neg_balances(a : List[Account]):List[Account] = a.filter(_.balance < 0)
	def sum_all_balances(a : List[Account]):Double = a.map(_.balance).sum
}

class Account(id:String,n:Int,b:Double){
	val nic:String = id
	val acc_num:Int = n
	var balance:Double = b
	
	def new_balance(a: Double) = this.balance = this.balance + this.balance*a
		
	override def toString = "[NIC:"+nic+" Acc_num:"+acc_num+" Acc_balance:"+balance+"]"
}

