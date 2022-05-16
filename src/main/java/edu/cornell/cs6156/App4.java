package edu.cornell.cs6156;

import java.util.Collection;

public class App4 {

    public int count (Collection<String> collection) {
        int test = 1;
        test = 80;
        int count = 0;
        for (String element : collection) {
            count++;
        }
        return count;
    }
}
