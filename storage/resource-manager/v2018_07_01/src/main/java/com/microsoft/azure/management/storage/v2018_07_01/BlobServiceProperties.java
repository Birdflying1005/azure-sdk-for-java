/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.storage.v2018_07_01.implementation.BlobServicePropertiesInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.storage.v2018_07_01.implementation.StorageManager;

/**
 * Type representing BlobServiceProperties.
 */
public interface BlobServiceProperties extends HasInner<BlobServicePropertiesInner>, Indexable, Refreshable<BlobServiceProperties>, Updatable<BlobServiceProperties.Update>, HasManager<StorageManager> {
    /**
     * @return the cors value.
     */
    CorsRules cors();

    /**
     * @return the defaultServiceVersion value.
     */
    String defaultServiceVersion();

    /**
     * @return the deleteRetentionPolicy value.
     */
    DeleteRetentionPolicy deleteRetentionPolicy();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the BlobServiceProperties definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithStorageAccount, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of BlobServiceProperties definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a BlobServiceProperties definition.
         */
        interface Blank extends WithStorageAccount {
        }

        /**
         * The stage of the blobserviceproperties definition allowing to specify StorageAccount.
         */
        interface WithStorageAccount {
           /**
            * Specifies resourceGroupName, accountName.
            */
            WithCreate withExistingStorageAccount(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the blobserviceproperties definition allowing to specify Cors.
         */
        interface WithCors {
            /**
             * Specifies cors.
             */
            WithCreate withCors(CorsRules cors);
        }

        /**
         * The stage of the blobserviceproperties definition allowing to specify DefaultServiceVersion.
         */
        interface WithDefaultServiceVersion {
            /**
             * Specifies defaultServiceVersion.
             */
            WithCreate withDefaultServiceVersion(String defaultServiceVersion);
        }

        /**
         * The stage of the blobserviceproperties definition allowing to specify DeleteRetentionPolicy.
         */
        interface WithDeleteRetentionPolicy {
            /**
             * Specifies deleteRetentionPolicy.
             */
            WithCreate withDeleteRetentionPolicy(DeleteRetentionPolicy deleteRetentionPolicy);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<BlobServiceProperties>, DefinitionStages.WithCors, DefinitionStages.WithDefaultServiceVersion, DefinitionStages.WithDeleteRetentionPolicy {
        }
    }
    /**
     * The template for a BlobServiceProperties update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<BlobServiceProperties>, UpdateStages.WithCors, UpdateStages.WithDefaultServiceVersion, UpdateStages.WithDeleteRetentionPolicy {
    }

    /**
     * Grouping of BlobServiceProperties update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the blobserviceproperties update allowing to specify Cors.
         */
        interface WithCors {
            /**
             * Specifies cors.
             */
            Update withCors(CorsRules cors);
        }

        /**
         * The stage of the blobserviceproperties update allowing to specify DefaultServiceVersion.
         */
        interface WithDefaultServiceVersion {
            /**
             * Specifies defaultServiceVersion.
             */
            Update withDefaultServiceVersion(String defaultServiceVersion);
        }

        /**
         * The stage of the blobserviceproperties update allowing to specify DeleteRetentionPolicy.
         */
        interface WithDeleteRetentionPolicy {
            /**
             * Specifies deleteRetentionPolicy.
             */
            Update withDeleteRetentionPolicy(DeleteRetentionPolicy deleteRetentionPolicy);
        }

    }
}
