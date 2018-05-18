/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_02_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.storage.v2018_02_01.Usages;
import com.microsoft.azure.management.storage.v2018_02_01.Containers;
import com.microsoft.azure.management.storage.v2018_02_01.ImmutabilityPolicies;
import com.microsoft.azure.management.storage.v2018_02_01.Operations;
import com.microsoft.azure.management.storage.v2018_02_01.Locations;
import com.microsoft.azure.management.storage.v2018_02_01.BlobServices;
import com.microsoft.azure.management.storage.v2018_02_01.StorageAccountsOperations;
import com.microsoft.azure.management.storage.v2018_02_01.StorageAccounts;
import com.microsoft.azure.management.storage.v2018_02_01.Skus;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Storage resource management.
 */
public final class StorageManager extends ManagerCore<StorageManager, StorageManagementClientImpl> {
    private Usages usages;
    private Containers containers;
    private ImmutabilityPolicies immutabilityPolicies;
    private Operations operations;
    private Locations locations;
    private BlobServices blobServices;
    private StorageAccountsOperations storageAccountsOperations;
    private StorageAccounts storageAccounts;
    private Skus skus;
    /**
    * Get a Configurable instance that can be used to create StorageManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new StorageManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of StorageManager that exposes Storage resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the StorageManager
    */
    public static StorageManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new StorageManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of StorageManager that exposes Storage resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the StorageManager
    */
    public static StorageManager authenticate(RestClient restClient, String subscriptionId) {
        return new StorageManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of StorageManager that exposes Storage management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Storage management API entry points that work across subscriptions
        */
        StorageManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Usages.
     */
    public Usages usages() {
        if (this.usages == null) {
            this.usages = new UsagesImpl(this);
        }
        return this.usages;
    }

    /**
     * @return Entry point to manage Containers.
     */
    public Containers containers() {
        if (this.containers == null) {
            this.containers = new ContainersImpl(this);
        }
        return this.containers;
    }

    /**
     * @return Entry point to manage ImmutabilityPolicies.
     */
    public ImmutabilityPolicies immutabilityPolicies() {
        if (this.immutabilityPolicies == null) {
            this.immutabilityPolicies = new ImmutabilityPoliciesImpl(this);
        }
        return this.immutabilityPolicies;
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
     * @return Entry point to manage Locations.
     */
    public Locations locations() {
        if (this.locations == null) {
            this.locations = new LocationsImpl(this);
        }
        return this.locations;
    }

    /**
     * @return Entry point to manage BlobServices.
     */
    public BlobServices blobServices() {
        if (this.blobServices == null) {
            this.blobServices = new BlobServicesImpl(this);
        }
        return this.blobServices;
    }

    /**
     * @return Entry point to manage StorageAccountsOperations.
     */
    public StorageAccountsOperations storageAccountsOperations() {
        if (this.storageAccountsOperations == null) {
            this.storageAccountsOperations = new StorageAccountsOperationsImpl(this);
        }
        return this.storageAccountsOperations;
    }

    /**
     * @return Entry point to manage StorageAccounts.
     */
    public StorageAccounts storageAccounts() {
        if (this.storageAccounts == null) {
            this.storageAccounts = new StorageAccountsImpl(this);
        }
        return this.storageAccounts;
    }

    /**
     * @return Entry point to manage Skus.
     */
    public Skus skus() {
        if (this.skus == null) {
            this.skus = new SkusImpl(this);
        }
        return this.skus;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public StorageManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return StorageManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private StorageManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new StorageManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}