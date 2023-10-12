import java.util.Scanner;

public class StringProcessorProgram {
	
	public static void main(String[] args) {
		
		char goAgain= 'n';
		
		do {
		Scanner userInput= new Scanner(System.in);
		
		System.out.println("Enter a line of text: ");
		
		String input= userInput.nextLine();
		
		StringProcessor Test= new StringProcessor(input);
		
		
		
		System.out.println("words: "+Test.wordCount());
		
		System.out.println("uppercase: "+Test.uppercaseCount());
		
		System.out.println("digits: "+ Test.digitCount());
		
		System.out.println("digits words: "+ Test.digitWordCount());
		
		Test.getNoSpaceString();
		System.out.println("\n");
		
		System.out.println("no vowels: "+ Test.getNoVowelString());
		
		System.out.println("Numbereplace: "+ Test.getnoDigitWordString());
		
		System.out.println("Go again? (y/n)");
		
		goAgain= userInput.next().charAt(0);
		
		}while(goAgain=='y');
        
	}
	
}
