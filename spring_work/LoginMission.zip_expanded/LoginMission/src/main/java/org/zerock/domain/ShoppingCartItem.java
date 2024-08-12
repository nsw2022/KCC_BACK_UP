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
    private String productId;
    private String productName;
    private int quantity;
    private int price;
    private String imagePath;
    private Date createdAt;
}
