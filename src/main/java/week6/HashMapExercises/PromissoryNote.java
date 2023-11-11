package week6.HashMapExercises;

import java.util.HashMap;

class PromissoryNote {
    private HashMap<String, Double> loans;
    public PromissoryNote()
    {
        loans = new HashMap<String, Double>();
    }
    public void setLoan(String toWhom, double value)
    {
        loans.put(toWhom,value);
    }
    public double howMuchIsTheDebt(String whose)
    {
        return loans.getOrDefault(whose,0.0);
    }
}
