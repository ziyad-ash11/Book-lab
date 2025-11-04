public class Book {
    public String pigLatin(String word) {
        String newString = "";
        String vowel = "aeiouAEIOU";
        String numbers = "0123456789";
        String punctuations = "!.?,;:()[]{}";
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
                if (Character.isUpperCase(word.charAt(0))) {
                    String lowercase = word.toLowerCase();
                    String newWord = lowercase.substring(i,lowercase.length()) + lowercase.substring(0,i) + "ay";
                    String combine = newWord.substring(0,1).toUpperCase() + newWord.substring(1);
            if (punctuations.indexOf(word.substring(i,word.length())) >= 0) {
                return combine + word.substring(i,word.length());
            } else {
                return combine;
            }
                }
                else {
                    return word.substring(i,word.length()) + word.substring(0,i) + "ay";
                }
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