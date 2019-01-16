/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2016_05_15;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.devtestlab.v2016_05_15.implementation.DiskInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.devtestlab.v2016_05_15.implementation.DevTestLabManager;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * Type representing Disk.
 */
public interface Disk extends HasInner<DiskInner>, Indexable, Refreshable<Disk>, Updatable<Disk.Update>, HasManager<DevTestLabManager> {
    /**
     * @return the createdDate value.
     */
    DateTime createdDate();

    /**
     * @return the diskBlobName value.
     */
    String diskBlobName();

    /**
     * @return the diskSizeGiB value.
     */
    Integer diskSizeGiB();

    /**
     * @return the diskType value.
     */
    StorageType diskType();

    /**
     * @return the diskUri value.
     */
    String diskUri();

    /**
     * @return the hostCaching value.
     */
    String hostCaching();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the leasedByLabVmId value.
     */
    String leasedByLabVmId();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the managedDiskId value.
     */
    String managedDiskId();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the uniqueIdentifier value.
     */
    String uniqueIdentifier();

    /**
     * The entirety of the Disk definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithUser, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Disk definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Disk definition.
         */
        interface Blank extends WithUser {
        }

        /**
         * The stage of the disk definition allowing to specify User.
         */
        interface WithUser {
           /**
            * Specifies resourceGroupName, labName, userName.
            * @param resourceGroupName The name of the resource group
            * @param labName The name of the lab
            * @param userName The name of the user profile
            * @return the next definition stage
            */
            WithCreate withExistingUser(String resourceGroupName, String labName, String userName);
        }

        /**
         * The stage of the disk definition allowing to specify DiskBlobName.
         */
        interface WithDiskBlobName {
            /**
             * Specifies diskBlobName.
             * @param diskBlobName When backed by a blob, the name of the VHD blob without extension
             * @return the next definition stage
             */
            WithCreate withDiskBlobName(String diskBlobName);
        }

        /**
         * The stage of the disk definition allowing to specify DiskSizeGiB.
         */
        interface WithDiskSizeGiB {
            /**
             * Specifies diskSizeGiB.
             * @param diskSizeGiB The size of the disk in Gibibytes
             * @return the next definition stage
             */
            WithCreate withDiskSizeGiB(Integer diskSizeGiB);
        }

        /**
         * The stage of the disk definition allowing to specify DiskType.
         */
        interface WithDiskType {
            /**
             * Specifies diskType.
             * @param diskType The storage type for the disk (i.e. Standard, Premium). Possible values include: 'Standard', 'Premium'
             * @return the next definition stage
             */
            WithCreate withDiskType(StorageType diskType);
        }

        /**
         * The stage of the disk definition allowing to specify DiskUri.
         */
        interface WithDiskUri {
            /**
             * Specifies diskUri.
             * @param diskUri When backed by a blob, the URI of underlying blob
             * @return the next definition stage
             */
            WithCreate withDiskUri(String diskUri);
        }

        /**
         * The stage of the disk definition allowing to specify HostCaching.
         */
        interface WithHostCaching {
            /**
             * Specifies hostCaching.
             * @param hostCaching The host caching policy of the disk (i.e. None, ReadOnly, ReadWrite)
             * @return the next definition stage
             */
            WithCreate withHostCaching(String hostCaching);
        }

        /**
         * The stage of the disk definition allowing to specify LeasedByLabVmId.
         */
        interface WithLeasedByLabVmId {
            /**
             * Specifies leasedByLabVmId.
             * @param leasedByLabVmId The resource ID of the VM to which this disk is leased
             * @return the next definition stage
             */
            WithCreate withLeasedByLabVmId(String leasedByLabVmId);
        }

        /**
         * The stage of the disk definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The location of the resource
             * @return the next definition stage
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the disk definition allowing to specify ManagedDiskId.
         */
        interface WithManagedDiskId {
            /**
             * Specifies managedDiskId.
             * @param managedDiskId When backed by managed disk, this is the ID of the compute disk resource
             * @return the next definition stage
             */
            WithCreate withManagedDiskId(String managedDiskId);
        }

