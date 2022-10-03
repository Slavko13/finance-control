package ru.finance.control.entity.money;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import ru.finance.control.entity.general.base.BaseEntity;
import ru.finance.control.entity.users.FinanceUser;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Class for control ur money waste per day.
 *
 * @author Petrenko Viacheslav
 */

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_paid_subscription")
@Entity
public class PaidSubscription extends BaseEntity
{

    @NonNull
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    FinanceUser user;

    @Column(name = "user_id", updatable = false, insertable = false)
    Long userId;

    @Column(name = "payment_interval")
    String paymentInterval;

    @Column(name = "payment_date")
    LocalDate paymentDate;

    @Column(name = "subscription_cost")
    Double subscriptionCost;

    @Column(name = "description")
    String description;

}
