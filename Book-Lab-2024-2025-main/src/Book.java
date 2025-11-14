public class Book {
    public String pigLatin(String word) {
        String newString = "";
        String vowel = "aeiou";
        String numbers = "0123456789";
        if (word.length()==0) {
            return word;
        }
        else if (numbers.indexOf(word.substring(0,1)) >= 0) {
            return word + "ay";
        }
        else if (vowel.indexOf(word.substring(0,1)) >= 0) {
            return word + "yay";
        }
        for (int i = 0; i<word.length();i++) {
            if (vowel.indexOf(word.substring(i,i+1)) >= 0) {
                return word.substring(i,word.length()) + word.substring(0,i) + "ay";
            }
        }
        return word;
    }
    public int endPunctuation(String word) {
        return -1;
    }
    public String translateWord(String word) {
        String convertedWord = "";
        return convertedWord;
    }
    public String translateSentence(String setence) {
        String convertedSentence = "";
        return convertedSentence;
    }
}