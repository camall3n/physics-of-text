package org.ucb.generative_ie.mh;

import org.junit.Test;

public final class EntityPartitionTargetRegressionTest {
    @Test public void actualEntityKernelsPreserveTheStatedPartitionTarget() {
        EntityPartitionChainProbe.main(new String[]{"--actual-fix"});
    }
}
