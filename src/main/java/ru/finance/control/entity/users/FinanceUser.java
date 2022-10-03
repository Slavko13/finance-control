package ru.finance.control.entity.users;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

/**
 * Class for system users.
 *
 * @author Petrenko Viacheslav
 */


@Entity
@Table(name = "finance_user")
@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
public class FinanceUser
{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @Column(name = "firstname")
    String firstName;

    @Column(name = "lastname")
    String lastName;

    @Column(name = "login")
    String login;

    @Column(name = "password")
    String password;

}
