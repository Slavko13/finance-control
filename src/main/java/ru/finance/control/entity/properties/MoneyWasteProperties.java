package ru.finance.control.entity.properties;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import ru.finance.control.entity.general.base.BaseEntity;
import ru.finance.control.entity.users.FinanceUser;

import javax.persistence.*;

/**
 * Class for money waste properties.
 *
 * @author Petrenko Viacheslav
 */

@Table(name = "user_money_waste_properties")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class MoneyWasteProperties extends BaseEntity
{

    @NonNull
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    FinanceUser user;

    @Column(name = "user_id", updatable = false, insertable = false)
    Long userId;


    @Column(name = "rounding_up_the_payment")
    Integer roundingUpPayment;

}
