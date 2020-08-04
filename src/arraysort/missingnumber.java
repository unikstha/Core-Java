package arraysort;

public class missingnumber {

	public static void main(String[] args){
		int arr[]= {1,2,4,5,6,7,8,9,10}; //integers in array
		
		int miss=0;
		for (int i=1; i<10; i++) { 
			boolean missing = true;
			for (int j=0; j<arr.length; j++) {
				
				if (i==arr[j]) {
					missing= false;
					
				}
			}
			if (missing) {
				miss=i;
			}
		}
		if(miss!=0) {
			System.out.println("Missing number = " + miss);}
			else {
				System.out.println("Nothing is Missing");
			}
		}
	}
