package com.event;

import com.enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreatePaymentEvent {

    private Long orderId;

    private Long paymentId;

    private PaymentStatus status;
}
