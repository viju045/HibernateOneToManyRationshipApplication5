/**
 * Created By VijayKumar Moohite
 * Date : 7/4/2023
 * Time : 12:25 PM
 * Project : OneToManyRelationshipApplicationHB5
 **/

package org.mahagan;

import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.mahagan.model.Cart;
import org.mahagan.model.Items;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class OneToManyRelationshipApplicationFetchDataHB5 {
    public static void main(String[] args) {
        StandardServiceRegistry ssr =new StandardServiceRegistryBuilder().configure().build();
        Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = metadata.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction tsx = session.beginTransaction();

        TypedQuery query = session.createQuery("from Cart cart");
        List<Cart>list = query.getResultList();
        Iterator<Cart>iterator = list.listIterator();

        while(iterator.hasNext())
        {
            Cart cart = iterator.next();
            System.out.println("Cart Details >>>>>>>>>>>>>>>>>>>>>>");
            System.out.println(cart.getName()+"-"+cart.getTotal());

            Set<Items>set = cart.getItems();
            Iterator<Items>iterator1 = set.iterator();
            while(iterator1.hasNext())
            {
                Items items = iterator1.next();
                System.out.println("Items Details>>>>>>>>>>>>>>>>>>>>>");
                System.out.println(items.getItemsName()+"-"+items.getIntemsCode()+"-"+items.getItemsPrice()+"-"+items.getItemsQuntity());
            }
        }
        session.close();
        System.out.println("Data Fetched Successfully Done!");
    }

}
