// Currency class
// returns symbol, code and minorPerMajor
// of the currency
// Simphiwe Mchunu


class	Currency {
	private String symbol;
	private String code;
	private int minorPerMajor;

	public Currency(String symbol, String code, int minorPerMajor)	{
	  this.symbol	=	symbol;
		this.code	=	code;
		this.minorPerMajor = minorPerMajor;
	 }

  public String symbol()
   {
      return this.symbol;
         }
	public String code()
      {
         return this.code;
            }
	public int minorPerMajor()
      {
         return this.minorPerMajor;
            }

	public String format(long amount) {
    String Amount = Long.toString(amount);
    double A = (double) this.minorPerMajor();
    if(Amount.charAt(Amount.length()-1) != '0') {
      return this.symbol() + amount / A;
    }
    else return this.symbol()+amount / A+"0";
	}
	public long parse(String amount) {
	 /*int Amount = Integer.parseInt(amount.replace(this.symbol(),"").replace(".",""));
    double minorValue = ((double) Amount/100) * this.minorPerMajor();
    return (long) minorValue;*/
     String a = amount.substring(amount.indexOf(symbol)+1, amount.length());
     double A =  Double.parseDouble(a);

     double C = A*minorPerMajor;
     long D = (long) C;
     return D;
	}
}
