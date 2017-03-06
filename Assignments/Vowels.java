package newpackage;

public class Vowels {
	String s= "Take a paragraph and count the vowels and print the results";
	char ch[]=s.toCharArray();
	int count=0;
	
	public void conutVowels (){
		//System.out.println(ch);
		for(int i=0;i<ch.length;i++)
		{
			if (ch[i]=='a'||ch[i]=='i'||ch[i]=='e'||ch[i]=='o'||ch[i]=='u'){
				count= count+1;
			}
			 
		}
		System.out.println("number of vowels in given string= "+count);
	}
	
	public static void main(String args[]){
		Vowels v=new Vowels();
		v.conutVowels();
	}
}
