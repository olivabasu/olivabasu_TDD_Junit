package com.epam.Remove_A_FromFirst2Char;

public class Remove_A_FromFirst2Char {

	public String remove(String string) 
	{
		String result=string;
		if(string.length()==1 && string.charAt(0)=='A')
				result="";
		else if(string.length()>=2)
			{
				char c1=string.charAt(0);
				char c2=string.charAt(1);
				if(c1=='A' && c2=='A')
					result=string.substring(2);	
				else if(c1=='A')
					result=string.substring(1);
				else if(c2=='A')
					result=string.substring(0,1)+string.substring(2);
		
			}
		
		return result;
		
	}

}
