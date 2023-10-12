//Jose_Gonzalez

import java.util.StringTokenizer;

public class StringProcessor {
	
	private String input;
	
	public StringProcessor(String s) {
		input=s;
		
	}
	
	
	
	public void setString(String s) {
		this.input = s;
	}
	
	public String getString() {
		return input;
	}
	
	
	
	public int wordCount() {
		
		StringTokenizer token = new StringTokenizer(input);
		return token.countTokens();
		
		
	}
	
	
	public int uppercaseCount() {
		int count=0;
		for(int i=0;i<input.length();i++) {
			if(Character.isUpperCase(input.charAt(i)))
				++count;
		}return count;
	}
	
	public int digitCount() {
		int digit=0;
		for(int i=0;i<input.length();i++) {
			if(Character.isDigit(input.charAt(i)))
				++digit;
		}return digit;
	}
	
	public int digitWordCount() {
		int count=0;
		
		String X=input.toLowerCase();
		String[] token=X.split(" ");
		
		for(int i=0; i <token.length;i++) {
			if (token[i].equals("zero") || token[i].equals("one") || token[i].equals("two") || token[i].equals("three") || token[i].equals("four") || token[i].equals("five") 
					|| token[i].equals("six") || token[i].equals("seven") || token[i].equals("eight") || token[i].equals("nine")) {
				count++;
		}
		}
		return count;
	}
	
	public String getNoSpaceString() {
		String[] token= input.split(" ");
		System.out.println("No Space: ");
		for(String s:token)
			System.out.print(s);
		
		return input;
	}
	
	public String getNoVowelString() {
		
		String X = input;
		char vowel_arr[]= {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
		
		for(int i=0;i<vowel_arr.length;++i){
			X= X.replace(vowel_arr[i],'-');
		}return X;
		
		
	}
	
	
	public String getnoDigitWordString() {
		String X= input;
		
		String numbers_arr[]= {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		for(int i=0;i<numbers_arr.length;++i) {
			X= X.replace(numbers_arr[i]," ");
		}return X;
	}
	
	
	
	
	
	
	
	
	
	
	
}
