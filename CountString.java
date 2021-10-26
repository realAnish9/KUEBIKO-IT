public class CountString {

	public static void main(String[] args) {

		int count;
String s ="Mississippi";
char[]ar = s. toCharArray();
int l= s. length();

for(int i=0;i<l-1; i++){
	count= 1;
	for(int j= i+1; j<l; j++) {
		if(ar[i]==ar[j]) {
			count++;
			for(int k=j;k<l-1;k++) {
				ar[k]=ar [k+1];
			}
			l--;
		}
		
	}
	System.out.println(ar[i]+"="+count);
			
}
	}

}



