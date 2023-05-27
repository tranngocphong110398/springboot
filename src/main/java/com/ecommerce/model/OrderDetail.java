package com.ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orderdetail")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderdetail_id")
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "order_id",referencedColumnName = "order_id")
    private Order order;

    @ManyToOne()
    @JoinColumn(name = "product_id",referencedColumnName = "product_id")
    private Product product;
}
