package ru.finance.control.entity.general.base;

import javax.persistence.Column;

public class BaseStatisticSavingEntity extends BaseEntity
{

    @Column(name = "current_money")
    Double currentMoney;

    @Column(name = "daily_difference")
    Double dailyDifference;

    @Column(name = "weekly_difference")
    Double weeklyDifference;

    @Column(name = "monthly_difference")
    Double monthlyDifference;

    @Column(name = "quarter_difference")
    Double quarterDifference;

    @Column(name = "annual_difference")
    Double annualDifference;

}
