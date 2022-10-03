package ru.finance.control.entity.properties;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.finance.control.entity.users.FinanceUser;

import javax.persistence.*;

/**
 * Class for investing accounts properties.
 *
 * @author Petrenko Viacheslav
 */


@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
@Table(name = "user_investing_properties")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class InvestingProperties
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


    @Column(name = "tinkoff_api_secret_key")
    String tinkoffApiSecretKey;

}
