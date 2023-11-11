package week6.TheLibraryInformationSystem;

import java.util.ArrayList;

class StringUtils {
    public static boolean included(String word, String searched)
    {
        if(word == null || searched == null)
        {
            return false;
        }
        String trimmedSearched = searched.trim();
        return word.toUpperCase().contains(trimmedSearched.toUpperCase());
    }
}
