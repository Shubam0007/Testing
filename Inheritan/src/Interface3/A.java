package Interface3;

public class A implements Showable,Printable {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Wlcome");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
		public static void main(String[] args) {
			A a=new A();
			a.show();
			a.print();
		}

}
