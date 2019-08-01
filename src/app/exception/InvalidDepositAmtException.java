package app.exception;

public class InvalidDepositAmtException extends Exception{
	public InvalidDepositAmtException(){
		super();
	}
	
	public String toString() {
		return "Deposit Amount can't be lesser than Rent Amount";
	}
}
