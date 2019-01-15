/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_03_01_preview.implementation;

import com.microsoft.azure.management.billing.v2018_03_01_preview.DiscoverTenant;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class DiscoverTenantImpl extends WrapperImpl<DiscoverTenantInner> implements DiscoverTenant {
    private final BillingManager manager;
    DiscoverTenantImpl(DiscoverTenantInner inner, BillingManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public String billingAccountId() {
        return this.inner().billingAccountId();
    }

    @Override
    public String billingProfileName() {
        return this.inner().billingProfileName();
    }

    @Override
    public String tenantId() {
        return this.inner().tenantId();
    }

}
