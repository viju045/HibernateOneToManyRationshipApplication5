package org.mahagan.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ItemsTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Items}
     *   <li>{@link Items#setId(int)}
     *   <li>{@link Items#setIntemsCode(String)}
     *   <li>{@link Items#setItemsName(String)}
     *   <li>{@link Items#setItemsPrice(int)}
     *   <li>{@link Items#setItemsQuntity(int)}
     *   <li>{@link Items#getId()}
     *   <li>{@link Items#getIntemsCode()}
     *   <li>{@link Items#getItemsName()}
     *   <li>{@link Items#getItemsPrice()}
     *   <li>{@link Items#getItemsQuntity()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Items actualItems = new Items();
        actualItems.setId(1);
        actualItems.setIntemsCode("Intems Code");
        actualItems.setItemsName("Items Name");
        actualItems.setItemsPrice(42);
        actualItems.setItemsQuntity(42);
        assertEquals(1, actualItems.getId());
        assertEquals("Intems Code", actualItems.getIntemsCode());
        assertEquals("Items Name", actualItems.getItemsName());
        assertEquals(42, actualItems.getItemsPrice());
        assertEquals(42, actualItems.getItemsQuntity());
    }
}

