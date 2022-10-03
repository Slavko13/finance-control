package ru.finance.control.entity.statistics;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ru.finance.control.entity.general.base.BaseStatisticSavingEntity;

import javax.persistence.Column;

@AllArgsConstructor
@NoArgsConstructor
public class TinkoffPiggyBankStatistics extends BaseStatisticSavingEntity
{

    @Column(name = "description")
    Double description;

}
