
public class Ques1c {

	public static void main(String[] args) {
		int a[] = new int[] {2,4,66,7,89,3};
		int p=1;
		int q=2;
		int r=3;
		int PMax[]=new int[6];
		PMax[0]=p*a[0];
		int SMax[]=new int[6];
		SMax[5]=r*a[5];
		int max = Integer.MIN_VALUE;
		
		
		for(int i=1;i<6;i++) {
			if(PMax[i-1]>p*a[i]) {
				PMax[i]=PMax[i-1];
			}
			else {
				PMax[i]=p*a[i];
			}
		}
		for(int i=4;i>=0;i--) {
			if(SMax[i+1]>r*a[i]) {
				SMax[i]=SMax[i+1];
			}
			else {
				SMax[i]=r*a[i];
			}
		}
		for(int i=0;i<6;i++) {
			int temp = PMax[i]+q*a[i]+SMax[i];
			if(temp>max) {
				max=temp;
			}
			
			
		}
		
		System.out.println("The maximum value of the expression is "+ max);
	}
}
