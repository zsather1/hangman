package hangman;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Christian
 *
 */
public class Words {
	
	private static List<String> WORDS;
	
	/**
	 * 
	 * @param fileName
	 * @throws IOException
	 */
	public static void parseFile(String fileName) throws IOException{
		List<String> words = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader( fileName));
		try {
			String line = br.readLine();
			while (line != null){
				//System.out.println(line);
				words.add(line);
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		br.close();
		//System.out.println("HERE");
		//System.out.println(words);
		WORDS = words;
	}
	
	/**
	 * 
	 * @return
	 */
	public static List<String> getWords(){
		return WORDS;
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		try {
			parseFile("src/words.txt");
		} catch (IOException e) {
			System.out.println("ERROR");
			e.printStackTrace();
		}
	}
	
}
