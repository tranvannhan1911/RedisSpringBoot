package ktpm.redis_spring_boot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Product")
@Getter
@Setter
public class Product implements Serializable{
    @Id
    @Column(name="ProId")
	private String proId;
    
    @Column(name="Name")
	private String name;
    
    @Column(name="Price")
	private float price;
    

    public Product() {
    	
    }
}
