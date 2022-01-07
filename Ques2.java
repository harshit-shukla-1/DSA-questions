
public class Ques2 {

	public static void main(String[] args) {
		int a[] = new int[]	{0,3,0,2,1,3,0,2};
		int n=8;
		int PMax[] = new int[n];
		int SMax[] = new int[n];
		PMax[0]=a[0];
		SMax[n-1]=a[n-1];
		int ans = 0;
		for(int i=1;i<n;i++) {
			if(PMax[i-1]>a[i]) {
				PMax[i]=PMax[i-1];
			}else {
				PMax[i]=a[i];
			}
		}
		for(int i=n-2;i>=0;i--) {
			if(SMax[i+1]>a[i]) {
				SMax[i]=SMax[i+1];
			}else {
				SMax[i]=a[i];
			}
		}
		for(int i=1;i<n-1;i++) {
			int h1 = PMax[i-1];
			int h2 = SMax[i+1];
			int min = h1>=h2?h2:h1;
			if(min>a[i]) {
				ans += (min-a[i]);
			}
		}
		
		System.out.println("The height of the water trapped is "+ ans);
 }
}
