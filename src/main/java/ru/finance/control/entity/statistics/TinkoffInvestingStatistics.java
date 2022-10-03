package ru.finance.control.entity.statistics;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import ru.finance.control.entity.general.base.BaseEntity;
import ru.finance.control.entity.general.base.BaseStatisticSavingEntity;
import ru.finance.control.entity.users.FinanceUser;

import javax.persistence.*;

/**
 * Class for control invest account stats.
 *
 * @author Petrenko Viacheslav
 */


@Table(name = "user_tinkoff_investing_statistics")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class TinkoffInvestingStatistics extends BaseStatisticSavingEntity
{

    @NonNull
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    FinanceUser user;

    @Column(name = "user_id", updatable = false, insertable = false)
    Long userId;


    @Column(name = "description")
    Double description;

}
