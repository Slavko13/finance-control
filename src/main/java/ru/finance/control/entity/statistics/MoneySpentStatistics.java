package ru.finance.control.entity.statistics;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ru.finance.control.entity.general.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_money_spent_statistics")
public class MoneySpentStatistics extends BaseEntity
{

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
