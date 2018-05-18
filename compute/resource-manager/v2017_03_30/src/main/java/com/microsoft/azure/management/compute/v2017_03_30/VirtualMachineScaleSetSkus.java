/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30;

import rx.Observable;
import com.microsoft.azure.management.compute.v2017_03_30.implementation.VirtualMachineScaleSetsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing VirtualMachineScaleSetSkus.
 */
public interface VirtualMachineScaleSetSkus extends HasInner<VirtualMachineScaleSetsInner> {

    /**
     * Gets a list of SKUs available for your VM scale set, including the minimum and maximum VM instances allowed for each SKU.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachineScaleSetSku> listByVirtualMachineScaleSetAsync(final String resourceGroupName, final String vmScaleSetName);
}