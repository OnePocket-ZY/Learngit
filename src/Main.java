class main{
	public static void main(String arg []){
		Person person1 = new Person("赵阳",28);
		System.out.println("person1的名字是" + person1.name + ",person1的年龄是" + person1.age);
		
		Reload_A reload = new Reload_A(); 
		reload.funReload_A();
		reload.funReload_A(10);
		reload.funReload_A(10,1.0);
	}
}