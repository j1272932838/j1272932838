import java.util.Arrays;

public class MaoPao {
    public static void main(String[] args) {
		 int [] arry = {5,8,10,3,6,78,12,4};
		 for(int i = 0 ; i < arry.length-1 ; i++) {
			 for(int j = 0 ; j < arry.length - i-1 ; j++) {
				 if(arry[j] > arry[j+1]) {
					 int t = arry[j];
					 arry[j] = arry[j+1];
					 arry[j+1] = t;
				 }
			 }
		 }
		 System.out.println(Arrays.toString(arry));
	}
}
