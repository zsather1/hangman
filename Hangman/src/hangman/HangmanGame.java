package hangman;

import java.io.IOException;

public class HangmanGame {
	
	
	
	public static void main(String[] args) throws IOException{
		Words.parseFile("src/words.txt");
		System.out.println(Words.getWords());
	}
	
}
