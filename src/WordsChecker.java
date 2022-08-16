import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 13.08.2022
 */
public class WordsChecker {
    private Set<String> newText = new HashSet<>();

    public WordsChecker(String text) {
        Collections.addAll(newText, text.split("\\P{IsAlphabetic}+"));
    }

    public boolean hasWord(String word) {
        return newText.contains(word);
    }
}
