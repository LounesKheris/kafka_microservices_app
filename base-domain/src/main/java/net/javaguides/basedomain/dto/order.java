package net.javaguides.basedomain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class order {
    private String orderId;
    private String name;
    private int qty;
    private double Price;
}
