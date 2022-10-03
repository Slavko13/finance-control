package ru.finance.control.entity.statistics;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import ru.finance.control.entity.general.base.BaseEntity;
import ru.finance.control.entity.users.FinanceUser;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_money_spent_statistics")
public class MoneySpentStatistics extends BaseEntity
{

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
