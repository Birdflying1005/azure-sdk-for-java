/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.streamanalytics.v2016_03_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.streamanalytics.v2016_03_01.Locations;
import com.microsoft.azure.management.streamanalytics.v2016_03_01.Quotas;

class LocationsImpl extends WrapperImpl<SubscriptionsInner> implements Locations {
    private final StreamAnalyticsManager manager;

    LocationsImpl(StreamAnalyticsManager manager) {
        super(manager.inner().subscriptions());
        this.manager = manager;
    }

    @Override
    public Quotas quotas() {
        Quotas accessor = this.manager().quotas();
        return accessor;
    }

    public StreamAnalyticsManager manager() {
        return this.manager;
    }

}