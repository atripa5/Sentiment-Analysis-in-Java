import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
	
	

	


public static void main(String args[]) throws IOException
{
	try{
		int count=0;
		String tweet;
	
		 Map<String, String> map = new HashMap<String, String>();
	        BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Abhishek\\Desktop\\Yelp Twitter Analysis\\Twitter-Sentiment-Analysis-using-Heuristics\\Solution Files\\AFFIN.txt"));
	        String line = "";
	        while ((line = in.readLine()) != null) {
	            String parts[] = line.split("\t");
	            map.put(parts[0], parts[1]);
	            count++;
	        }
	        in.close();
	     //   System.out.println(map.toString());
	   
		
		
		Scanner inputStream= new Scanner(new FileReader("C:\\Users\\Abhishek\\Desktop\\SentimentTest.csv"));
		while(inputStream.hasNextLine())
		{
			float tweetscore=0;
		tweet= inputStream.nextLine();
		String[] word=tweet.toLowerCase().split(" ");
		System.out.println(word[0]);
		

			for(int i=0; i<word.length;i++)
			{
				String wordscore= map.get(word[i].toLowerCase());
				if(map.get(word[i])!=null)
				{
				tweetscore=(float) tweetscore + Integer.parseInt(wordscore);
			}}
			Map<String, Float> sentiment= new HashMap<String, Float>();
			sentiment.put(tweet, tweetscore);
			System.out.println(sentiment.toString()); 
		
					
		} 
		System.out.println(count);
		
		
		

}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	
}
}}