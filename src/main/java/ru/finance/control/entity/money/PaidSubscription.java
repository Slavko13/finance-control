package ru.finance.control.entity.money;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ru.finance.control.entity.general.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
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
    @Column(name = "payment_interval")
    String paymentInterval;

    @Column(name = "payment_date")
    LocalDate paymentDate;

    @Column(name = "subscription_cost")
    Double subscriptionCost;

    @Column(name = "description")
    String description;

}
