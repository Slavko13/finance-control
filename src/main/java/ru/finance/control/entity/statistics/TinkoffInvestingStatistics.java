package ru.finance.control.entity.statistics;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ru.finance.control.entity.general.base.BaseEntity;
import ru.finance.control.entity.general.base.BaseStatisticSavingEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "user_tinkoff_investing_statistics")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class TinkoffInvestingStatistics extends BaseStatisticSavingEntity
{

    @Column(name = "description")
    Double description;

}
