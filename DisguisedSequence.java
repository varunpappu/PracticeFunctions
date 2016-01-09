## Given u0 = 1, u1 = 2 and the relation 6unun+1-5unun+2+un+1un+2 = 0 calculate un for any integer n >= 0.

## Examples

## fct(n) returns un: fct(17) -> 131072, fct(21) -> 2097152

## Remark: You can take two points of view to do this kata:

## the first one purely algorithmic from the definition of un
## the second one - not at all mandatory, but as a complement - is to 
## get a bit your head around and find which sequence is hidden behind un.



import java.math.BigInteger;

public class DisguisedSequence {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 43;
		System.out.println(fcn(n));
	}

	private static BigInteger fcn(int n) {

		BigInteger b1, b2, b3, b4, b5;

		b1 = new BigInteger("6");
		b2 = new BigInteger("2");
		b3 = new BigInteger("5");

		b4 = b1.multiply(b2.pow((n - 2)).multiply(b2.pow(n - 1)));
		b5 = b3.multiply(b2.pow(n - 2)).subtract(b2.pow(n - 1));

		return b4.divide(b5);
	}
}
