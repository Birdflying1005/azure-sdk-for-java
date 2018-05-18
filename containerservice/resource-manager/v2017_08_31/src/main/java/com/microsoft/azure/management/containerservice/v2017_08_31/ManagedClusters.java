/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2017_08_31;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.containerservice.v2017_08_31.implementation.ManagedClustersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ManagedClusters.
 */
public interface ManagedClusters extends SupportsCreating<ManagedCluster.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<ManagedCluster>, SupportsListingByResourceGroup<ManagedCluster>, SupportsListing<ManagedCluster>, HasInner<ManagedClustersInner> {

    /**
     * @return Entry point to manage ManagedCluster UpgradeProfile.
     */
    UpgradeProfiles upgradeProfiles();

    /**
     * @return Entry point to manage ManagedCluster AccessProfile.
     */
    AccessProfiles accessProfiles();
}