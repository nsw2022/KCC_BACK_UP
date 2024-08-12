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
public class Product {
    private String productId;
    private String productName;
    private int price;
    private String imagePath;
    private String description;
}
