package pac;

public class Driver {

	public static void main(String[] args) {
		HugeInteger int1 = new HugeInteger("30", '+');
		HugeInteger int2 = new HugeInteger("15", '+');
		System.out.println("int 1 = " + int1);
		System.out.println("int 2 = " + int2);
		HugeInteger int3 = int1.multiply(int2);
		System.out.println("int 3 = " + int3);
	}

}



