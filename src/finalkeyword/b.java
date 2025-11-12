package finalkeyword;

public class b extends a{
	void method1() {
		//Compile-error! we can not override
		System.out.println("Illegal!");
	}
}