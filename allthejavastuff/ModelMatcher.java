import java.util.HashMap;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Report the average log likelihood of a test String occuring in a 
 * given Markov model and detail the calculated values behind this statistic.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ModelMatcher
{

    /** log likelihoods for a teststring under a given model */
    private HashMap<String,Double> logLikelihoodMap;
    /** summary statistic for this setting */
    private double averageLogLikelihood;  
        
    /**
     * Constructor to initialise the fields for the log likelihood map for 
     * a test string and a given Markov model and 
     * the average log likelihood summary statistic
     * @param MarkovModel model a given Markov model object
     * @param String teststring
     */
    public ModelMatcher(MarkovModel model, String testString)
    {
        //TODO 
    }

    /** Helper method that calculates the average log likelihood statistic
     * given a HashMap of strings and their Laplace probabilities
     * and the total number of ngrams in the model.
     * 
     * @param logs map of ngram strings and their log likelihood
     * @param ngramCount int number of ngrams in the original test string
     * @return average log likelihood: the total of loglikelihoods 
     *    divided by the ngramCount
     */
    private double averageLogLikelihood(HashMap<String,Double> logs, int ngramCount)
    {
        //TODO
        return 0.1;
    }
    
    /** Helper method to calculate the total log likelihood statistic
     * given a HashMap of strings and their Laplace probabilities
     * and the total number of ngrams in the model.
     * 
     * @param logs map of ngram strings and their log likelihood
     * @return total log likelihood: the sum of loglikelihoods in logs 
     */
    private double totalLogLikelihood(HashMap<String,Double> logs)
    {
        //TODO
        return 0.1;
    }

    
    /**
     * @return the average log likelihood statistic
     */
    public double getAverageLogLikelihood() 
    {
        return averageLogLikelihood;
    }
    
    /**
     * @return the log likelihood value for a given ngram from the input string
     */
    public double getLogLikelihood(String ngram) 
    {
        return (logLikelihoodMap.get(ngram));
    }
    
    
    /**
     * Make a String summarising the log likelihood map and its statistics
     * @return String of ngrams and their loglikeihood differences between the models
     * The likelihood table should be ordered from highest to lowest likelihood
     */
    public String toString() 
   {
       //TODO
       return null;
    }

 
}
