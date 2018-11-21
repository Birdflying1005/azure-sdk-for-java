/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox.implementation;

import com.microsoft.azure.management.databox.SkuInformation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.databox.SkuCapacity;
import com.microsoft.azure.management.databox.SkuCost;
import com.microsoft.azure.management.databox.DestinationToServiceLocationMap;
import com.microsoft.azure.management.databox.SkuDisabledReason;
import com.microsoft.azure.management.databox.Sku;

class SkuInformationImpl extends WrapperImpl<SkuInformationInner> implements SkuInformation {
    private final DataBoxManager manager;
    SkuInformationImpl(SkuInformationInner inner, DataBoxManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DataBoxManager manager() {
        return this.manager;
    }

    @Override
    public List<String> apiVersions() {
        return this.inner().apiVersions();
    }

    @Override
    public SkuCapacity capacity() {
        return this.inner().capacity();
    }

    @Override
    public List<SkuCost> costs() {
        return this.inner().costs();
    }

    @Override
    public List<DestinationToServiceLocationMap> destinationToServiceLocationMap() {
        return this.inner().destinationToServiceLocationMap();
    }

    @Override
    public SkuDisabledReason disabledReason() {
        return this.inner().disabledReason();
    }

    @Override
    public String disabledReasonMessage() {
        return this.inner().disabledReasonMessage();
    }

    @Override
    public Boolean enabled() {
        return this.inner().enabled();
    }

    @Override
    public String requiredFeature() {
        return this.inner().requiredFeature();
    }

    @Override
    public Sku sku() {
        return this.inner().sku();
    }

}