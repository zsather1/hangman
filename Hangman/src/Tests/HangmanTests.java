package Tests;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import hangman.HangmanGameSol;

public class HangmanTests {

	@Test
	public void testIsWordGuessed(){
		HangmanGameSol hg = null;
		try {
			hg = new HangmanGameSol();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<String> guessedLetters = new ArrayList<String>();
		assertFalse(hg.isWordGuessed("abc", guessedLetters));
		assertTrue(hg.isWordGuessed("", guessedLetters));
		guessedLetters.add("a");
		guessedLetters.add("b");
		guessedLetters.add("t");
		assertTrue(hg.isWordGuessed("bat", guessedLetters));
		assertFalse(hg.isWordGuessed("batter", guessedLetters));
	}
	
	@Test
	public void testGetGuessedWord(){
		HangmanGameSol hg = null;
		try {
			hg = new HangmanGameSol();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String word = "abc";
		List<String> guessedLetters = new ArrayList<String>();
		assertEquals(hg.getGuessedWord(word, guessedLetters),"***");
		guessedLetters.add("a");
		assertEquals(hg.getGuessedWord(word, guessedLetters),"a**");
		guessedLetters.add("z");
		assertEquals(hg.getGuessedWord(word, guessedLetters),"a**");
		guessedLetters.add("b");
		guessedLetters.add("c");
		assertEquals(hg.getGuessedWord(word, guessedLetters),word);
		
	}
	
	@Test
	public void testGetAvailableLetters(){
		HangmanGameSol hg = null;
		try {
			hg = new HangmanGameSol();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<String> guessedLetters = new ArrayList<String>();
		assertEquals(hg.getAvailableLetters(guessedLetters),"abcdefghijklmnopqrstuvwxyz");
		guessedLetters.add("a");
		assertEquals(hg.getAvailableLetters(guessedLetters),"bcdefghijklmnopqrstuvwxyz");
		guessedLetters.add("c");
		guessedLetters.add("z");
		assertEquals(hg.getAvailableLetters(guessedLetters),"bdefghijklmnopqrstuvwxy");
	}
	
}
