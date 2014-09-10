package MainPackage;

public class MyInteger {
		
		private int value;
		
		public MyInteger(int value){
			this.value = value;
		}
		
		public int get(){
			return value;
		}
		
		public boolean isEven(){
			if (value%2 == 1) {
				return false;
			}
			else {
				return true;
			}
		}
		
		public boolean isOdd(){
			if (value%2 == 1) {
				return true;
			}
			else {
				return false;
			}
		}	
	
		public boolean isPrime(){
			// A prime number must be greater than 1
			if (value < 0) {
				return false;
			}
			if (value == 0 || value == 1) {
				return false;
			}
			if (value == 2) {
				return true;
			}
			if (value > 2){
				for (int i = 2; i < value; i++){
					if( value%i ==0){
						return false;
					}
				}
			}
			return true;
		}

		
		public static boolean isEven(int value){
			if (value%2 == 1) {
				return false;
			}
			else {
				return true;
			}
		}
		
		public static boolean isOdd(int value){
			if (value%2 == 1) {
				return true;
			}
			else {
				return false;
			}
		}	
	
		public static boolean isPrime(int value){
			// A prime number must be greater than 1
			if (value < 0) {
				return false;
			}
			if (value == 0 || value == 1) {
				return false;
			}
			if (value == 2) {
				return true;
			}
			if (value > 2){
				for (int i = 2; i < value; i++){
					if( value%i ==0){
						return false;
					}
				}
			}
			return true;
		}
		
		public static boolean isEven(MyInteger Int){
			if (Int.value%2 == 1) {
				return false;
			}
			else {
				return true;
			}
		}
		
		public static boolean isOdd(MyInteger Int){
			if (Int.value%2 == 1) {
				return true;
			}
			else {
				return false;
			}
		}	
	
		public static boolean isPrime(MyInteger Int){
			// A prime number must be greater than 1
			if (Int.value < 0) {
				return false;
			}
			if (Int.value == 0 || Int.value == 1) {
				return false;
			}
			if (Int.value == 2) {
				return true;
			}
			if (Int.value > 2){
				for (int i = 2; i < Int.value; i++){
					if( Int.value%i ==0){
						return false;
					}
				}
			}
			return true;
		}
		
		public boolean equals(int value){
			return (value == this.value);
		}
		
		public boolean equals(MyInteger Int){
			return (Int.value == this.value);
		}
		
		public static int parseInt(char[] alist) {
			int sum = 0;
			for (int i = 0; i < alist.length; i++){
				// 48 is ASCII value for 0
				int num = (int)alist[i]-48;
				sum += num;
			}
			return sum;
		}

		public static int parseInt(String astring) {
			int sum = 0;
			for (int i = 0; i < astring.length(); i++){
				// 48 is ASCII value for 0
				int num = (int)astring.charAt(i) -48;
				sum += num;
			}
			return sum;
		}
}
