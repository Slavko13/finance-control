package ru.finance.control.entity.money;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.finance.control.entity.users.FinanceUser;
import ru.finance.control.enums.money.MoneyWasteType;

import javax.persistence.*;

/**
 * Class for control ur money waste per day.
 *
 * @author Petrenko Viacheslav
 */



@Data
@Table(name = "money_waste")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class MoneyWaste
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

    @Column(name = "money_spent")
    Double moneySpent;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_of_spending")
    MoneyWasteType moneyWasteType;

    @Column(name = "description")
    String description;

}
