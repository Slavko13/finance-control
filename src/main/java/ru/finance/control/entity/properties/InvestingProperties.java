package ru.finance.control.entity.properties;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ru.finance.control.entity.general.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Class for investing accounts properties.
 *
 * @author Petrenko Viacheslav
 */


@Table(name = "user_investing_properties")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class InvestingProperties extends BaseEntity
{

    @Column(name = "tinkoff_api_secret_key")
    String tinkoffApiSecretKey;

}
