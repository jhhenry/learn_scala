package finance

package object currencies {

  def convert(money: Money, to: Currency) = {
    val conversionRate = 2
    new Money(money.amount * conversionRate, to)
  }
}
