//Method to replace all space with %20
//Time Complexity : O(n) where n is the true length of the string.
//Auxiliary Space : O(1) because the  program is an inplace algorithm.

public class replaceSpace {

	public static void replaceSpaces(char[] str) {
		int strLen, spaceCount=0,actualSize;
		strLen=str.length;
		for (int i=0;i<strLen;i++) {
			if (str[i]== ' ') {
				spaceCount++;
			}
		}
		actualSize=strLen+ (spaceCount*2);
		if (actualSize < str.length) str[actualSize] = '\0';
		for (int i=strLen-1;i>=0 ;i--) {
			if (str[i] == ' ') {
				System.out.println("str[i]"+ str[i]);
				str[actualSize-1]='0';
				str[actualSize-2]='2';
				str[actualSize-3]='%';
				actualSize=actualSize-3;
			} else {
				str[actualSize-1]=str[i];
				actualSize--;
			}
		}
	}
	public static void main(String[] args) {
		String str="Ma he sh";
		char[] arr=str.toCharArray();
		replaceSpaces(arr);
	}
}
