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
		System.out.println(guessedLetters);
		System.out.println(guessedLetters.contains("b"));
		assertTrue(hg.isWordGuessed("bat", guessedLetters));
		assertFalse(hg.isWordGuessed("batter", guessedLetters));
	}
	
}
