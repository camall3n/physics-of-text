package org.ucb.generative_ie.random;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import com.google.common.collect.Lists;
import org.ucb.generative_ie.util.LogProbMap;
import org.ucb.generative_ie.util.ProbMap;
import org.ucb.generative_ie.util.Util;

public class RandomUtil {

	public static <E> E choice(Collection<E> collection, Random rng)
	{
		return choice(new ArrayList<E>(collection), rng);
	}

	public static <E> E choice(List<E> list, Random rng)
	{
        if (list.size() == 0) {
            throw new RuntimeException("list must have at least one element");
        }
		int index = rng.nextInt(list.size());
		return list.get(index);
	}

	public static <E> E choice(E[] list, Random rng)
	{
        if (list.length == 0) {
            throw new RuntimeException("list must have at least one element");
        }
		int index = rng.nextInt(list.length);
		return list[index];
	}

	public static <E> List<E> sample(List<E> list, int k, Random rng)
	{
		List<E> samples = Lists.newArrayList();
		List<E> copy = Lists.newArrayList(list);

		if (k <= copy.size())
		{
			for (int i = 0; i < k; i++)
			{
				E chosen = choice(copy, rng);
				samples.add(chosen);
				copy.remove(chosen);
			}

			return samples;
		}
		else
		{
			throw new RuntimeException("k larger than the size of list");
		}
	}

        /**
         * Return a boolean value according to the given probability
         * @param prob
         * @param rng
         * @return 
         */
        public static boolean binarySample(double prob, Random rng)
	{
		return rng.nextDouble() < prob;
	}
        
        
        public static int nextIntDist(int N, Random rng) {
            ProbMap <Integer> sampler = new LogProbMap();
            // log(2^N -2) = log(2^N * (1 - 0.5^(N-1))) = N * log(2) + log(1- 0.5^(N-1))
            double logProbNorm = N * Math.log(2) + Math.log(1 - Math.pow(0.5, N-1)) ;
            for (int i =1; i<N; i++) {
                sampler.multiplyKey(i, Math.exp(Util.logCombination(N, i) - logProbNorm));
                //System.out.println(String.format("%d: %s", i, Math.exp(Util.logCombination(N, i) - logProbNorm)));
            }
            
            return sampler.sample(rng);
        }
}
