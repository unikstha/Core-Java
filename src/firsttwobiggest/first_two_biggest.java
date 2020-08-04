package firsttwobiggest;

//first two biggest number without sorting

public class first_two_biggest {

	public static void main(String[] args) {
		int max1=Integer.MIN_VALUE,
				max2= Integer.MIN_VALUE;
		int arr[]= {1,92,4,6,7,2,8};
		for(int num: arr) {
			if (max1<num) {
				max2=max1;
				max1=num;
			}else if(max2<num) {
				max2=num;
			}
		}
		System.out.println("1st 2 max elements are: "+max1+" "+max2);
	}

}
