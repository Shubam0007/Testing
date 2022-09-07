package Inteface5;

public class Test5 implements Showable2{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("CJC Classes");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
	}
		public static void main(String[] args) {
			Test5 t=new Test5();
			t.print();
			t.show();
		}
		
}
