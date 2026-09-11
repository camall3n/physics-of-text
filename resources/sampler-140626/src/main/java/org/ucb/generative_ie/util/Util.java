package org.ucb.generative_ie.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import com.google.gson.Gson;
import java.math.BigInteger;

public class Util {

	public static <E> E choice(List<E> list, Random randomGenerator)
	{
		int randomIndex = randomGenerator.nextInt(list.size());
		return list.get(randomIndex);
	}

	public static <E> E choice(Set<E> set, Random randomGenerator)
	{
		LinkedList<E> list = new LinkedList<E>();
		list.addAll(set);
		return choice(list, randomGenerator);
	}

    public static double sum(double[] arr)
    {
        double total = 0;
        for (Double d : arr)
        {
            total += d;
        }

        return total;
    }

	public static double average(List<Double> values)
	{
		double total = 0;
		for (Double v : values)
			total += v;
		return total / values.size();
	}

	public static double variance(List<Double> values)
	{
        double average = average(values);

		double total = 0;
		for (Double v : values)
			total += Math.pow(v - average, 2);
		return total / values.size();
	}

	public static double stddev(List<Double> values)
	{
		return Math.pow(variance(values), 0.5);
	}

	public static void normalize(double[] vector)
	{
		double total = 0;
		for (double d : vector)
		{
			total += d;
		}

		for (int i = 0; i < vector.length; i++)
		{
			vector[i] = vector[i] / total;
		}
	}

	public static void writeToFile(String filename, String output)
	{
		Writer writer = null;

		try {
		    writer = new BufferedWriter(new OutputStreamWriter(
		          new FileOutputStream(filename), "utf-8"));
		    writer.write(output);
		} catch (IOException ex){
		  // report
		} finally {
		   try {writer.close();} catch (Exception ex) {}
		}
	}

