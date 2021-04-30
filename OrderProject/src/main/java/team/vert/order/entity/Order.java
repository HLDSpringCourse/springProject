package team.vert.order.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CustomerOrder")
@NoArgsConstructor
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private String city;

    @Column
    private Integer lattitude;

    @Column
    private Integer longitude;

    @ManyToOne
    private Customer customer;
}