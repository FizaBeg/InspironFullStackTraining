package classAlma;

public class LambdaDemo {
	public static void main(String[] args) {
		
		//1. First old way
		MyInter myinter=new MyInterImpl();
		myinter.met();
		
		//2. Second way - Anonymous inner classes - WHY ? - For better encapsulation
		myinter=new MyInter() {
			@Override
			public void met() {
				System.out.println("met method implemented in anonymous way...");
			}
		};
		myinter.met();
		
		//3. Third way - Lambda way - introduced in jdk 8 - WHY ? For better encapsulation - better than anonymous also
		//lambda will work only for functional interfaces i.e interfaces with only one method
		myinter=()->{System.out.println("met implemented in lambda way..");};
		myinter.met();
		
		MyInter2 myinter2=(s,n)->{
			System.out.println("the value of s..is..:"+s);
			System.out.println("the value of i..is..:"+n);
			return "the value of s and i is..:"+s+":"+n;
		};
		myinter2.met("almamatter",100);
		
	}
}
class MyInterImpl implements MyInter{
	@Override
	public void met() {
		System.out.println("met implemented in a implementation class...");
	}
}
//Interface with one method is called FUNCTIONAL interface
interface MyInter{
	public void met();
}
interface MyInter2{
	public String met(String x,int i);
}
