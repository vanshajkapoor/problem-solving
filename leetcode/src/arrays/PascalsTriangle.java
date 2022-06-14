package arrays;
import java.util.*;
public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();     
        for(int i=0;i<=numRows-1;i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j=1;j<=i;j++){
                if(j==0 || j==i) temp.add(1);
                else{
                    int el=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                    temp.add(el);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}
