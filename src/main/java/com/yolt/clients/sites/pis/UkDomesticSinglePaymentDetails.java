package com.yolt.clients.sites.pis;

import lombok.NonNull;
import lombok.Value;
import org.springframework.lang.Nullable;

@Value
public class UkDomesticSinglePaymentDetails {
    boolean supported;
    @NonNull PaymentType type;
    boolean requiresSubmitStep;
    @Nullable
    DynamicFields dynamicFields;
}