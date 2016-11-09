
public class ReverseString {

	public static void main(String[] args) 
	{
		String str="Rojalin sahoo";
		
		char[] charray=str.toCharArray();
		
		for(int i=charray.length-1;i>=0;i--)
		{
			System.out.println(charray[i]);
		}
		

	}

}
