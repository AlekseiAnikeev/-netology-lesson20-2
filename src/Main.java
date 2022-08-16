/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 13.08.2022
 */
public class Main {
    static final String text = "Lorem ipsum dolor sit amet," +
            " consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
            " Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat." +
            " Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur." +
            " Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        WordsChecker wordsChecker = new WordsChecker(text);
        long startTime = System.currentTimeMillis();
        System.out.println(wordsChecker.hasWord("occaecat"));
        System.out.println(wordsChecker.hasWord("Lore"));
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));
    }
}

