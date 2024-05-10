public class ArmstrongNum {
	
	public static void main(String[] args) {
		int n = 153;
		if(ArmstrongNumber(n)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		

	}
	static boolean ArmstrongNumber(int n){
		int originalno = n;
		int count = 0;
		int temp = n;
		while(temp != 0){
			count ++;
			temp /= 10;
		}
        // int digits = (int)Math.floor(Math.log10(n)+1);
        // return digits;
		int sumofpower = 0;
		while(n != 0){
			int digit = n % 10;
			sumofpower += Math.pow(digit, count);
			n /= 10;
		}
		return (sumofpower == originalno);
	}
}
