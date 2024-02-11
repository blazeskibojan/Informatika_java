
public class Minimum {
public static int findMin(int n1, int n2) {
	int min;
	if(n1<n2)
		min=n1;
	else
		min=n2;

	return min;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Minimum od dva broja e:" +findMin(10, 5));
	}

}
