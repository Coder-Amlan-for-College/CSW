
public class P4_WideningNarrowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int x=5;
    double y = x;
    System.out.println("Implicit/Widening from Integer: "+x+" to double: "+y);
    double a = 25.0;
    int b = (int)a;
    System.out.println("Explicit/Narowing from Double: "+a+" to Integer: "+b);
	}

}
