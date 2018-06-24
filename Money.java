// Money class
// uses Currency class
// Perform operations
// Simphiwe Mchunu


class Money {
  private Currency currency;
  private long minorUnitAmount;

  public Money(String amount, Currency currency) {
    this.currency = currency;
    this.minorUnitAmount = this.currency.parse(amount);
  }
  public Money(long minorUnitAmount, Currency currency) {
    this.minorUnitAmount = minorUnitAmount;
    this.currency = currency;
  }

  public long longAmount()
   {
      return this.minorUnitAmount;
      }
  public Currency currency()
   { return this.currency;
      }

  public Money add(Money other) {
    Money amount_added = new Money(this.minorUnitAmount + other.minorUnitAmount,this.currency);
    return amount_added;
  }
  public Money subtract(Money other) {
     Money Difference = new Money(this.minorUnitAmount - other.minorUnitAmount, this.currency);
     return Difference;
  }
  public String toString() {
    return this.currency.format(this.minorUnitAmount);

  }
}
