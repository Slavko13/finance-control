package ru.finance.control.entity.statistics;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ru.finance.control.entity.general.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * Class for control saving accounts stats.
 *
 * @author Petrenko Viacheslav
 */

@Table(name = "user_savings_account_statistics")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class SavingsAccountStatistics extends BaseEntity
{

    @Column(name = "full_money_saved")
    Double fullMoneySaved;

    @Column(name = "daily_money_saved")
    Double dailyMoneySaved;

    @Column(name = "weekly_money_saved")
    Double weeklyMoneySaved;

    @Column(name = "monthly_money_saved")
    Double monthlyMoneySaved;

    @Column(name = "quarter_money_saved")
    Double quarterMoneySaved;

    @Column(name = "annual_money_saved")
    Double annualMoneySaved;

    @Column(name = "description")
    Double description;


}
