/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The parameters used when creating a server endpoint.
 */
@JsonFlatten
public class ServerEndpointCreateParameters extends ProxyResource {
    /**
     * Server Local path.
     */
    @JsonProperty(value = "properties.serverLocalPath")
    private String serverLocalPath;

    /**
     * Cloud Tiering. Possible values include: 'on', 'off'.
     */
    @JsonProperty(value = "properties.cloudTiering")
    private String cloudTiering;

    /**
     * Level of free space to be maintained by Cloud Tiering if it is enabled.
     */
    @JsonProperty(value = "properties.volumeFreeSpacePercent")
    private Integer volumeFreeSpacePercent;

    /**
     * Tier files older than days.
     */
    @JsonProperty(value = "properties.tierFilesOlderThanDays")
    private Integer tierFilesOlderThanDays;

    /**
     * Friendly Name.
     */
    @JsonProperty(value = "properties.friendlyName")
    private String friendlyName;

    /**
     * Server Resource Id.
     */
    @JsonProperty(value = "properties.serverResourceId")
    private String serverResourceId;

    /**
     * Offline data transfer. Possible values include: 'on', 'off'.
     */
    @JsonProperty(value = "properties.offlineDataTransfer")
    private String offlineDataTransfer;

    /**
     * Offline data transfer share name.
     */
    @JsonProperty(value = "properties.offlineDataTransferShareName")
    private String offlineDataTransferShareName;

    /**
     * Get server Local path.
     *
     * @return the serverLocalPath value
     */
    public String serverLocalPath() {
        return this.serverLocalPath;
    }

    /**
     * Set server Local path.
     *
     * @param serverLocalPath the serverLocalPath value to set
     * @return the ServerEndpointCreateParameters object itself.
     */
    public ServerEndpointCreateParameters withServerLocalPath(String serverLocalPath) {
        this.serverLocalPath = serverLocalPath;
        return this;
    }

    /**
     * Get cloud Tiering. Possible values include: 'on', 'off'.
     *
     * @return the cloudTiering value
     */
    public String cloudTiering() {
        return this.cloudTiering;
    }

    /**
     * Set cloud Tiering. Possible values include: 'on', 'off'.
     *
     * @param cloudTiering the cloudTiering value to set
     * @return the ServerEndpointCreateParameters object itself.
     */
    public ServerEndpointCreateParameters withCloudTiering(String cloudTiering) {
        this.cloudTiering = cloudTiering;
        return this;
    }

    /**
     * Get level of free space to be maintained by Cloud Tiering if it is enabled.
     *
     * @return the volumeFreeSpacePercent value
     */
    public Integer volumeFreeSpacePercent() {
        return this.volumeFreeSpacePercent;
    }

    /**
     * Set level of free space to be maintained by Cloud Tiering if it is enabled.
     *
     * @param volumeFreeSpacePercent the volumeFreeSpacePercent value to set
     * @return the ServerEndpointCreateParameters object itself.
     */
    public ServerEndpointCreateParameters withVolumeFreeSpacePercent(Integer volumeFreeSpacePercent) {
        this.volumeFreeSpacePercent = volumeFreeSpacePercent;
        return this;
    }

    /**
     * Get tier files older than days.
     *
     * @return the tierFilesOlderThanDays value
     */
    public Integer tierFilesOlderThanDays() {
        return this.tierFilesOlderThanDays;
    }

    /**
     * Set tier files older than days.
     *
     * @param tierFilesOlderThanDays the tierFilesOlderThanDays value to set
     * @return the ServerEndpointCreateParameters object itself.
     */
    public ServerEndpointCreateParameters withTierFilesOlderThanDays(Integer tierFilesOlderThanDays) {
        this.tierFilesOlderThanDays = tierFilesOlderThanDays;
        return this;
    }

    /**
     * Get friendly Name.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set friendly Name.
     *
     * @param friendlyName the friendlyName value to set
     * @return the ServerEndpointCreateParameters object itself.
     */
    public ServerEndpointCreateParameters withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get server Resource Id.
     *
     * @return the serverResourceId value
     */
    public String serverResourceId() {
        return this.serverResourceId;
    }

    /**
     * Set server Resource Id.
     *
     * @param serverResourceId the serverResourceId value to set
     * @return the ServerEndpointCreateParameters object itself.
     */
    public ServerEndpointCreateParameters withServerResourceId(String serverResourceId) {
        this.serverResourceId = serverResourceId;
        return this;
    }

    /**
     * Get offline data transfer. Possible values include: 'on', 'off'.
     *
     * @return the offlineDataTransfer value
     */
    public String offlineDataTransfer() {
        return this.offlineDataTransfer;
    }

    /**
     * Set offline data transfer. Possible values include: 'on', 'off'.
     *
     * @param offlineDataTransfer the offlineDataTransfer value to set
     * @return the ServerEndpointCreateParameters object itself.
     */
    public ServerEndpointCreateParameters withOfflineDataTransfer(String offlineDataTransfer) {
        this.offlineDataTransfer = offlineDataTransfer;
        return this;
    }

    /**
     * Get offline data transfer share name.
     *
     * @return the offlineDataTransferShareName value
     */
    public String offlineDataTransferShareName() {
        return this.offlineDataTransferShareName;
    }

    /**
     * Set offline data transfer share name.
     *
     * @param offlineDataTransferShareName the offlineDataTransferShareName value to set
     * @return the ServerEndpointCreateParameters object itself.
     */
    public ServerEndpointCreateParameters withOfflineDataTransferShareName(String offlineDataTransferShareName) {
        this.offlineDataTransferShareName = offlineDataTransferShareName;
        return this;
    }

}
