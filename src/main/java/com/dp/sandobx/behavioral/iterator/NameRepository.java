package com.dp.sandobx.behavioral.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

// ===== Collection =====
class NameRepository {
    private String[] names = {"Alice", "Bob", "Charlie"};

    public Iterator<String> getIterator() {
        return new ArrayList<>(Arrays.asList(names)).iterator();
    }
}
