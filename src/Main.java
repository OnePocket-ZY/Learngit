class main{
	public static void main(String arg []){
		Person person1 = new Person("����",28);
		System.out.println("person1��������" + person1.name + ",person1��������" + person1.age);
		
		Reload_A reload = new Reload_A(); 
		reload.funReload_A();
		reload.funReload_A(10);
		reload.funReload_A(10,1.0);
	}
}