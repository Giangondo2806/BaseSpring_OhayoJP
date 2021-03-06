package com.ohayojp.product;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ohayojp.base.sql.BaseEntity;


/**
 * 
 * created at 2021/04/21
 * @author GiangTB
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")
public class Product extends BaseEntity {
    private String name;
    private int quantity;
    private double price;
	@Override
	public String toString() {
		return "Product [name=" + name + ", quantity=" + quantity + ", price=" + price + ", id=" + id + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + ", deletedAt=" + deletedAt + "]";
	}
    
    


	

	
	
	

	

}
