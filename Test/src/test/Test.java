package test;

public class Test {

	public static void main(String[] args) {
		
		String s = "10.0";
		float f;
		double d;
		
		f = Float.parseFloat(s);
		System.out.println(f); //10
		
		d = Double.parseDouble(s);
		System.out.println(d); //10
		
		f = Float.valueOf(s);
		System.out.println(f); //10
		
		d = Double.valueOf(s);
		System.out.println(d); //10


	}

}