        /**
         * The stage of the disk definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning status of the resource
             * @return the next definition stage
             */
            WithCreate withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the disk definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags of the resource
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the disk definition allowing to specify UniqueIdentifier.
         */
        interface WithUniqueIdentifier {
            /**
             * Specifies uniqueIdentifier.
             * @param uniqueIdentifier The unique immutable identifier of a resource (Guid)
             * @return the next definition stage
             */
            WithCreate withUniqueIdentifier(String uniqueIdentifier);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Disk>, DefinitionStages.WithDiskBlobName, DefinitionStages.WithDiskSizeGiB, DefinitionStages.WithDiskType, DefinitionStages.WithDiskUri, DefinitionStages.WithHostCaching, DefinitionStages.WithLeasedByLabVmId, DefinitionStages.WithLocation, DefinitionStages.WithManagedDiskId, DefinitionStages.WithProvisioningState, DefinitionStages.WithTags, DefinitionStages.WithUniqueIdentifier {
        }
    }
    /**
     * The template for a Disk update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Disk>, UpdateStages.WithDiskBlobName, UpdateStages.WithDiskSizeGiB, UpdateStages.WithDiskType, UpdateStages.WithDiskUri, UpdateStages.WithHostCaching, UpdateStages.WithLeasedByLabVmId, UpdateStages.WithLocation, UpdateStages.WithManagedDiskId, UpdateStages.WithProvisioningState, UpdateStages.WithTags, UpdateStages.WithUniqueIdentifier {
    }

    /**
     * Grouping of Disk update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the disk update allowing to specify DiskBlobName.
         */
        interface WithDiskBlobName {
            /**
             * Specifies diskBlobName.
             * @param diskBlobName When backed by a blob, the name of the VHD blob without extension
             * @return the next update stage
             */
            Update withDiskBlobName(String diskBlobName);
        }

        /**
         * The stage of the disk update allowing to specify DiskSizeGiB.
         */
        interface WithDiskSizeGiB {
            /**
             * Specifies diskSizeGiB.
             * @param diskSizeGiB The size of the disk in Gibibytes
             * @return the next update stage
             */
            Update withDiskSizeGiB(Integer diskSizeGiB);
        }

        /**
         * The stage of the disk update allowing to specify DiskType.
         */
        interface WithDiskType {
            /**
             * Specifies diskType.
             * @param diskType The storage type for the disk (i.e. Standard, Premium). Possible values include: 'Standard', 'Premium'
             * @return the next update stage
             */
            Update withDiskType(StorageType diskType);
        }

        /**
         * The stage of the disk update allowing to specify DiskUri.
         */
        interface WithDiskUri {
            /**
             * Specifies diskUri.
             * @param diskUri When backed by a blob, the URI of underlying blob
             * @return the next update stage
             */
            Update withDiskUri(String diskUri);
        }

        /**
         * The stage of the disk update allowing to specify HostCaching.
         */
        interface WithHostCaching {
            /**
             * Specifies hostCaching.
             * @param hostCaching The host caching policy of the disk (i.e. None, ReadOnly, ReadWrite)
             * @return the next update stage
             */
            Update withHostCaching(String hostCaching);
        }

        /**
         * The stage of the disk update allowing to specify LeasedByLabVmId.
         */
        interface WithLeasedByLabVmId {
            /**
             * Specifies leasedByLabVmId.
             * @param leasedByLabVmId The resource ID of the VM to which this disk is leased
             * @return the next update stage
             */
            Update withLeasedByLabVmId(String leasedByLabVmId);
        }

        /**
         * The stage of the disk update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The location of the resource
             * @return the next update stage
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the disk update allowing to specify ManagedDiskId.
         */
        interface WithManagedDiskId {
            /**
             * Specifies managedDiskId.
             * @param managedDiskId When backed by managed disk, this is the ID of the compute disk resource
             * @return the next update stage
             */
            Update withManagedDiskId(String managedDiskId);
        }

        /**
         * The stage of the disk update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning status of the resource
             * @return the next update stage
             */
            Update withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the disk update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags of the resource
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the disk update allowing to specify UniqueIdentifier.
         */
        interface WithUniqueIdentifier {
            /**
             * Specifies uniqueIdentifier.
             * @param uniqueIdentifier The unique immutable identifier of a resource (Guid)
             * @return the next update stage
             */
            Update withUniqueIdentifier(String uniqueIdentifier);
        }

    }
}
