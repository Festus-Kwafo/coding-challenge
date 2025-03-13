import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReverseString {

    public String reverseMethod(String sentence){
        List<String> listOfWords = new LinkedList<>(Arrays.stream(sentence.split(" ")).toList());
        List<String> newReversedList = new ArrayList<>();
        for(int i = 0; i < listOfWords.size();){
            newReversedList.add(listOfWords.removeLast());
        }
        return String.join(" ", newReversedList);
    };
}
