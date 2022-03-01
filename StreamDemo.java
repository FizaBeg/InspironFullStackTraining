package classAlma;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
public class StreamDemo {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		list.add("ramu");
		list.add("somu");
		list.add("rahim");
		list.add("mahim");
		list.add("ramu");
		list.add("ramu");
		list.add("monu");
		list.add("bhaskar");
		
		Stream<String> stream=list.stream();
		stream.distinct().forEach((x)->{
			System.out.println(Thread.currentThread().getName());
			System.out.println(x);}
		);
		
		System.out.println("........................");
		
		stream=list.stream();
		stream.distinct().parallel().forEach((x)->{
			System.out.println(Thread.currentThread().getName());
			System.out.println(x);}
		);
		
		System.out.println(".____________________________");
		//using synchronized option in reading - forEachOrdered
		stream=list.stream();
		stream.distinct().parallel().forEachOrdered((x)->{
			//System.out.println(Thread.currentThread().getName());
			System.out.println(x);}
		);
		System.out.println("...................................");
		stream=list.stream();
		stream.distinct().parallel().filter((String x)->{return x.contains("m");}).forEach((x)->{
			//System.out.println(Thread.currentThread().getName());
			System.out.println(x);}
		);
	}
}