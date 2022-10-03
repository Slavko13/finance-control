package ru.finance.control.entity.money;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import ru.finance.control.entity.general.base.BaseEntity;
import ru.finance.control.entity.users.FinanceUser;
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

    @NonNull
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    FinanceUser user;

    @Column(name = "user_id", updatable = false, insertable = false)
    Long userId;

    @Column(name = "money_spent")
    Double moneySpent;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_of_spending")
    MoneyWasteType moneyWasteType;

    @Column(name = "description")
    String description;

}
