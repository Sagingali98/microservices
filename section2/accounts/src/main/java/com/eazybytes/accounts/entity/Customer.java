package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Entity @AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class Customer extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name="customer_id")
    private Long customerId;

    @Size(max = 30, min = 5, message = "the length should be not more than 30 and not less than 5.")
    private String name;
    private String email;

    @Column(name = "mobile_number")
    public String mobileNumber;
}
