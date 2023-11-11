package week6.HashMapExercises;

import java.util.ArrayList;
import java.util.HashMap;

class Dictionary {
    private HashMap<String, String> dictionary;
    public Dictionary()
    {
        dictionary = new HashMap<String, String>();
    }
    public String translate(String word)
    {
        return dictionary.getOrDefault(word,null);
    }
    public void add(String word, String translation)
    {
        dictionary.put(word,translation);
    }
    public int amountOfWords()
    {
        return dictionary.size();
    }
    public ArrayList<String> translationList() {
        ArrayList<String> list = new ArrayList<String>();
        for (String key : dictionary.keySet()) {
            list.add(key + " = " + dictionary.get(key));
        }
        return list;
    }
}
