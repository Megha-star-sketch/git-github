//  Find and print the uncommon characters of the two given strings S1 and S2. Here uncommon character means that either the character is present in one string or it is present in other string but not in both. The strings contains only lowercase characters and can contain duplicates.
//Example:
//Input:
//characters
//alphabets
//Output:
//bclpr

package Codility;

public class UncommonChar {
	static int MAX_CHAR=26;
	static void Uncommon(String s1, String s2)
	{
		int i;
		int present[]=new int[MAX_CHAR];
		for(i=0;i<MAX_CHAR;i++)
		{
			present[i]=0;
		}
		for(i=0;i<s1.length();i++)
		{
			present[s1.charAt(i)-'a']=1;    ////s1.chatAt(i)-'a' returns (ASCII value of s1.charAt(i) - ASCII value of 'a') 
		}
		for(i=0;i<s2.length();i++)
		{
			if((present[s2.charAt(i)-'a']==1) || present[s2.charAt(i)-'a']==-1)
			{
				present[s2.charAt(i)-'a']=-1;  
			}
			else
			{
				present[s2.charAt(i)-'a']=2;
			}
		}
		for (i = 0; i < MAX_CHAR; i++) 
        { 
            if (present[i] == 1 || present[i] == 2)  
            { 
                System.out.print((char) (i + 'a') + " "); 
            } 
        } 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="characters";
		String s2="alphabets";
	//	UncommonChar u = new UncommonChar();
		Uncommon(s1,s2);
	}

}
