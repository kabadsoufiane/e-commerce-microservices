package com.soufiane.ecommerce.payment;

import com.soufiane.ecommerce.customer.CustomerResponse;
import com.soufiane.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
