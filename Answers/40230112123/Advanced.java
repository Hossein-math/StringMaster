import java.util.Objects;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content

     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input and change it with the newWord

     */
    public String wordCensor(String sentence, String word, String newWord){
        String[] subString = sentence.split(word);
        StringBuilder result = new StringBuilder(subString[0]);
        for(int i = 1;i < subString.length;i++)
            result.append(newWord).append(subString[i]);
        if(subString.length == 1)
            result.append(newWord);
        return result.toString();
    }

    /**
     * In this function You have a firstName and a lastName as Entry and you have to normalize them as a fullName
     * @param firstName is a first name with irregular letters (example : hARry)
     * @param lastName is a last name with irregular letters (example : pOtTeR)
     * @return fullName is a normal full name that just the first letter of firstName & lastName is Capitalized (example : Harry Potter)
     */
    public String normalizingName(String firstName, String lastName){
        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();
        int firstCh = firstName.charAt(0);
        if('a' <= firstCh && firstCh <= 'z')
            firstName = firstName.replace(firstName.charAt(0), (char) (firstCh - 32));
        firstCh = lastName.charAt(0);
        if('a' <= firstCh && firstCh <= 'z')
            lastName = lastName.replace(lastName.charAt(0), (char) (firstCh - 32));
        if(firstName == " ")
            return lastName;
        else if(lastName == " ")
            return firstName;
        String name = firstName + " " + lastName;
        return name;
    }

    /**
     * Removing repeated letter in a word
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated letters should be omitted
     */
    public String doubleChar(String word) {
        String result = "x";
        result += word.charAt(0);
        char tmp = word.charAt(0);
        for(int i = 1;i < word.length();i++)
        {
            if(tmp != word.charAt(i))
                result += word.charAt(i);
            tmp = word.charAt(i);
        }
        result = result.replace("x", "");
        return result;
    }
}

