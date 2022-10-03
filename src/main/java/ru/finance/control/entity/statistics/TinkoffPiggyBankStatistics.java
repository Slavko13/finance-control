package ru.finance.control.entity.statistics;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import ru.finance.control.entity.general.base.BaseStatisticSavingEntity;
import ru.finance.control.entity.users.FinanceUser;

import javax.persistence.*;


/**
 * Class for control tinkoff piggy bank stats.
 *
 * @author Petrenko Viacheslav
 */


@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_invest_piggy_bank_statistics")
@Entity
public class TinkoffPiggyBankStatistics extends BaseStatisticSavingEntity
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
