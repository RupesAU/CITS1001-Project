import java.util.Set;
/**
 * Construct a Markov model of order /k/ based on an input string.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MarkovModel
{

    /** Markov model order parameter */
    int k; 
    /** ngram model of order k */
    NgramAnalyser ngram; 
    /** ngram model of order k+1 */
    NgramAnalyser n1gram; 

    /**
     * Construct an order-k Markov model from string s
     * @param k int order of the Markov model
     * @param s String input to be modelled
     */
    public MarkovModel(int k, String s) 
    {
        //TODO replace this line with your code
    }

    /**
     * @return order of this Markov model
     */
    public int getK()
    {
        return k;
    }

    /** Estimate the probability of a sequence appearing in the text 
     * using simple estimate of freq seq / frequency front(seq).
     * @param sequence String of length k+1
     * @return double probability of the last letter occuring in the 
     * context of the first ones or 0 if front(seq) does not occur.
     */
    public double simpleEstimate(String sequence) {
        //TODO replace this line with your code
        return -1.0;

    }
    /**
     * Calculate the Laplacian probability of string obs given this Markov model
     * @input sequence String of length k+1
     */
    public double laplaceEstimate(String sequence) 
    { 
        //TODO replace this line with your code
        return -1.0;
    }

    /**
     * @return String representing this Markov model
     */
    public String toString()
    {
        //TODO replace this line with your code
        return null;
    }

}
