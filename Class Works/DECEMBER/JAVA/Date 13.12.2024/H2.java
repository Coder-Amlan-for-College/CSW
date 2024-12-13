
public class H2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        float num = 5.5f;
        Float obj = num;//Autoboxing
        System.out.println("Float Object: "+obj);
        float num1 = 5.5f;
        Float obj1 = new Float(num1);//Using Constructor
        System.out.println("Float Object: "+obj1);
	}

}
