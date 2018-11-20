/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmos-db.v2015_04_08.implementation;

import com.microsoft.azure.management.cosmos-db.v2015_04_08.DatabaseAccountKind;
import com.microsoft.azure.management.cosmos-db.v2015_04_08.DatabaseAccountOfferType;
import com.microsoft.azure.management.cosmos-db.v2015_04_08.ConsistencyPolicy;
import java.util.List;
import com.microsoft.azure.management.cosmos-db.v2015_04_08.Capability;
import com.microsoft.azure.management.cosmos-db.v2015_04_08.Location;
import com.microsoft.azure.management.cosmos-db.v2015_04_08.FailoverPolicy;
import com.microsoft.azure.management.cosmos-db.v2015_04_08.VirtualNetworkRule;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * An Azure Cosmos DB database account.
 */
@JsonFlatten
public class DatabaseAccountInner extends Resource {
    /**
     * Indicates the type of database account. This can only be set at database
     * account creation. Possible values include: 'GlobalDocumentDB',
     * 'MongoDB', 'Parse'.
     */
    @JsonProperty(value = "kind")
    private DatabaseAccountKind kind;

    /**
     * The provisioningState property.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * The connection endpoint for the Cosmos DB database account.
     */
    @JsonProperty(value = "properties.documentEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String documentEndpoint;

    /**
     * The offer type for the Cosmos DB database account. Default value:
     * Standard. Possible values include: 'Standard'.
     */
    @JsonProperty(value = "properties.databaseAccountOfferType", access = JsonProperty.Access.WRITE_ONLY)
    private DatabaseAccountOfferType databaseAccountOfferType;

    /**
     * Cosmos DB Firewall Support: This value specifies the set of IP addresses
     * or IP address ranges in CIDR form to be included as the allowed list of
     * client IPs for a given database account. IP addresses/ranges must be
     * comma separated and must not contain any spaces.
     */
    @JsonProperty(value = "properties.ipRangeFilter")
    private String ipRangeFilter;

    /**
     * Flag to indicate whether to enable/disable Virtual Network ACL rules.
     */
    @JsonProperty(value = "properties.isVirtualNetworkFilterEnabled")
    private Boolean isVirtualNetworkFilterEnabled;

    /**
     * Enables automatic failover of the write region in the rare event that
     * the region is unavailable due to an outage. Automatic failover will
     * result in a new write region for the account and is chosen based on the
     * failover priorities configured for the account.
     */
    @JsonProperty(value = "properties.enableAutomaticFailover")
    private Boolean enableAutomaticFailover;

    /**
     * The consistency policy for the Cosmos DB database account.
     */
    @JsonProperty(value = "properties.consistencyPolicy")
    private ConsistencyPolicy consistencyPolicy;

    /**
     * List of Cosmos DB capabilities for the account.
     */
    @JsonProperty(value = "properties.capabilities")
    private List<Capability> capabilities;

    /**
     * An array that contains the write location for the Cosmos DB account.
     */
    @JsonProperty(value = "properties.writeLocations", access = JsonProperty.Access.WRITE_ONLY)
    private List<Location> writeLocations;

    /**
     * An array that contains of the read locations enabled for the Cosmos DB
     * account.
     */
    @JsonProperty(value = "properties.readLocations", access = JsonProperty.Access.WRITE_ONLY)
    private List<Location> readLocations;

    /**
     * An array that contains the regions ordered by their failover priorities.
     */
    @JsonProperty(value = "properties.failoverPolicies", access = JsonProperty.Access.WRITE_ONLY)
    private List<FailoverPolicy> failoverPolicies;

    /**
     * List of Virtual Network ACL rules configured for the Cosmos DB account.
     */
    @JsonProperty(value = "properties.virtualNetworkRules")
    private List<VirtualNetworkRule> virtualNetworkRules;

    /**
     * Get indicates the type of database account. This can only be set at database account creation. Possible values include: 'GlobalDocumentDB', 'MongoDB', 'Parse'.
     *
     * @return the kind value
     */
    public DatabaseAccountKind kind() {
        return this.kind;
    }

    /**
     * Set indicates the type of database account. This can only be set at database account creation. Possible values include: 'GlobalDocumentDB', 'MongoDB', 'Parse'.
     *
     * @param kind the kind value to set
     * @return the DatabaseAccountInner object itself.
     */
    public DatabaseAccountInner withKind(DatabaseAccountKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     * @return the DatabaseAccountInner object itself.
     */
    public DatabaseAccountInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the connection endpoint for the Cosmos DB database account.
     *
     * @return the documentEndpoint value
     */
    public String documentEndpoint() {
        return this.documentEndpoint;
    }

    /**
     * Get the offer type for the Cosmos DB database account. Default value: Standard. Possible values include: 'Standard'.
     *
     * @return the databaseAccountOfferType value
     */
    public DatabaseAccountOfferType databaseAccountOfferType() {
        return this.databaseAccountOfferType;
    }

    /**
     * Get cosmos DB Firewall Support: This value specifies the set of IP addresses or IP address ranges in CIDR form to be included as the allowed list of client IPs for a given database account. IP addresses/ranges must be comma separated and must not contain any spaces.
     *
     * @return the ipRangeFilter value
     */
    public String ipRangeFilter() {
        return this.ipRangeFilter;
    }

    /**
     * Set cosmos DB Firewall Support: This value specifies the set of IP addresses or IP address ranges in CIDR form to be included as the allowed list of client IPs for a given database account. IP addresses/ranges must be comma separated and must not contain any spaces.
     *
     * @param ipRangeFilter the ipRangeFilter value to set
     * @return the DatabaseAccountInner object itself.
     */
    public DatabaseAccountInner withIpRangeFilter(String ipRangeFilter) {
        this.ipRangeFilter = ipRangeFilter;
        return this;
    }

    /**
     * Get flag to indicate whether to enable/disable Virtual Network ACL rules.
     *
     * @return the isVirtualNetworkFilterEnabled value
     */
    public Boolean isVirtualNetworkFilterEnabled() {
        return this.isVirtualNetworkFilterEnabled;
    }

    /**
     * Set flag to indicate whether to enable/disable Virtual Network ACL rules.
     *
     * @param isVirtualNetworkFilterEnabled the isVirtualNetworkFilterEnabled value to set
     * @return the DatabaseAccountInner object itself.
     */
    public DatabaseAccountInner withIsVirtualNetworkFilterEnabled(Boolean isVirtualNetworkFilterEnabled) {
        this.isVirtualNetworkFilterEnabled = isVirtualNetworkFilterEnabled;
        return this;
    }

    /**
     * Get enables automatic failover of the write region in the rare event that the region is unavailable due to an outage. Automatic failover will result in a new write region for the account and is chosen based on the failover priorities configured for the account.
     *
     * @return the enableAutomaticFailover value
     */
    public Boolean enableAutomaticFailover() {
        return this.enableAutomaticFailover;
    }

    /**
     * Set enables automatic failover of the write region in the rare event that the region is unavailable due to an outage. Automatic failover will result in a new write region for the account and is chosen based on the failover priorities configured for the account.
     *
     * @param enableAutomaticFailover the enableAutomaticFailover value to set
     * @return the DatabaseAccountInner object itself.
     */
    public DatabaseAccountInner withEnableAutomaticFailover(Boolean enableAutomaticFailover) {
        this.enableAutomaticFailover = enableAutomaticFailover;
        return this;
    }

    /**
     * Get the consistency policy for the Cosmos DB database account.
     *
     * @return the consistencyPolicy value
     */
    public ConsistencyPolicy consistencyPolicy() {
        return this.consistencyPolicy;
    }

    /**
     * Set the consistency policy for the Cosmos DB database account.
     *
     * @param consistencyPolicy the consistencyPolicy value to set
     * @return the DatabaseAccountInner object itself.
     */
    public DatabaseAccountInner withConsistencyPolicy(ConsistencyPolicy consistencyPolicy) {
        this.consistencyPolicy = consistencyPolicy;
        return this;
    }

    /**
     * Get list of Cosmos DB capabilities for the account.
     *
     * @return the capabilities value
     */
    public List<Capability> capabilities() {
        return this.capabilities;
    }

    /**
     * Set list of Cosmos DB capabilities for the account.
     *
     * @param capabilities the capabilities value to set
     * @return the DatabaseAccountInner object itself.
     */
    public DatabaseAccountInner withCapabilities(List<Capability> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Get an array that contains the write location for the Cosmos DB account.
     *
     * @return the writeLocations value
     */
    public List<Location> writeLocations() {
        return this.writeLocations;
    }

    /**
     * Get an array that contains of the read locations enabled for the Cosmos DB account.
     *
     * @return the readLocations value
     */
    public List<Location> readLocations() {
        return this.readLocations;
    }

    /**
     * Get an array that contains the regions ordered by their failover priorities.
     *
     * @return the failoverPolicies value
     */
    public List<FailoverPolicy> failoverPolicies() {
        return this.failoverPolicies;
    }

    /**
     * Get list of Virtual Network ACL rules configured for the Cosmos DB account.
     *
     * @return the virtualNetworkRules value
     */
    public List<VirtualNetworkRule> virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * Set list of Virtual Network ACL rules configured for the Cosmos DB account.
     *
     * @param virtualNetworkRules the virtualNetworkRules value to set
     * @return the DatabaseAccountInner object itself.
     */
    public DatabaseAccountInner withVirtualNetworkRules(List<VirtualNetworkRule> virtualNetworkRules) {
        this.virtualNetworkRules = virtualNetworkRules;
        return this;
    }

}