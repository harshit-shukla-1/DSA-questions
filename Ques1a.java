
public class Ques1a {

	public static void main(String[] args) {
		int a[] = new int[] {2,4,-66,7,89,3};
		int PMax[]=new int[6];
		PMax[0]=a[0];
		int SMax[]=new int[6];
		SMax[5]=a[5];
		int max = Integer.MIN_VALUE;
		
		for(int i=1;i<6;i++) {
			if(PMax[i-1]>a[i]) {
				PMax[i]=PMax[i-1];
			}
			else {
				PMax[i]=a[i];
			}
		}
		for(int i=4;i>=0;i--) {
			if(SMax[i+1]>a[i]) {
				SMax[i]=SMax[i+1];
			}
			else {
				SMax[i]=a[i];
			}
		}
		for(int i=1;i<5;i++) {
			int temp = PMax[i-1]+a[i]+SMax[i+1];
			if(temp>max) {
				max=temp;
			}
			
			
		}
		
		System.out.println("The maximum value of the expression is "+ max);
	}
}
