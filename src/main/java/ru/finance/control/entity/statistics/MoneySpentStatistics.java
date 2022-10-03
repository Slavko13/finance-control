package ru.finance.control.entity.statistics;


import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.finance.control.entity.users.FinanceUser;

import javax.persistence.*;

@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_money_spent_statistics")
public class MoneySpentStatistics
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

    @Column(name = "full_money_spent")
    Double fullMoneySpent;

    @Column(name = "daily_money_spent")
    Double dailyMoneySpent;

    @Column(name = "weekly_money_spent")
    Double weeklyMoneySpent;

    @Column(name = "monthly_money_spent")
    Double monthlyMoneySpent;

    @Column(name = "quarter_money_spent")
    Double quarterMoneySpent;

    @Column(name = "annual_money_spent")
    Double annualMoneySpent;

    @Column(name = "description")
    Double description;

}
