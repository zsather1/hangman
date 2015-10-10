package hangman;

import java.io.IOException;
import java.util.List;

public class HangmanGameSol {
	
	private List<String> wordList;
	
	public HangmanGameSol() throws IOException{
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
		for (int i = 0; i < word.length(); ++i){
			String tmp = "";
			char letter = word.charAt(i);
			tmp+=letter;
			if (! guessedLetters.contains(tmp)){
				return false;
			}
		}
		return true;
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
		String displayWord = "";
		for (int i = 0; i < word.length(); ++i){
			char letter = word.charAt(i);
			if (guessedLetters.contains(letter)){
				displayWord += letter;
			}
			else{
				displayWord += "*";
			}
		}
		return displayWord;
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
	
	/**
	 * Plays a game of hangman. For rules refer to wikipedia
	 * 		https://en.wikipedia.org/wiki/Hangman_(game)
	 * 		User is allowed 6 guesses. 2 guesses are taken off 
	 * 		for incorrectly guessing vowels, no opportunity
	 */
	public void playHangman(){
		
	}
}
