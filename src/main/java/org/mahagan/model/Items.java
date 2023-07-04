/**
 * Created By VijayKumar Moohite
 * Date : 7/4/2023
 * Time : 12:25 PM
 * Project : OneToManyRelationshipApplicationHB5
 **/

package org.mahagan.model;

import jakarta.persistence.*;

@Entity
@Table(name = "items")
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String itemsName;
    private String intemsCode;
    private int itemsPrice;
    private int itemsQuntity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemsName() {
        return itemsName;
    }

    public void setItemsName(String itemsName) {
        this.itemsName = itemsName;
    }

    public String getIntemsCode() {
        return intemsCode;
    }

    public void setIntemsCode(String intemsCode) {
        this.intemsCode = intemsCode;
    }

    public int getItemsPrice() {
        return itemsPrice;
    }

    public void setItemsPrice(int itemsPrice) {
        this.itemsPrice = itemsPrice;
    }

    public int getItemsQuntity() {
        return itemsQuntity;
    }

    public void setItemsQuntity(int itemsQuntity) {
        this.itemsQuntity = itemsQuntity;
    }
}
