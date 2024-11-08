package com.bikash.ecommerceApi.Models;

import com.bikash.ecommerceApi.Domain.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDetails {


    private  String paymentId;
    private  String razorPayPaymentLinkId;
    private  String razorPayPaymentReferenceId;
    private  String razorPayPaymentLinkStatus;
    private  String razorPayPaymentIdZWSP;

    private PaymentStatus paymentStatus;





}
