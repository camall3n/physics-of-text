package org.ucb.generative_ie.inference;

import java.util.Iterator;

import org.ucb.generative_ie.generator.WorldGenerator;
import org.ucb.generative_ie.world.Evidence;
import org.ucb.generative_ie.world.World;

public class RejectionSamplingInferer extends Inferer {
	private final int numIterations;
	private final WorldGenerator generator;
	private final Evidence evidence;

	public RejectionSamplingInferer(int numIterations, WorldGenerator generator, Evidence evidence) {
		super(numIterations);
		this.numIterations = numIterations;
		this.generator = generator;
		this.evidence = evidence;
	}

	public class RejectionSamplingIterator implements Iterator<World>
	{
		private int currentIteration;

		public RejectionSamplingIterator()
		{
			this.currentIteration = 0;
		}

		@Override
		public boolean hasNext() {
			return currentIteration < numIterations;
		}

		@Override
		public World next() {
            if (currentIteration % (numIterations / 10) == 0)
			{
				System.out.print(String.format("Iteration: (%d / %d)\r", currentIteration, numIterations));
			}

			while (true)
			{
				World newWorld = generateWorld();
				if (acceptSample(newWorld))
				{
					currentIteration++;
					return newWorld;
				}
			}
		}

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

	}

	public World generateWorld()
	{
		return this.generator.sampleWorld();
	}

	public boolean acceptSample(World world)
	{
		return this.evidence.acceptWorld(world);
	}

	@Override
	public Iterator<World> iterator() {
		return new RejectionSamplingIterator();
	}

}
