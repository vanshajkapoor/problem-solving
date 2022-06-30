package recursion;

public class CountPaths {
	
	public static int countPaths(int i,int j, int m,int n) {
		if(i==m-1 || j==n-1) return 1; // when in last row or col, we will have only 1 path
		
		return countPaths(i,j+1,m,n)+ countPaths(i+1,j,m,n);
	}

	public static void main(String[] args) {
		int m=3,n=3;
		int ans = countPaths(0,0,m,n);
		System.out.println(ans);

	}

}
