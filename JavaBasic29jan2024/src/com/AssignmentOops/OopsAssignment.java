package com.AssignmentOops;

class $a1 {
	$a1() {
		char ch = 'o';
		System.out.println("I am $a1 constructor ");
	}

	char ch;

	void vowel(char ch) {
		System.out.println("I am vowel");
		this.ch = ch;
		System.out.println("I am vowel " + this.ch);

	}

	void vowel() {
		System.out.println("I am vowel");

		System.out.println("I am vowel " + this.ch);

	}

}

class $b1 extends $a1 {
	$b1() {
		// super();
		System.out.println("I am $b1 constructor ");
	}

	char ch = 'c';

	void consonant() {

		System.out.println("I am consonant");
		super.ch = ch;
		System.out.println("I am consonant " + super.ch);
	}

	void letter() {
		System.out.println("I am letter of $b1");
	}

}

class C1 extends $b1 {
	// super();
	C1() {
		this('v');
		System.out.println("I am zero constructor");
	}

	C1(int i) {

		System.out.println("I am integer constructor");
	}

	C1(char ch) {
		this(5);
		System.out.println("I am char constructor");
	}

	void letter() {
		System.out.println("I am letter of C1");
	}
}

public class OopsAssignment {

	public static void main(String[] args) {
		C1 ref = new C1();
		ref.vowel('e');
		ref.consonant();
		ref.letter();
		$b1 ref1 = new $b1();
		ref1.vowel('e');
		ref1.consonant();

	}

}
