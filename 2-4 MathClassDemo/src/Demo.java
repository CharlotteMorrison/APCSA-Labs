
public class Demo {

	public static void main(String[] args) {
        double aNumber = -191.635;

        System.out.println("The absolute value of " + aNumber + " is " + Math.abs(aNumber));
        System.out.println("The ceiling of " + aNumber + " is " + Math.ceil(aNumber));
        System.out.println("The floor of " + aNumber + " is " + Math.floor(aNumber));
        System.out.println("The rint of " + aNumber + " is " + Math.rint(aNumber));

        double x = 11.635;
        double y = 2.76;
        
        System.out.println("log(" + x + ") is " + Math.log(x));
        System.out.println("pow(" + x + ", " + y + ") is " + Math.pow(x, y));
        System.out.println("sqrt(" + x + ") is " + Math.sqrt(x));
	}

}
