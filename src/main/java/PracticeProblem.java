public class PracticeProblem {

	public static void main(String args[]) {


	}
	public static int min(int num1, int num2, int num3){
		if (num3 > num1){
			if (num1 > num2){
				return num2;
			}
			return num1;
		}
		return num3;
	}

	public static boolean isLeapYear(int year){
		if (0 == year%4){
			if (0 == year%100){
				if (0 == year%400){
					return true;
				}
				return false;
			}
			return true;
		}
		return false;
	}

}
