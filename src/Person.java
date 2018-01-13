//构造函数
class Person{
	Person(String n, int a){
		name = n;
		age = a;
	}
	String name;
	int age;
}

//函数重载
class Reload_A{
	//void funReload_A(){
	//	System.out.println("这是一个无型参的函数；");
	//}
	
	void funReload_A(int i){
		System.out.println("这是一个整型实参的函数；");
	}
	
	void funReload_A(int i, double d){
		System.out.println("这是有一个整型实参和一个双精度实参的函数。");
	}
}