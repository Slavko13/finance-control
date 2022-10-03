package ru.finance.control.entity.users;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import ru.finance.control.entity.general.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

/**
 * Class for system users.
 *
 * @author Petrenko Viacheslav
 */


@Entity
@Table(name = "finance_user")
@AllArgsConstructor
@NoArgsConstructor
public class FinanceUser extends BaseEntity
{

    @Column(name = "firstname")
    String firstName;

    @Column(name = "lastname")
    String lastName;

    @Column(name = "login")
    String login;

    @Column(name = "password")
    String password;

}
