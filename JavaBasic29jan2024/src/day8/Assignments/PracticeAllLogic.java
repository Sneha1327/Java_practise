package day8.Assignments;

public class PracticeAllLogic {
	PracticeAllLogic() {
		this(5, 15);
		System.out.println("Constrctor Operation number1 ");
	}

	PracticeAllLogic(int x, int y) {
		System.out.println("Constrctor Operation number2");
		num4 = x;
		num6 = y;
		System.out.println("Constructor result: " + (num4 + num6));
	}

	static long num3 = 35, num5;
	float num4, num6;

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		System.out.println("number1: " + num1);
		System.out.println("number2: " + num2);
		int res = num1 + num2;
		System.out.println("result of local variable: " + res);
		PracticeAllLogic.addTwoNum();

		System.out.println("result of static globle variable: " + PracticeAllLogic.addTwoNum());
		PracticeAllLogic.addTwoNum(40, 60);
		System.out.println("result of updated static globle variable: " + PracticeAllLogic.addTwoNum(40, 60));
		PracticeAllLogic ref = new PracticeAllLogic();
		ref.addNumTwo(2.4f, 4.65f);
		PracticeAllLogic ref1 = new PracticeAllLogic(20, 40);
		ref1.addNumTwo(20, 30);
		ref1.addNumTwo();

	}

	static long addTwoNum() {
		num5 = 23;
		return (num3 + num5);
	}

	static long addTwoNum(int i, int j) {
		// num5=23;
		return (i + j);
	}

	void addNumTwo(float num4, float num6) {
		System.out.println("number4: " + this.num4);
		System.out.println("number6: " + this.num6);
		float result = num4 + num6;
		this.num4=num4;
		System.out.println("using non-static method Result is: " + result);
	}

	void addNumTwo() {

		float result = num4 + num6;
		System.out.println("using non-static method updated Result is: " + result);
		// System.out.println("using non-static method updated Result is: "+result);
	}
}
