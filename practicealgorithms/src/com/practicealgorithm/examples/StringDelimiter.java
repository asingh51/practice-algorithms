package com.practicealgorithm.examples;

public class StringDelimiter {
	public static void main(String[] args) { 
		String S=".git/objects/64/2d572ce90e5085986bdd9c9204b9404f028084";
		
		Gethash(S);
    }
	
	private static int GetMaxLength(String string) {
		int max=0;
		if(string.length()==0 || string==null)
			return string.length();
		
		String[] arrOfStr = string.trim().split("[.?!]");
		for (String a : arrOfStr) {
			System.out.println(a.trim());
			String[] innerarrOfStr = a.trim().split("\\s+");
			if(innerarrOfStr.length>max)
				{max=innerarrOfStr.length;
				System.out.println(a.trim());}

		}
		return max;
	}
	
	
	private static void Gethash(String string) {
	
		String arrOfStr = string.trim().split(".git/objects/")[1].replace("/", "");

			System.out.println(arrOfStr);
	
	}

} 