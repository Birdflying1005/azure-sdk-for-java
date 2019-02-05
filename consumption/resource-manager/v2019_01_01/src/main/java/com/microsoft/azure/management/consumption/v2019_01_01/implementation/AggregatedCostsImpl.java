/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.consumption.v2019_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.consumption.v2019_01_01.AggregatedCosts;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.consumption.v2019_01_01.ManagementGroupAggregatedCostResult;

class AggregatedCostsImpl extends WrapperImpl<AggregatedCostsInner> implements AggregatedCosts {
    private final ConsumptionManager manager;

    AggregatedCostsImpl(ConsumptionManager manager) {
        super(manager.inner().aggregatedCosts());
        this.manager = manager;
    }

    public ConsumptionManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ManagementGroupAggregatedCostResult> getByManagementGroupAsync(String managementGroupId) {
        AggregatedCostsInner client = this.inner();
        return client.getByManagementGroupAsync(managementGroupId)
        .map(new Func1<ManagementGroupAggregatedCostResultInner, ManagementGroupAggregatedCostResult>() {
            @Override
            public ManagementGroupAggregatedCostResult call(ManagementGroupAggregatedCostResultInner inner) {
                return new ManagementGroupAggregatedCostResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ManagementGroupAggregatedCostResult> getForBillingPeriodByManagementGroupAsync(String managementGroupId, String billingPeriodName) {
        AggregatedCostsInner client = this.inner();
        return client.getForBillingPeriodByManagementGroupAsync(managementGroupId, billingPeriodName)
        .map(new Func1<ManagementGroupAggregatedCostResultInner, ManagementGroupAggregatedCostResult>() {
            @Override
            public ManagementGroupAggregatedCostResult call(ManagementGroupAggregatedCostResultInner inner) {
                return new ManagementGroupAggregatedCostResultImpl(inner, manager());
            }
        });
    }

}
