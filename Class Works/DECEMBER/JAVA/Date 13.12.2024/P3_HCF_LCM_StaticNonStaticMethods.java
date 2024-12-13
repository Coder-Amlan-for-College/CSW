import java.util.*;
public class P3_HCF_LCM_StaticNonStaticMethods {    
	public int CalculateHCF(int num1,int num2) {
		while(num2 != 0) {
			int reminder = num1 % num2;
			num1 = num2;
			num2 = reminder;
		}
		return num1;
	}
	public static int CalculateLCM(int num1,int num2, int hcf) {
		return(num1*num2)/hcf;
	}
	
	public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int num2 = sc.nextInt();
        P3_HCF_LCM_StaticNonStaticMethods demoHCF = new P3_HCF_LCM_StaticNonStaticMethods();
        int hcf = demoHCF.CalculateHCF(num1, num2);
        int lcm = CalculateLCM(num1,num2,hcf);
        System.out.println("HCF of "+num1+" and "+ num2 + " is "+hcf);
        System.out.println("LCM of "+num1+" and "+ num2 + " is "+lcm);
    }
}
