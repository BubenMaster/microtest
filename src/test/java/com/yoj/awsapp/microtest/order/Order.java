package com.yoj.awsapp.microtest.order;


import com.sun.xml.bind.v2.TODO;
import lombok.experimental.FieldNameConstants;
import org.apache.tomcat.jni.Address;
import org.hibernate.annotations.UpdateTimestamp;
import org.junit.jupiter.api.Test;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;


import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.Set;


@Entity
@Table(name = "orders")
public class Order {

    private  static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @NotBlank
    @Column(name = "customer_id")
    private String customerId;



    @CreatedDate
    @Column(name = "created_at")
    private Instant createdAt;


    @UpdateTimestamp
    @Column(name = "updated_at")
    private Instant updatedAt;

    @Version
    public Integer version;

    @Column(name = "status")
    private OrderStatus status = OrderStatus.CREATED;

    @Column(name = "payment_status")
    private Boolean paymentStatus = false;

    @NotNull
    @Column(name = "payment_type")
    private PaymentType paymentMethod;

    @NotNull
    @Column(name = "payment_details")
    private String paymentDetails;


    @Column(name = "shipping_adress")
    private String shippingAddress;
    // TODO: 19.09.2022 expand to new class PhysicalAddress

    @Column(name = "products")
    private String products;
    // TODO: 19.09.2022 expand to Set of class Products

}
