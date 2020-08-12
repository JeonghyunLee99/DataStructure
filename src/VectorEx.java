import java.util.Vector;

public class VectorEx {

	public static void main(String args[]) {
		
		Vector<Integer> v = new Vector<Integer>(10);
		
		v.add(5);
		v.add(4);
		v.add(-1);
		
		v.add(2, 100);
		
		System.out.println("벡터 내의 요소 객체 수: " + v.size());
		System.out.println("벡터 내의 현재 용량: " + v.capacity());
		
		
		for(int i = 0; i < v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		
		int sum = 0;
		for(int j = 0; j < v.size(); j++) {
			sum += v.get(j);
		}
		
		System.out.println("벡터에 있는 정수 합 : " + sum);
	}

}
