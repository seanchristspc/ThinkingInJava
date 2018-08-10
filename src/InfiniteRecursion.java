import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {
	
	public String toString(){
		return "InfiniteRecursion address: "+super.toString()+"\n";
		//编译器会试着将this转化为String 则会调用toString() 形成递归
	}

	public static void main(String[] args) {
		List<InfiniteRecursion> v=new ArrayList<InfiniteRecursion>();
		
		for(int i=0;i<10;i++)
			v.add(new InfiniteRecursion());
		System.out.println(v);
	}

}
