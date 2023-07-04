/**
 * Created By VijayKumar Moohite
 * Date : 7/4/2023
 * Time : 12:25 PM
 * Project : OneToManyRelationshipApplicationHB5
 **/

package org.mahagan.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;
//This is my Fifth OneToMany Mapping Relationship application in hibernate.
@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartId;
    private String name;
    private int total;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name ="cartId")
    @OrderColumn(name = "list")
    Set<Items>items = new HashSet<>();

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Set<Items> getItems() {
        return items;
    }

    public void setItems(Set<Items> items) {
        this.items = items;
    }
}
