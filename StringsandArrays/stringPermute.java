
//Method to decide if one string is permute of the other
//same characters but different order


public class stringPermute {
    public static void main(String[] args) {
        System.out.println("Unique : " + stringPermute("Mahesh","eshaMh"));
    }

	private static String stringSort(String s) {
		//  Auto-generated method stub
		char[] strContent=s.toCharArray();
		java.util.Arrays.sort(strContent);
		return new String(strContent);
	}
	
	static boolean stringPermute(String s1, String s2)
	{
		if (s1.length()!=s2.length()) return false;
		return stringSort(s1).equals(stringSort(s2));
	
	}
}
