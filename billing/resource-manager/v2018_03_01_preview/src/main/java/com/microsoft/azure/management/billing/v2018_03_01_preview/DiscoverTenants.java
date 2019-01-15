/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_03_01_preview;

import rx.Observable;
import com.microsoft.azure.management.billing.v2018_03_01_preview.implementation.DiscoverTenantsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing DiscoverTenants.
 */
public interface DiscoverTenants extends HasInner<DiscoverTenantsInner> {
    /**
     * Gets a Tenant Properties.
     *
     * @param billingProfileId Billing Profile Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DiscoverTenant> getAsync(String billingProfileId);

}
