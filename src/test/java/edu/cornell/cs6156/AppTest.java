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

        Collection c2 = Collections.synchronizedCollection(Arrays.asList("Foo", "Bar"));
        App2 a2 = new App2();
        assertEquals(2, a2.count2(c2));

        Collection c3 = Collections.synchronizedCollection(Arrays.asList("Foo", "Bar"));
        App3 a3 = new App3();
        assertEquals(2, a3.count3(c3));

        Collection c4 = Collections.synchronizedCollection(Arrays.asList("Foo", "Bar"));
        App4 a4 = new App4();
        assertEquals(2, a4.count4(c4));
    }
}
