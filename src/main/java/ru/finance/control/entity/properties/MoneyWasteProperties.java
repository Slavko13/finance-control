package ru.finance.control.entity.properties;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ru.finance.control.entity.general.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user_money_waste_properties")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class MoneyWasteProperties extends BaseEntity
{


    @Column(name = "rounding_up_the_payment")
    Integer roundingUpPayment;

}
