package week_2.assignment_problems;

public class WordReversalEncoder {

    public static String reverseEachWord(String sentence) {

        String[] words = sentence.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {

            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();

            result.append(reversedWord).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {

        String sentence = "hello club";

        System.out.println(reverseEachWord(sentence));
    }
}