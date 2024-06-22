object practical_2_3 {
  def working(x: Int) = x * 250
  def ot(y: Int) = y * 85
  def income(x: Int, y: Int) = working(x) + ot(y)
  def tax(x: Int, y: Int): Double = income(x, y) * 0.12
  def salary(x: Int, y: Int): Double = income(x, y) - tax(x, y)

  def main(args: Array[String]): Unit = {
    var work = 40
    var ot = 30
    var out = salary(work, ot)
    println(f"Salary: $out%.2f")
  }
}
