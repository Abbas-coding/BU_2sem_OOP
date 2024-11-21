package source;

public class Main {
    public static String reverseWord(String word) {

        if (word.isEmpty() || word.length() == 1) {
            return word;
        }

        return word.charAt(word.length() - 1) + reverseWord(word.substring(0, word.length() - 1));
    }
    public static void main(String[] args) {

        String word = "language";
        String reversedWord = reverseWord(word);

        System.out.println("Original word: " + word);
        System.out.println("Reversed word: " + reversedWord);
        }
}