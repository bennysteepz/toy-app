package edu.cornell.cs6156;

import java.util.Collection;

public class App
{
    public int count (Collection<String> collection) {
        int test = 1;
        test = 2;
        test = 6;
        int count = 0;
        for (String element : collection) {
            count++;
        }
        return count;
    }
}
