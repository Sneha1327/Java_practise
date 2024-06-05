package day26.StringClass.Assignment;

public class DuplicateStringAndCount {

	public static void main(String[] args) {
		
		String str = "Education is very Important";
		int count;
		System.out.println("Duplicate Character : count");
		//converting String into char array
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			count =1;
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j] && ch[i]!=' ') {
					count++;
					ch[j]= '0';
				}
			}
			
			if(count>1 && ch[i]!='0') {
				System.out.println("             "+ch[i]+"      :    "+count);
				
			}
		}
	}

}
//For example, “Better Butter”, duplicate characters and their count is
//t : 4, e : 3, r : 2 and B : 2.