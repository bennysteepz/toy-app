package edu.cornell.cs6156;

import java.util.Collection;

public class App3 {

    public int count3 (Collection<String> collection) {
        int test = 1;
        test = 81;
        int count = 0;
        for (String element : collection) {
            count++;
        }
        return count;
    }
}