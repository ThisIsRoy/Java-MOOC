public class StringUtils {
    public static boolean included(String word, String searched) {
        String trimmedSearch = searched.trim();

        if (word.toUpperCase().contains(trimmedSearch.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}