        public static void updateFile(String filename, String output) 
        {
            Writer writer = null;
            try {
                writer = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream(filename, true), "utf-8"));
                writer.write(output);
            } catch (IOException ex){
                // report
            } finally {
                try {writer.close();} catch (Exception ex) {}
            }
        }
        
	public static void writeJsonToFile(String filename, Object obj)
	{
        Gson gson = new Gson();
        String output = gson.toJson(obj);

        writeToFile(filename, output);
	}

	public static <E> boolean allEqual(Collection<E> objects)
	{
		if (objects.size() == 0)
		{
			return true;
		}

		Object ref = null;

		for (Object o : objects)
		{
			if (ref == null)
			{
				ref = o;
			}
			else
			{
				if (!o.equals(ref))
				{
					return false;
				}
			}
		}
		return true;
	}

    public static double logAdd(double x, double y) {
        //if (x==0) {
        //    return y;
        //}
        //if (y==0) {
        //    return x;
        //}
        if(x > y)
            return x + Math.log(1 + Math.exp(y - x));
        else
            return y + Math.log(1 + Math.exp(x - y));
    }
    
    public static double logSubtract(double x, double y) {
        if (x > y)
            return x + Math.log(1 - Math.exp(y - x));
        else
            return y + Math.log(Math.exp(x - y) -  1);
    }

    public static boolean almostEqual(double a, double b, double delta) {
        return Math.abs(a - b) <= Math.abs(delta);
    }

    public static String joinPath(String path1, String path2) {
        return (new File(path1, path2)).toString();
    }

    public static <T extends Comparable<? super T>> List<T> asSortedList(Collection<T> c) {
        List<T> list = new ArrayList<T>(c);
        java.util.Collections.sort(list);
        return list;
    }
    
    /**
     * factorial of integer n, BigInteger returned
     * @param n
     * @return 
     */
    public static BigInteger factorial(int n) {
        BigInteger factorialValue = BigInteger.valueOf(1);
        for (int i=1; i<=n; i++) {
            factorialValue = factorialValue.multiply(BigInteger.valueOf(i));
        }
        return factorialValue;
    }
    
    /**
     * the combination of n choose k
     * @param n
     * @param k
     * @return 
     */
    public static BigInteger combination(int n, int k) {
        if(k>n)
            throw new IllegalArgumentException("N choose k: k is bigger than N!");
        BigInteger comb = BigInteger.valueOf(1);
        for (int i=k+1; i<=n; i++) {
            comb = comb.multiply(BigInteger.valueOf(i));
        }
        comb = comb.divide(factorial(n-k));
        return comb;
    }
    
    public static double combinationRatio(int n, int j, int k) {
        if (j>n || k>n) {
            throw new IllegalArgumentException("N choose j or k: j or k is bigger than N!");
        }
         
        double ratio = 1.0;
        if (j==k) {
            return ratio;
        }
        BigInteger temp1 = BigInteger.valueOf(1);
        BigInteger temp2 = BigInteger.valueOf(1);
        if (j > k) {
            for (int i = n-j +1; i<=n-k; i++) {
                temp1 = temp1.multiply(BigInteger.valueOf(i));
            }
            
            for (int i = k+1; i <=j; i++) {
                temp2 = temp2.multiply(BigInteger.valueOf(i));
            }
        }
        else {
           for (int i = j+1; i<=k; i++) {
               temp1 = temp1.multiply(BigInteger.valueOf(i));
           }
           
           for (int i = n-k+1; i<= n-j; i++){
               temp2 = temp2.multiply(BigInteger.valueOf(i));
           }
        }
        
        ratio = temp1.doubleValue()/temp2.doubleValue();
        //System.out.println(temp1.doubleValue());
        //System.out.println(temp2.doubleValue());
        return ratio;
    }
     
    public static BigInteger combination( List <Integer> interList) {
        BigInteger comb = BigInteger.valueOf(1);
        int sum = 0; 
        for (int i : interList) {
            sum += i;
        }
        comb = comb.multiply(factorial(sum));
        for (int i: interList) {
            comb = comb.divide(factorial(i));
        }
        
        return comb;
    }
    
    public static double logFactorial(int n) {
        double logF= 0.0;
        for (int i=1; i<=n; i++) {
            logF += Math.log(i);
        }
        return logF;
    }
    
    public static double logCombination(int n, int k) {
         if(k>n)
            throw new IllegalArgumentException("Combination of choosing k from N: k is bigger than N!");
         
         return logFactorial(n)-logFactorial(k)-logFactorial(n-k);
    }
    
    public static double logCombination( List <Integer> interList) {
        double logComb = 0;
        int sum = 0; 
        for (int i : interList) {
            logComb -= logFactorial(i);
            sum += i;
        }
        logComb += logFactorial(sum);
        return logComb;
    }
    /**
     * C_n^j / C_n^k
     * @param n
     * @param j
     * @param k
     * @return 
     */
    public static double logCombinationRatio(int n, int j, int k) {
        if (j>n || k>n) {
            throw new IllegalArgumentException("Combination of choosing j or k from N: j or k is bigger than N!");
        }
        
        return logFactorial(n-k) + logFactorial(k) - logFactorial(n-j) - logFactorial(j);
    }
    
    /**
     * P_n^k
     * @param n
     * @param k
     * @return 
     */
    public static double logPermutation(int n, int k) {
        if (n<k) {
            throw new IllegalArgumentException(String.format("Permutation of choosing k from N: k=%d is bigger than N=%d!", k, n));
        }
        return logFactorial(n) - logFactorial(n-k);
    }
    
    /**
     * Delta function
     */
    public static int deltaFunction(Object i, Object j) {
        if (i == j)
            return 1;
        else
            return 0;
    }
    
    /**
     * the autocorrelation time, which is defined as 1 + sum_k=1^infinity {rho_k}
     * (Thompson 2010)
     * @param objectSamples: the samples for certain variables to be evaluated 
     * @return 
     */
    public static double autoCorrelationTime(Collection <Object> objectSamples) {
        double act = 1.0;
        
        int n = objectSamples.size();
        
        double rho_k = 0;
        
        do {
            // TO BE IMPLEMENTED
            if(n==1)
                break;
        }
        while(true);
        
        return act;
    }
}
