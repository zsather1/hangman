package hangman;

import java.io.IOException;
import java.util.List;

public class HangmanGame {
	
	private List<String> wordList;
	private String secretWord;
	
	public HangmanGame() throws IOException{
		Words.parseFile("src/words.txt");
		wordList = Words.getWords();
		
	}
	
	/**
	 * Function that tells if the word has been guessed given all the letters
	 * 		that have been guessed.
	 * @param word - secret word that user is trying to guess
	 * @param guessedLetters - letters that the user has guessed
	 * @return boolean, true if all the letters for the word are in guessedLetters
	 */
	public boolean isWordGuessed(String word, List<String> guessedLetters){
		return false;
	}
	
	/**
	 * Function that returns a string representing the secret word where 
	 * 		letters that have been guessed are shown, for letters that have 
	 * 		not been guessed an asterisk ("*").
	 * @param word - secret word that user is trying to guess
	 * @param guessedLetters - letters that the user has guessed
	 * @return string that represents the word, with either letters or asterisks 
	 */
	public String getGuessedWord(String word, List<String> guessedLetters){
		return "";
	}
	
	/**
	 * Function that returns a string with all the letters that the user
	 * 		has not guessed.
	 * @param guessedLetters - letters that the user has guessed
	 * @return string, letters not in guessedLetters
	 */
	public String getAvailableLetters(List<String> guessedLetters){
		return "";
	}
	
	public void playHangman(){
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) throws IOException{
		Words.parseFile("src/words.txt");
		System.out.println(Words.getWords());
	}
	
}
