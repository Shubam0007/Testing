package Interface1;

public class A implements Printable
{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
	}
		public static void main(String[] args)
		{
			A a=new A();
			a.print();
		}

}
