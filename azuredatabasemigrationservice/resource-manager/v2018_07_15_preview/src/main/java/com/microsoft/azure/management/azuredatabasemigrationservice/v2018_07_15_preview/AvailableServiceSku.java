/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.implementation.AvailableServiceSkuInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.implementation.DataMigrationManager;

/**
 * Type representing AvailableServiceSku.
 */
public interface AvailableServiceSku extends HasInner<AvailableServiceSkuInner>, HasManager<DataMigrationManager> {
    /**
     * @return the capacity value.
     */
    AvailableServiceSkuCapacity capacity();

    /**
     * @return the resourceType value.
     */
    String resourceType();

    /**
     * @return the sku value.
     */
    AvailableServiceSkuSku sku();

}
