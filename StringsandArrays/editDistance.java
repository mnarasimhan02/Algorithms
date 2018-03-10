//Simultaneously traverse both strings and keep track of count of different characters.
//Time complexity: O(n)
//Auxiliary Space: O(1)
public class editDistance {

	public static boolean isEditDistanceOne(String str1,String str2) 
	{
		int m,n,count=0;
		int index1=0,index2=0;
		m=str1.length();n=str2.length();
		if (m-n>1) return false;
		while (index1<m && index2<n) 
		{
			if (str1.charAt(index1) !=str1.charAt(index2)) 
			{
				if (m>n) 
					index1++;
				else if (m<n) 
					index2++;
				else 
				{
					index1++;
					index2++;
				}
				count++;	
			}
			else {
				index1++;
				index2++;
			}
		}
		if (index1<m || index2<n) count++;		
		return count==1;
	}
	public static void main(String[] args) {
		    String s1 = "apple";
		    String s2 = "aple";
		    if(isEditDistanceOne(s1, s2))
		        System.out.print("Yes");
		    else
		        System.out.print("No"); 
		}

}
