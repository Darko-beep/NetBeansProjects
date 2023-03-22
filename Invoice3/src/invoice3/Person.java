/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice3;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.TableColumn;

/**
 *
 * @author EMMANUEL VAN OWUSU
 */
public class Person {
    private SimpleStringProperty item_name,product_id,quantity,unit_price;
    

    public Person(String item_name, String product_id, String quantity, String unit_price) {
        this.item_name = new SimpleStringProperty(item_name);
        this.product_id = new SimpleStringProperty(product_id) ;
        this.quantity = new SimpleStringProperty(quantity);
        this.unit_price = new SimpleStringProperty(unit_price);
        
    }

    Person(TableColumn<Person, String> item_name, TableColumn<Person, String> product_id, TableColumn<Person, String> quantity, TableColumn<Person, String> unit_price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getItem_name() {
        return item_name.get();
    }

    public void setItem_name(SimpleStringProperty item_name) {
        this.item_name = item_name;
    }

    public String getProduct_id() {
        return product_id.get();
    }

    public void setProduct_id(SimpleStringProperty product_id) {
        this.product_id = product_id;
    }

    public String getQuantity() {
        return quantity.get();
    }

    public void setQuantity(SimpleStringProperty quantity) {
        this.quantity = quantity;
    }

    public String getUnit_price() {
        return unit_price.get();
    }

    public void setUnit_price(SimpleStringProperty unit_price) {
        this.unit_price = unit_price;
    }

  
    
    
    
}
