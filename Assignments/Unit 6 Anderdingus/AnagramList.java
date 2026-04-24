import java.util.AbstractList;
import java.util.ArrayList;

public class AnagramList extends AbstractList<Word> {

    private ArrayList<Word> wordList;

    // default constructor - starts with an empty list
    public AnagramList() {
        wordList = new ArrayList<Word>();
    }

    // adds a Word to the list
    public boolean add(Word word) {
        wordList.add(word);
        return true;
    }

    // returns the Word at a given index
    public Word get(int index) {
        return wordList.get(index);
    }

    // returns how many Words are in the list
    public int size() {
        return wordList.size();
    }

    // returns true if word1 and word2 are anagrams of each other
    public boolean checkAnagram(Word word1, Word word2) {
        return word1.getSortedWord().equals(word2.getSortedWord());
    }

    // searches the list and returns all Words that are anagrams of the key
    public ArrayList<Word> searchAnagrams(String key) {
        ArrayList<Word> results = new ArrayList<Word>();
        Word keyWord = new Word(key);
        for (Word w : wordList) {
            if (checkAnagram(keyWord, w)) {
                results.add(w);
            }
        }
        return results;
    }

}
