object Q2 extends App{
  def attendPeople(ticketPrice : Int)= 120 + (15-ticketPrice)*20/5;
  def incomeFromTickets(ticketPrice : Int)= attendPeople(ticketPrice)*ticketPrice;
  def cost(ticketPrice : Int)= 500+attendPeople(ticketPrice)*3;
  def profit(ticketPrice : Int)= incomeFromTickets(ticketPrice)-cost(ticketPrice);

  println(profit(20));
  println(profit(25));
  println(profit(30));

}
