package ru.finance.control.entity.properties;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import ru.finance.control.entity.general.base.BaseEntity;
import ru.finance.control.entity.users.FinanceUser;

import javax.persistence.*;

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

    @NonNull
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    FinanceUser user;

    @Column(name = "user_id", updatable = false, insertable = false)
    Long userId;


    @Column(name = "tinkoff_api_secret_key")
    String tinkoffApiSecretKey;

}
