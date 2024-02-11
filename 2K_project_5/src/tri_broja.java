
public class tri_broja {
public static int findMin(int n1, int n2, int n3) {
	int min = n1;
	if (n2 < min) {
		min= n2;
	}
	if (n3 < min) {
		min = n3;
		
	}
	return min;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Minimumot od trite broja e:" + findMin(10, 5 ,3 )); 
	}

}
