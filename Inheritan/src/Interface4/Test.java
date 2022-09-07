package Interface4;

public class Test implements Printable1,Sowable1
{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("CJC Classes");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Kunal Sir");
	}
		public static void main(String[] args) {
			Test t=new Test();
			t.print();
			t.show();
		}

}
