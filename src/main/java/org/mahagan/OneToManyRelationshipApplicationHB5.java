package org.mahagan;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.mahagan.model.Cart;
import org.mahagan.model.Items;

import java.util.HashSet;
import java.util.Set;

public class OneToManyRelationshipApplicationHB5 {
    public static void main(String[] args) {
        StandardServiceRegistry ssr =new StandardServiceRegistryBuilder().configure().build();
        Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = metadata.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction tsx = session.beginTransaction();

        Items items = new Items();
        items.setItemsName("Biscuit");
        items.setIntemsCode("3BS");
        items.setItemsPrice(20);
        items.setItemsQuntity(5);

        Items items1 = new Items();
        items1.setItemsName("Soup");
        items1.setIntemsCode("5S");
        items1.setItemsPrice(40);
        items1.setItemsQuntity(10);

        Items items2 = new Items();
        items2.setItemsName("Chips");
        items2.setIntemsCode("1C");
        items2.setItemsPrice(5);
        items2.setItemsQuntity(3);

        Set<Items>set = new HashSet<>();
        set.add(items);
        set.add(items1);
        set.add(items2);

        Cart cart = new Cart();
        cart.setName("Trolly");
        cart.setTotal(3);

        cart.setItems(set);
        session.persist(cart);

        tsx.commit();
        session.close();
        System.out.println(" Data Inserted successfully Done! ");
    }
}