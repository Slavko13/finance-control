package ru.finance.control.entity.statistics;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.finance.control.entity.users.FinanceUser;

import javax.persistence.*;

/**
 * Class for control invest account stats.
 *
 * @author Petrenko Viacheslav
 */


@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
@Table(name = "user_tinkoff_investing_statistics")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class TinkoffInvestingStatistics
{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

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

    @NonNull
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    FinanceUser user;

    @Column(name = "user_id", updatable = false, insertable = false)
    Long userId;


    @Column(name = "description")
    Double description;

}
