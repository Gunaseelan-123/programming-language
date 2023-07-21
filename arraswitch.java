import java.util.*;
public class main {
	public static void main (String[] args) {
    	Scanner obj=new Scanner(System.in);
        int count = 0;
        int n = obj.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n;i++) {
        	arr[i]=obj.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0 && (i == 0 || arr[i-1] == 1)) {               
                for (int j = i; j < n; j++) {
                    arr[j] = 1 - arr[j];
                }
                count++;
            }
        }
        System.out.println(count);
        
        
  
	}
   
}