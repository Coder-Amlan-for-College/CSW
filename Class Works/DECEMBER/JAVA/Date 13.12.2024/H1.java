
public class H1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num = 10;
        Integer obj = num;
        System.out.println("Integer Object: "+obj);
        int num1 = 20;
        Integer obj1 = new Integer(num1);
        System.out.println("Integer Object: "+obj1);
        System.out.println(obj1 instanceof Integer);
	}

}
