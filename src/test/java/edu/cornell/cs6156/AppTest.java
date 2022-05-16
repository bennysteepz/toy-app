package edu.cornell.cs6156;

import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.Collections;
import java.util.Arrays;

import org.junit.Test;

public class AppTest
{
    @Test
    public void countSynchronizedCollection() {
        Collection c = Collections.synchronizedCollection(Arrays.asList("Foo", "Bar"));
        App a = new App();
        assertEquals(2, a.count(c));

        Collection c4 = Collections.synchronizedCollection(Arrays.asList("Foo", "Bar"));
        App4 a4 = new App4();
        assertEquals(2, a4.count(c4));
    }
}
