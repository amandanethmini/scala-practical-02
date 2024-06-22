object practical_2_4 {
  def attendees(price: Int) = 120 + (15 - price) / 5 * 20
  def revenue(price: Int) = attendees(price) * price
  def cost(price: Int) = 500 + attendees(price) * 3
  def profit(price: Int) = revenue(price) - cost(price)

  def main(args: Array[String]): Unit = {
    var price1 = 10
    var price2 = 15
    var price3 = 20
    var out1 = profit(price1)
    println(f"Profit(ticket price=10): $out1%.2f")
    var out2 = profit(price2)
    println(f"Profit(ticket price=15): $out2%.2f")
    var out3 = profit(price3)
    println(f"Profit(ticket price=20): $out3%.2f")
  }
}
