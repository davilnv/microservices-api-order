package br.com.texsistemas.order.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_orders")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orderNumber;
    private String skuCode;
    private Double price;
    private Integer quantity;
}
