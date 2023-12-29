//Program to find first Non-Repeating character in a String

public class NonRepeat{
	public static void main(String[] args){
		String s1="mAnjunath";
		unique(s1);
	}
	static void unique(String s1){
		int[] count=new int[256];
		for(int i=0;i<s1.length();i++){
			int ch=(int)s1.charAt(i);
			count[ch]++;
		}
		for(int i=0;i<count.length;i++){
			if(count[i]==1){
				char c=(char)i;
				System.out.println(c);
			}
		}
	}
}
