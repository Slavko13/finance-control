package ru.finance.control.entity.statistics;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ru.finance.control.entity.general.base.BaseStatisticSavingEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


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

    @Column(name = "description")
    Double description;

}
