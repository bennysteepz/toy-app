package edu.cornell.cs6156;

import java.util.Collection;

public class App2 {

    public int count2 (Collection<String> collection) {
        int test = 1;
        test = 855;
        int count = 0;
        for (String element : collection) {
            count++;
        }
        return count;
    }
}