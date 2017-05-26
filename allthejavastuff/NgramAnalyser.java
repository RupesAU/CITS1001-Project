import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import java.util.HashSet;
import java.util.Arrays;

/**
 * Perform n-gram analysis of a string.
 * 
 * Analyses the frequency with which distinct n-grams, of length n,
 * appear in an input string. For the purposes of all analyses of the input
 * string, the final n-1 n-grams appearing in the string should be
 * "filled out" to a length of n characters, by adding
 * a sequence of contiguous characters from the start of the string.
 * e.g. "abbc" includes "bca" and "cab" in its 3-grams
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NgramAnalyser
{
    /** dictionary of all distinct n-grams and their frequencies */
    private HashMap<String,Integer> ngram;

    /** number of distinct characters in the input */
    private int alphabetSize;

    /** n-gram size for this object (new field) */
    private int ngramSize;

    /** 
     * Analyse the frequency with which distinct n-grams, of length n,
     * appear in an input string. 
     * n-grams at the end of the string wrap to the front
     * e.g. "abbbbc" includes "bca" and "cab" in its 3-grams
     * @param int n size of n-grams to create
     * @param String inp input string to be modelled
     */
    public NgramAnalyser(int n, String inp) 
    {   
        StringBuilder sb = new StringBuilder("");
        int len;
        
        if(inp == null){
            throw new IllegalArgumentException(
             "String must not be null");
        }
        else{
            len = inp.length();
        }
        
        if (n <= 0) 
           { 
           throw new IllegalArgumentException(
            "N-gram must have length greater than zero.");
        }
        
        if ((len == 0)) 
           { 
           throw new IllegalArgumentException(
            "String must have length greater than zero.");
          }
          
         if (n > len) 
          { 
           throw new IllegalArgumentException(
            "N-gram must have a length equal to or less than the String size.");
        }
        
        for(int i = 0; i < len; i++){
         
            for(int j = 0; j < n; j++){
                if((i+j) > len-1){
                    System.out.print(inp.charAt((i+j)-len));
                    sb.append(inp.charAt((i+j)-len));
                }

                else{
                    System.out.print(inp.charAt(i+j));
                    sb.append(inp.charAt(i+j));
                }
           
            }
            System.out.print(" "); 
        }

        ngram = new HashMap<String, Integer>();
        
        String resString = sb.toString();
        String[] inputArray = splitStringEvery(resString, n);
        
        Arrays.sort(inputArray);
       //Alphabetize?
        
        for (String a : inputArray){
            if(ngram.get(a) != null) {
                ngram.put(a, ngram.get(a)+1);
            }
            else {
                ngram.put(a,1);
            }
        }
       
        System.out.println(ngram.size() + " distinct words:");
        //NOTE: ngram.size() is the 'frequencies of n-grams.
        
        System.out.println(ngram);
        
        
        
        
        
        // ---------------------------
        //   Obtaining Alphabet Size
        //   Note: Capital letters are considered different to lowercase letters when counting the alphabetSize. I.e. "eE" has int alphabetSize 2.
        // ---------------------------
        boolean isContainedPreviously = false;
        alphabetSize = 1;
        
        for(int i = 1; i < len; i++){
            for (int j = 0; j < i; j++){
                if(inp.charAt(i) == inp.charAt(j)){
                        isContainedPreviously = true;
                }
            }
            if(isContainedPreviously == false){
                alphabetSize = alphabetSize + 1;
            }
            else{
                isContainedPreviously = false;
            }
        }
        
        System.out.println("This is the alphabetSize: " + alphabetSize);
        

      
       
    }

    
    /** 
     * Analyses the input text for n-grams of size 1.
     */
    public NgramAnalyser(String inp) 
    {
        this(1,inp);
    }

    /**
     * @return int the size of the alphabet of a given input
     */
    public int getAlphabetSize() {
        return alphabetSize;
    }

    /**
     * @return the total number of distinct n-grams appearing
     *         in the input text.
     */
    public int getDistinctNgramCount() {
        return ngram.size();
    }

    /** 
     * @return Return a set containing all the distinct n-grams
     *         in the input string.
     */
    public Set<String> getDistinctNgrams() {
        //TODO replace this line with your code
        return null;
    }

    /**
     * @return the total number of n-grams appearing
     *         in the input text (not requiring them to be distinct)
     */
    public int getNgramCount() {
        int x = 0;
        for(Object value : ngram.values()){
            x = x + Integer.parseInt(value.toString());
        }
        return x;
    }

    /** Return the frequency with which a particular n-gram appears
     * in the text. If it does not appear at all, return 0.
     * 
     * @param ngram The n-gram to get the frequency of
     * @return The frequency with which the n-gram appears.
     */
    public int getNgramFrequency(String ngram) {
        int x = this.ngram.get(ngram);
        if(x != 0){
            return x; 
        }
        return 0;
    }



    /**
     * Generate a summary of the ngrams for this object.
     * @return a string representation of the n-grams in the input text 
     * comprising the ngram size and then each ngram and its frequency
     * where ngrams are presented in alphabetical order.     
     */
    public String toString()
    {
        //Alphabetise? Alphabetisation might be easier if you do it when it's being stored up above.
        
        String result = "";
        String num = "";
        
        for (String key : ngram.keySet()){
            System.out.println(key + " " + ngram.get(key));
            result = result + key + " " + ngram.get(key) + "\n";
            num = key;
        }
        
        result = num.length() + "\n" + result;
        
        System.out.println(result);
        return result;
    }

    /**
     * https://stackoverflow.com/questions/12295711/split-a-string-at-every-nth-position
     */
        public String[] splitStringEvery(String s, int interval) {
        int arrayLength = (int) Math.ceil(((s.length() / (double)interval)));
        String[] result = new String[arrayLength];

        int j = 0;
        int lastIndex = result.length - 1;
        for (int i = 0; i < lastIndex; i++) {
            result[i] = s.substring(j, j + interval);
            j += interval;
        } //Add the last bit
        result[lastIndex] = s.substring(j);

        return result;
    }
    
}
