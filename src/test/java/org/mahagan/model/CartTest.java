package org.mahagan.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class CartTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Cart}
     *   <li>{@link Cart#setCartId(int)}
     *   <li>{@link Cart#setItems(Set)}
     *   <li>{@link Cart#setName(String)}
     *   <li>{@link Cart#setTotal(int)}
     *   <li>{@link Cart#getCartId()}
     *   <li>{@link Cart#getItems()}
     *   <li>{@link Cart#getName()}
     *   <li>{@link Cart#getTotal()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Cart actualCart = new Cart();
        actualCart.setCartId(1);
        HashSet<Items> items = new HashSet<>();
        actualCart.setItems(items);
        actualCart.setName("Name");
        actualCart.setTotal(1);
        assertEquals(1, actualCart.getCartId());
        assertSame(items, actualCart.getItems());
        assertEquals("Name", actualCart.getName());
        assertEquals(1, actualCart.getTotal());
    }
}

