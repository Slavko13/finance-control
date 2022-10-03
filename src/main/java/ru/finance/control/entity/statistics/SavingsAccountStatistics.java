package ru.finance.control.entity.statistics;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.finance.control.entity.users.FinanceUser;

import javax.persistence.*;


/**
 * Class for control saving accounts stats.
 *
 * @author Petrenko Viacheslav
 */

@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
@Table(name = "user_savings_account_statistics")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class SavingsAccountStatistics
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
