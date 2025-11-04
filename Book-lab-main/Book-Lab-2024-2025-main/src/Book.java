public class Book {
    public String pigLatin(String word) {
        String vowel = "aeiouAEIOU";
        String numbers = "0123456789";
        String punctuations = "!.?,;:()[]{}";
        String combine = word;
        boolean isVowel = false;
        String punct = "";
        

        if (word.length()==0) {
            return word;
        }
        else if (numbers.indexOf(word.substring(0,1)) >= 0) {
            return word;
        }
        else if (vowel.indexOf(word.substring(0,1)) >= 0) {
            return word + "yay";
        }
        for (int i = 0; i < word.length(); i++) {

            if (punctuations.indexOf(word.substring(i)) >= 0) {
                punct += word.substring(i);

            }
        }
        String remain = word.substring(0, word.length()-punct.length());
        for (int i = 0; i<remain.length();i++) {

            if (isVowel != true && vowel.indexOf(remain.substring(i,i+1)) >= 0) {
                isVowel = true;
                if (Character.isUpperCase(remain.charAt(0))) {
                    String lowercase = remain.toLowerCase();
                    String newWord = lowercase.substring(i,lowercase.length()) + lowercase.substring(0,i) + "ay";
                    combine = newWord.substring(0,1).toUpperCase() + newWord.substring(1);
                }
                else {
                    combine = remain.substring(i,remain.length()) + remain.substring(0,i) + "ay";
                }
            }
        } 
        combine = combine + punct;

    return combine; 
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