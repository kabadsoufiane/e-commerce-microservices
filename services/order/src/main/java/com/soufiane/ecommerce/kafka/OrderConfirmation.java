package com.soufiane.ecommerce.kafka;

import com.soufiane.ecommerce.customer.CustomerResponse;
import com.soufiane.ecommerce.order.PaymentMethod;
import com.soufiane.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
