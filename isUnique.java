
public class isUnique {
    public static void main(String[] args) {
        System.out.println("Unique : " + isUnique("Mahesh"));
    }
	
	static boolean isUnique(String str) {
		if (str.length()>128) return false;
		boolean[] char_set=new boolean[128];
		for (int i=0;i<str.length();i++) {
			int val= str.charAt(i);
	        System.out.println("val: " + val);
			if (char_set[val]) {
		        System.out.println("char_set[val] : " + char_set[val]);
				return false;
			}
			char_set[val]=  true;
		}
		return true;
	}
}
