import java.util.List;
import java.util.ArrayList;
public class Subsets08062023
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] arr = {1,2,3,4,5};
		List<List<Integer>> ans = subset(arr);
		for(List<Integer> subsets : ans){
		    System.out.println(subsets);
		}
		
	}
		
	
	public static List<List<Integer>> subset(int [] arr){
	    List<List<Integer>> outer = new ArrayList<>();
	    
	    outer.add(new ArrayList<>());
	    
	    for(int num : arr){
	        int n = outer.size();
	        for(int i = 0; i < n; i++){
	            List<Integer> internal = new ArrayList<>(outer.get(i));
	            internal.add(num);
	            outer.add(internal);
	            
	        }
	    }
	    
	    return outer;
	}
}
