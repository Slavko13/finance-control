package ru.finance.control.entity.money;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ru.finance.control.entity.general.base.BaseEntity;
import ru.finance.control.enums.money.MoneyWasteType;

import javax.persistence.*;

/**
 * Class for control ur money waste per day.
 *
 * @author Petrenko Viacheslav
 */


@Table(name = "money_waste")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class MoneyWaste extends BaseEntity
{
    @Column(name = "money_spent")
    Double moneySpent;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_of_spending")
    MoneyWasteType moneyWasteType;

    @Column(name = "description")
    String description;

}
