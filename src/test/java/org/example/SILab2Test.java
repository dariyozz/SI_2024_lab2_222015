package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    @Test
    void checkCartNull() {
        List<Item> items = null;
        RuntimeException err;
        err = assertThrows(RuntimeException.class,()-> SILab2.checkCart(items,0));
        assertTrue(err.getMessage().contains("allItems list can't be null!"));
    }
    @Test
    void checkCartTrue(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "123456", 200, 0.1f));
        items.add(new Item("Item2", "789012", 150, 0.0f));
        int payment = 500;

        boolean result = SILab2.checkCart(items, payment);

        assertTrue(result);
    }
}