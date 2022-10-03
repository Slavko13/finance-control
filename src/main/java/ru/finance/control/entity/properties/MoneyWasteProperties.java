package ru.finance.control.entity.properties;


import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.finance.control.entity.users.FinanceUser;

import javax.persistence.*;

/**
 * Class for money waste properties.
 *
 * @author Petrenko Viacheslav
 */

@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
@Table(name = "user_money_waste_properties")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class MoneyWasteProperties
{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    FinanceUser user;

    @Column(name = "user_id", updatable = false, insertable = false)
    Long userId;


    @Column(name = "rounding_up_the_payment")
    Integer roundingUpPayment;

}
