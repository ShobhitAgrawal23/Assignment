package Practice;
import java.util.*;
public class wordPlay {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine(); // input string
		String[] strSplit=str.split(" "); // split the string on the bases of space.
		int n=strSplit.length;
		// for output 1
		String result1="";
		for(int i=2,j=n-1;i<(2+n)/2;i++,j--) { // iterated in the string array from 2nd index till (2+n)/2 and swap the ith string with jth string to reverse the array from 2nd index
			String temp=strSplit[i];
			strSplit[i]=strSplit[j];
			strSplit[j]=temp;
		}
		for(int i=0;i<n;i++) {// taken back to string from string array.
			result1+=strSplit[i];
			if(i!=n-1)
				result1+=" ";
		}	
		System.out.println(result1);	// result for first output.
		
		// for output 2
		String result2="";
		for(int i=0;i<n;i++) { // iterate every string in string array.
			int l=strSplit[i].length();
			String custString=strSplit[i].substring(0,2);
			for(int j=l-1;j>=2;j--) { // iterated in the string from last index till 2nd index and added each character of string in custom string(custStrng) to reverse the string from 2nd index
				custString+=strSplit[i].charAt(j);
			}
			strSplit[i]=custString;
			result2+=strSplit[i]; //taken back to string from string array.
			if(i!=n-1)
				result2+=" ";
		}
		System.out.println(result2);// result for second output
		

	}

}
