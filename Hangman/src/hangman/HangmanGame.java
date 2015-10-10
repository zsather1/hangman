package hangman;

import java.io.IOException;
import java.util.List;

public class HangmanGame {
	
	private List<String> wordList;
	
	public HangmanGame() throws IOException{
		Words.parseFile("src/words.txt");
		wordList = Words.getWords();
		
	}
	
	public boolean isWordGuessed(String word, List<String> guessedLetters){
		return false;
	}
	
	public String getGuessedWord
	
	public boolean is_valid_word(String word ){
		return false;
	}
	
	public 
	
	
	
	
	
	public static void main(String[] args) throws IOException{
		Words.parseFile("src/words.txt");
		System.out.println(Words.getWords());
	}
	
}
