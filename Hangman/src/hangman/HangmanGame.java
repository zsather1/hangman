package hangman;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HangmanGame {
	
	//List of words loaded from words.txt
	private List<String> wordList;
	
	/**
	 * Constructor for HangmanGame
	 */
	public HangmanGame() throws IOException{
		Words.parseFile("src/words.txt");
		wordList = Words.getWords();
		
	}

	/**
	 * Helper function that returns a random word
	 * @return String, random word
	 */
	private String getRandomWord(){
		Random r = new Random();
		int rInt = r.nextInt(wordList.size());
		return wordList.get(rInt);
	}
	
	/**
	 * Function that tells if the word has been guessed given all the letters
	 * 		that have been guessed.
	 * @param word - secret word that user is trying to guess
	 * @param guessedLetters - letters that the user has guessed
	 * @return boolean, true if all the letters for the word are in guessedLetters
	 */
	public boolean isWordGuessed(String word, List<String> guessedLetters){
		
		//Put your code here
		
		return false; //Remove this
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
		
		//Put your code here
		
		return ""; //Remove this
	}
	
	/**
	 * Function that returns a string with all the letters that the user
	 * 		has not guessed.
	 * @param guessedLetters - letters that the user has guessed
	 * @return string, letters not in guessedLetters
	 */
	public String getAvailableLetters(List<String> guessedLetters){
		
		//Put your code here
		
		return ""; //Remove this
	}
	
	/**
	 * Plays a game of hangman. For rules refer to wikipedia
	 * 		https://en.wikipedia.org/wiki/Hangman_(game)
	 * 		User is allowed 6 guesses. 2 guesses are taken off 
	 * 		for incorrectly guessing vowels
	 */
	public void playHangman(){
		//For debugging, comment this line out and set your own secret word
		String secretWord = this.getRandomWord();
		
		//Put your code here
		
	}
	
	/**
	 * Function that says if two words would match, even if one
	 * 		of the words is missing letters as denoted by asterisks
	 * @param myWord - String, word with asterisks in the place 
	 * 		of missing letters
	 * @param otherWord - String, complete word
	 * @return - boolean, if the words could match
	 */
	public boolean matchWithGaps(String myWord, String otherWord){
		
		//Put your code here
				
		return false; //Remove this line
	}
	
	/**
	 * Function that returns a list of words that could
	 * 		match the inputed word 
	 * @param word - String, word that can have gaps in it in the
	 * 		form of asterisks
	 * @return List of complete words that could match the given word
	 */
	public List<String> getPossibleMatches(String word){
		return new ArrayList<String>();
	}
	
	/**
	 * Plays a game of hangman. For rules refer to wikipedia
	 * 		https://en.wikipedia.org/wiki/Hangman_(game)
	 * 		User is allowed 6 guesses. 2 guesses are taken off 
	 * 		for incorrectly guessing vowels, in this version, the
	 * 		user can type an asterisk ("*") to see possible words 
	 * 		that the secret word could be given the letters the user
	 * 		has guessed
	 */
	public void playHangmanWithHints(){
		//For debugging, comment this line out and set your own secret word
		String secretWord = this.getRandomWord();
		
		//Put your code here
	}
	
	
	
	
	
	
	public static void main(String[] args) throws IOException{
		HangmanGame hg = new HangmanGame();
		hg.playHangman();
	}
	
}
