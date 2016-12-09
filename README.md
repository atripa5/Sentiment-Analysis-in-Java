# Sentiment-Analysis-in-Java
A sentiment analysis code that tells us the sentiment of a sentence based on a dictionary of words which tag words as negative and positive and give them a score from -10 to 10

Resources Used:
  -AFINN dictionary (It is a dictionary of negative and positive words which gives them score based on the extremity of the word)
          Link: http://www2.imm.dtu.dk/pubdb/views/publication_details.php?id=6010
  -Stopwords: It is a list of most common words which don't have any sentiments. These include pronouns like I, We, You and the like. 
  
  Project Overview:
    The main idea of the project is to calculate the TweetScore for a tweet. To perform the analysis we use a .csv file of tweets
    which were fetched using the Twitter API. The tweets are picked up one by one and then are splitted by a blank space to get a list of 
    all the words used in the tweet. The words, taken one at a time are checked if they are present in the Stopwords. If the word is present
    in the list of Stopwords, the word is ignored and the code moves on to the next word. If a word is not present in the Stopwords' list, it 
    is checked for in the AFINN library which has been converted into a hasmap with <word, score> as key value pair. The score of the word is 
    fetched and added to the TweetScore, which is the overall score for a tweet. The TweetScore is addition of scores of all the individual 
    words present in the AFINN library. If a word is not present in the AFINN library, it is skipped.
    
Limitations:
    -- It can only be used for tweets in English language as the dictionary limits it's scope to other languages.
    -- The overall sentiment of the tweet depends upon the sentiment of words used in the word which can lead to a few false positives.
