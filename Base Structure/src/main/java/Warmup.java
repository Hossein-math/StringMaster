public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number) {
        String[] subStrings = sentence.split(" ");
        if(0 < number && number <= subStrings.length)
            return subStrings[number - 1];
        else
            return String.format(" Number = %d is out Of Bound", number);
    }

    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven) {
        int result = 0;
        if (searchForEven)
            for (int i = 0; i < number.length(); i++)
                switch (number.charAt(i)) {
                    case '0':
                    case '2':
                    case '4':
                    case '6':
                    case '8':
                        result++;
                }
        else
            for (int i = 0;i < number.length();i++)
                switch (number.charAt(i)) {
                    case '1':
                    case '3':
                    case '5':
                    case '7':
                    case '9':
                        result++;
                }
        return result;
    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {
        int length = (wordA.length() < wordB.length()) ? wordA.length() : wordB.length();
        for (int i = 0;i < length;i++)
        {
            if(wordA.charAt(i) < wordB.charAt(i))
                return wordA;
            else if(wordA.charAt(i) > wordB.charAt(i))
                return wordB;
        }
        if(wordA.length() < wordB.length())
            return wordA;
        else
            return wordB;
    }
}
