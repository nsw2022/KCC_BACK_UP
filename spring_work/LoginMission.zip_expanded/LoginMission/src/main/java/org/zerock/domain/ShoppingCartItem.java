package org.zerock.domain;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class ShoppingCartItem {
    private long cartId;       
    private String userId;    
    private String productId;  
    private String productName; 
    private int quantity;      
    private int price;          
    private Date createdAt;     
    private String imagePath; 
}
