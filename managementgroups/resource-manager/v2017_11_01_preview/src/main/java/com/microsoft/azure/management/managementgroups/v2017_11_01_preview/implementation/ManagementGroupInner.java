/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.v2017_11_01_preview.implementation;

import com.microsoft.azure.management.managementgroups.v2017_11_01_preview.ManagementGroupDetails;
import java.util.List;
import com.microsoft.azure.management.managementgroups.v2017_11_01_preview.ManagementGroupChildInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The management group details.
 */
@JsonFlatten
public class ManagementGroupInner extends ProxyResource {
    /**
     * The AAD Tenant ID associated with the management group. For example,
     * 00000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "properties.tenantId")
    private String tenantId;

    /**
     * The friendly name of the management group.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * Details.
     */
    @JsonProperty(value = "properties.details")
    private ManagementGroupDetails details;

    /**
     * The list of children.
     */
    @JsonProperty(value = "properties.children")
    private List<ManagementGroupChildInfo> children;

    /**
     * Get the AAD Tenant ID associated with the management group. For example, 00000000-0000-0000-0000-000000000000.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the AAD Tenant ID associated with the management group. For example, 00000000-0000-0000-0000-000000000000.
     *
     * @param tenantId the tenantId value to set
     * @return the ManagementGroupInner object itself.
     */
    public ManagementGroupInner withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the friendly name of the management group.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the friendly name of the management group.
     *
     * @param displayName the displayName value to set
     * @return the ManagementGroupInner object itself.
     */
    public ManagementGroupInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the details value.
     *
     * @return the details value
     */
    public ManagementGroupDetails details() {
        return this.details;
    }

    /**
     * Set the details value.
     *
     * @param details the details value to set
     * @return the ManagementGroupInner object itself.
     */
    public ManagementGroupInner withDetails(ManagementGroupDetails details) {
        this.details = details;
        return this;
    }

    /**
     * Get the list of children.
     *
     * @return the children value
     */
    public List<ManagementGroupChildInfo> children() {
        return this.children;
    }

    /**
     * Set the list of children.
     *
     * @param children the children value to set
     * @return the ManagementGroupInner object itself.
     */
    public ManagementGroupInner withChildren(List<ManagementGroupChildInfo> children) {
        this.children = children;
        return this;
    }

}
