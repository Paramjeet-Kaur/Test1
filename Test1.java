public class Test1 {

public static void main(String[] args) 
{
System.out.println("SUBSTRING FOR KIDS");
String sentence= substringForKids(1,1,"fun");
System.out.println(sentence);
}

public static String substringForKids(int i, int j, String k) 
{
	String kids="";
	
	if(i==j)
		return String.valueOf(k.charAt(i));
	/*if(i<j)
		for(int kiddo=i; kiddo<=j;kiddo++)
			{
				kids+=k.charAt(kiddo);
			}
	if(i>j)
		return "you have gave me invalid numbers!";
	if(i<0)
		return "you gave me invalid numbers!";*/

	return kids;
}
}


		



