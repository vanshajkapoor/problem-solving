package arrays;

public class setMatrixZero {
	public void setZeroes(int[][] arr) {
        int col0=1,rows=arr.length,col=arr[0].length;
        // mark dummy array and col0
        for(int i=0;i<rows;i++){
            if(arr[i][0]==0)col0=0;
            for(int j=1;j<col;j++)
                if(arr[i][j]==0)
                    arr[i][0]=arr[0][j]=0;            
        }
        
        //traverse backwards so that dummy arr is not modified
        for(int i=rows-1;i>=0;i--){
            for(int j=col-1;j>=1;j--)
                if(arr[i][0]==0 || arr[0][j]==0)
                    arr[i][j]=0;
            if(col0==0) arr[i][0]=0;
        }
    }
}
