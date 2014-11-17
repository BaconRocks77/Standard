package me.hii488.moRandomStuff.ice.items;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FrostRodTest {

    @Test
    public void shouldHaveCorrectMeltednessWhenWithMeltednessUsed() {
        FrostRod.initInstances();
        FrostRod fr = new FrostRod(0);
        FrostRod fiv = fr.withMeltedness(5);
        assertEquals(5, fiv.getMeltedness());
    }

}
