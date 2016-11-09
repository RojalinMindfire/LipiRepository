import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class OccuranceOfCharsInString {

	public static void main(String[] args) 
	{
	
		String input="Roooooooooojalinnnn";
		
		//Create a hashmap
		Map<Character,Integer> hmap=new HashMap<Character,Integer>();
		
		char[] charray=input.toCharArray();
		
		for(Character ch:charray)
		{
			if(hmap.containsKey(ch))
			
				hmap.put(ch, hmap.get(ch)+1);
			else
				hmap.put(ch, 1);
		}
		
		Set<Character> st=hmap.keySet();
		
		for(Character cha:st)
		{
		if(hmap.get(cha)>1)
		{
		System.out.println(cha+"------>"+hmap.get(cha));
		
		}
		
		}
		
}
}