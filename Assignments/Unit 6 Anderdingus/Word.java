public class Word {

    private String originalWord;
    private String sortedWord;

    public Word(String word) {
        if (isValidWord(word)) {
            originalWord = word;
        } else {
            originalWord = "";
        }
        sortedWord = sortWord();
    }

    public String getOriginalWord() {
        return originalWord;
    }

    public String getSortedWord() {
        return sortedWord;
    }

    // checks that the word only has letters (no numbers or special characters)
    private boolean isValidWord(String word) {
        if (word == null || word.length() == 0) {
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    // converts originalWord to a lowercase char array
    private char[] wordToCharArray() {
        String lower = originalWord.toLowerCase();
        char[] chars = new char[lower.length()];
        for (int i = 0; i < lower.length(); i++) {
            chars[i] = lower.charAt(i);
        }
        return chars;
    }

    // finds the index of the smallest character from position start to end
    private int findSmallestIndex(char[] chars, int start) {
        int smallestIndex = start;
        for (int i = start + 1; i < chars.length; i++) {
            if (chars[i] < chars[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    // swaps two characters in the array
    private void swapChars(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    // converts a char array back to a String
    private String charArrayToString(char[] chars) {
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            result = result + chars[i];
        }
        return result;
    }

    // sorts originalWord using selection sort and returns it as a lowercase String
    public String sortWord() {
        char[] chars = wordToCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            int smallestIndex = findSmallestIndex(chars, i);
            if (smallestIndex != i) {
                swapChars(chars, i, smallestIndex);
            }
        }
        return charArrayToString(chars);
    }

    public String toString() {
        return originalWord;
    }

}
