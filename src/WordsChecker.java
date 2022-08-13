import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 13.08.2022
 */
public class WordsChecker {
    private final String text;

    public WordsChecker(String text) {
        this.text = text;
    }
    public boolean hasWord(String word) {
        Set<String> newText = new HashSet<>();
        Collections.addAll(newText, text.split("\\P{IsAlphabetic}+"));
        return newText.contains(word);
    }
}
