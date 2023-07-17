
public class MathSingleton {
	private static MathSingleton mathinstance;
	private MathSingleton() {};
	public static MathSingleton getInstance() {
		try {
			if(mathinstance == null) {
				mathinstance = new MathSingleton();
			}
	         return mathinstance; 
		}
	}
}
public int add(int a, int b) {
	return a +b
		
}
public int add11(int a, int b) {
	return a + b
		
}
public int add1(int a, int b) {
	return a + b
		
}
public String subtract(int i, int j) {
	// TODO Auto-generated method stub
	return null;
}
public String divide(int i, int j) {
	// TODO Auto-generated method stub
	return null;
}
public String multiply(int i, int j) {
	// TODO Auto-generated method stub
	return null;
}
