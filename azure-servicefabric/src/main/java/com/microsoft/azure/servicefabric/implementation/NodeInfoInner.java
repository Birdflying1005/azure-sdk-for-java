/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import com.microsoft.azure.servicefabric.NodeStatus;
import com.microsoft.azure.servicefabric.HealthState;
import com.microsoft.azure.servicefabric.NodeId;
import com.microsoft.azure.servicefabric.NodeDeactivationInfo;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about a node in Service Fabric cluster.
 */
public class NodeInfoInner {
    /**
     * The name of a Service Fabric node.
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * The IP address or fully qualified domain name of the node.
     */
    @JsonProperty(value = "IpAddressOrFQDN")
    private String ipAddressOrFQDN;

    /**
     * The type of the node.
     */
    @JsonProperty(value = "Type")
    private String type;

    /**
     * The version of Service Fabric binaries that the node is running.
     */
    @JsonProperty(value = "CodeVersion")
    private String codeVersion;

    /**
     * The version of Service Fabric cluster manifest that the node is using.
     */
    @JsonProperty(value = "ConfigVersion")
    private String configVersion;

    /**
     * The status of the node. Possible values include: 'Invalid', 'Up',
     * 'Down', 'Enabling', 'Disabling', 'Disabled', 'Unknown', 'Removed'.
     */
    @JsonProperty(value = "NodeStatus")
    private NodeStatus nodeStatus;

    /**
     * Time in seconds since the node has been in NodeStatus Up. Value zero
     * indicates that the node is not Up.
     */
    @JsonProperty(value = "NodeUpTimeInSeconds")
    private String nodeUpTimeInSeconds;

    /**
     * The health state of a Service Fabric entity such as Cluster, Node,
     * Application, Service, Partition, Replica etc. Possible values include:
     * 'Invalid', 'Ok', 'Warning', 'Error', 'Unknown'.
     */
    @JsonProperty(value = "HealthState")
    private HealthState healthState;

    /**
     * Indicates if the node is a seed node or not. Returns true if the node is
     * a seed node, otherwise false. A quorum of seed nodes are required for
     * proper operation of Service Fabric cluster.
     */
    @JsonProperty(value = "IsSeedNode")
    private Boolean isSeedNode;

    /**
     * The upgrade domain of the node.
     */
    @JsonProperty(value = "UpgradeDomain")
    private String upgradeDomain;

    /**
     * The fault domain of the node.
     */
    @JsonProperty(value = "FaultDomain")
    private String faultDomain;

    /**
     * An internal ID used by Service Fabric to uniquely identify a node. Node
     * Id is deterministically generated from node name.
     */
    @JsonProperty(value = "Id")
    private NodeId id;

    /**
     * The ID representing the node instance. While the ID of the node is
     * deterministically generated from the node name and remains same across
     * restarts, the InstanceId changes every time node restarts.
     */
    @JsonProperty(value = "InstanceId")
    private String instanceId;

    /**
     * Information about the node deactivation. This information is valid for a
     * node that is undergoing deactivation or has already been deactivated.
     */
    @JsonProperty(value = "NodeDeactivationInfo")
    private NodeDeactivationInfo nodeDeactivationInfo;

    /**
     * Indicates if the node is stopped by calling stop node API or not.
     * Returns true if the node is stopped, otherwise false.
     */
    @JsonProperty(value = "IsStopped")
    private Boolean isStopped;

    /**
     * Time in seconds since the node has been in NodeStatus Down. Value zero
     * indicates node is not NodeStatus Down.
     */
    @JsonProperty(value = "NodeDownTimeInSeconds")
    private String nodeDownTimeInSeconds;

    /**
     * Date time in UTC when the node came up. If the node has never been up
     * then this value will be zero date time.
     */
    @JsonProperty(value = "NodeUpAt")
    private DateTime nodeUpAt;

    /**
     * Date time in UTC when the node went down. If node has never been down
     * then this value will be zero date time.
     */
    @JsonProperty(value = "NodeDownAt")
    private DateTime nodeDownAt;

    /**
     * Get the name of a Service Fabric node.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of a Service Fabric node.
     *
     * @param name the name value to set
     * @return the NodeInfoInner object itself.
     */
    public NodeInfoInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the IP address or fully qualified domain name of the node.
     *
     * @return the ipAddressOrFQDN value
     */
    public String ipAddressOrFQDN() {
        return this.ipAddressOrFQDN;
    }

    /**
     * Set the IP address or fully qualified domain name of the node.
     *
     * @param ipAddressOrFQDN the ipAddressOrFQDN value to set
     * @return the NodeInfoInner object itself.
     */
    public NodeInfoInner withIpAddressOrFQDN(String ipAddressOrFQDN) {
        this.ipAddressOrFQDN = ipAddressOrFQDN;
        return this;
    }

    /**
     * Get the type of the node.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type of the node.
     *
     * @param type the type value to set
     * @return the NodeInfoInner object itself.
     */
    public NodeInfoInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the version of Service Fabric binaries that the node is running.
     *
     * @return the codeVersion value
     */
    public String codeVersion() {
        return this.codeVersion;
    }

    /**
     * Set the version of Service Fabric binaries that the node is running.
     *
     * @param codeVersion the codeVersion value to set
     * @return the NodeInfoInner object itself.
     */
    public NodeInfoInner withCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
        return this;
    }

    /**
     * Get the version of Service Fabric cluster manifest that the node is using.
     *
     * @return the configVersion value
     */
    public String configVersion() {
        return this.configVersion;
    }

    /**
     * Set the version of Service Fabric cluster manifest that the node is using.
     *
     * @param configVersion the configVersion value to set
     * @return the NodeInfoInner object itself.
     */
    public NodeInfoInner withConfigVersion(String configVersion) {
        this.configVersion = configVersion;
        return this;
    }

    /**
     * Get the status of the node. Possible values include: 'Invalid', 'Up', 'Down', 'Enabling', 'Disabling', 'Disabled', 'Unknown', 'Removed'.
     *
     * @return the nodeStatus value
     */
    public NodeStatus nodeStatus() {
        return this.nodeStatus;
    }

    /**
     * Set the status of the node. Possible values include: 'Invalid', 'Up', 'Down', 'Enabling', 'Disabling', 'Disabled', 'Unknown', 'Removed'.
     *
     * @param nodeStatus the nodeStatus value to set
     * @return the NodeInfoInner object itself.
     */
    public NodeInfoInner withNodeStatus(NodeStatus nodeStatus) {
        this.nodeStatus = nodeStatus;
        return this;
    }

    /**
     * Get time in seconds since the node has been in NodeStatus Up. Value zero indicates that the node is not Up.
     *
     * @return the nodeUpTimeInSeconds value
     */
    public String nodeUpTimeInSeconds() {
        return this.nodeUpTimeInSeconds;
    }

    /**
     * Set time in seconds since the node has been in NodeStatus Up. Value zero indicates that the node is not Up.
     *
     * @param nodeUpTimeInSeconds the nodeUpTimeInSeconds value to set
     * @return the NodeInfoInner object itself.
     */
    public NodeInfoInner withNodeUpTimeInSeconds(String nodeUpTimeInSeconds) {
        this.nodeUpTimeInSeconds = nodeUpTimeInSeconds;
        return this;
    }

    /**
     * Get the health state of a Service Fabric entity such as Cluster, Node, Application, Service, Partition, Replica etc. Possible values include: 'Invalid', 'Ok', 'Warning', 'Error', 'Unknown'.
     *
     * @return the healthState value
     */
    public HealthState healthState() {
        return this.healthState;
    }

    /**
     * Set the health state of a Service Fabric entity such as Cluster, Node, Application, Service, Partition, Replica etc. Possible values include: 'Invalid', 'Ok', 'Warning', 'Error', 'Unknown'.
     *
     * @param healthState the healthState value to set
     * @return the NodeInfoInner object itself.
     */
    public NodeInfoInner withHealthState(HealthState healthState) {
        this.healthState = healthState;
        return this;
    }

    /**
     * Get indicates if the node is a seed node or not. Returns true if the node is a seed node, otherwise false. A quorum of seed nodes are required for proper operation of Service Fabric cluster.
     *
     * @return the isSeedNode value
     */
    public Boolean isSeedNode() {
        return this.isSeedNode;
    }

    /**
     * Set indicates if the node is a seed node or not. Returns true if the node is a seed node, otherwise false. A quorum of seed nodes are required for proper operation of Service Fabric cluster.
     *
     * @param isSeedNode the isSeedNode value to set
     * @return the NodeInfoInner object itself.
     */
    public NodeInfoInner withIsSeedNode(Boolean isSeedNode) {
        this.isSeedNode = isSeedNode;
        return this;
    }

    /**
     * Get the upgrade domain of the node.
     *
     * @return the upgradeDomain value
     */
    public String upgradeDomain() {
        return this.upgradeDomain;
    }

    /**
     * Set the upgrade domain of the node.
     *
     * @param upgradeDomain the upgradeDomain value to set
     * @return the NodeInfoInner object itself.
     */
    public NodeInfoInner withUpgradeDomain(String upgradeDomain) {
        this.upgradeDomain = upgradeDomain;
        return this;
    }

    /**
     * Get the fault domain of the node.
     *
     * @return the faultDomain value
     */
    public String faultDomain() {
        return this.faultDomain;
    }

    /**
     * Set the fault domain of the node.
     *
     * @param faultDomain the faultDomain value to set
     * @return the NodeInfoInner object itself.
     */
    public NodeInfoInner withFaultDomain(String faultDomain) {
        this.faultDomain = faultDomain;
        return this;
    }

    /**
     * Get an internal ID used by Service Fabric to uniquely identify a node. Node Id is deterministically generated from node name.
     *
     * @return the id value
     */
    public NodeId id() {
        return this.id;
    }

    /**
     * Set an internal ID used by Service Fabric to uniquely identify a node. Node Id is deterministically generated from node name.
     *
     * @param id the id value to set
     * @return the NodeInfoInner object itself.
     */
    public NodeInfoInner withId(NodeId id) {
        this.id = id;
        return this;
    }

    /**
     * Get the ID representing the node instance. While the ID of the node is deterministically generated from the node name and remains same across restarts, the InstanceId changes every time node restarts.
     *
     * @return the instanceId value
     */
    public String instanceId() {
        return this.instanceId;
    }

    /**
     * Set the ID representing the node instance. While the ID of the node is deterministically generated from the node name and remains same across restarts, the InstanceId changes every time node restarts.
     *
     * @param instanceId the instanceId value to set
     * @return the NodeInfoInner object itself.
     */
    public NodeInfoInner withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * Get information about the node deactivation. This information is valid for a node that is undergoing deactivation or has already been deactivated.
     *
     * @return the nodeDeactivationInfo value
     */
    public NodeDeactivationInfo nodeDeactivationInfo() {
        return this.nodeDeactivationInfo;
    }

    /**
     * Set information about the node deactivation. This information is valid for a node that is undergoing deactivation or has already been deactivated.
     *
     * @param nodeDeactivationInfo the nodeDeactivationInfo value to set
     * @return the NodeInfoInner object itself.
     */
    public NodeInfoInner withNodeDeactivationInfo(NodeDeactivationInfo nodeDeactivationInfo) {
        this.nodeDeactivationInfo = nodeDeactivationInfo;
        return this;
    }

    /**
     * Get indicates if the node is stopped by calling stop node API or not. Returns true if the node is stopped, otherwise false.
     *
     * @return the isStopped value
     */
    public Boolean isStopped() {
        return this.isStopped;
    }

    /**
     * Set indicates if the node is stopped by calling stop node API or not. Returns true if the node is stopped, otherwise false.
     *
     * @param isStopped the isStopped value to set
     * @return the NodeInfoInner object itself.
     */
    public NodeInfoInner withIsStopped(Boolean isStopped) {
        this.isStopped = isStopped;
        return this;
    }

    /**
     * Get time in seconds since the node has been in NodeStatus Down. Value zero indicates node is not NodeStatus Down.
     *
     * @return the nodeDownTimeInSeconds value
     */
    public String nodeDownTimeInSeconds() {
        return this.nodeDownTimeInSeconds;
    }

    /**
     * Set time in seconds since the node has been in NodeStatus Down. Value zero indicates node is not NodeStatus Down.
     *
     * @param nodeDownTimeInSeconds the nodeDownTimeInSeconds value to set
     * @return the NodeInfoInner object itself.
     */
    public NodeInfoInner withNodeDownTimeInSeconds(String nodeDownTimeInSeconds) {
        this.nodeDownTimeInSeconds = nodeDownTimeInSeconds;
        return this;
    }

    /**
     * Get date time in UTC when the node came up. If the node has never been up then this value will be zero date time.
     *
     * @return the nodeUpAt value
     */
    public DateTime nodeUpAt() {
        return this.nodeUpAt;
    }

    /**
     * Set date time in UTC when the node came up. If the node has never been up then this value will be zero date time.
     *
     * @param nodeUpAt the nodeUpAt value to set
     * @return the NodeInfoInner object itself.
     */
    public NodeInfoInner withNodeUpAt(DateTime nodeUpAt) {
        this.nodeUpAt = nodeUpAt;
        return this;
    }

    /**
     * Get date time in UTC when the node went down. If node has never been down then this value will be zero date time.
     *
     * @return the nodeDownAt value
     */
    public DateTime nodeDownAt() {
        return this.nodeDownAt;
    }

    /**
     * Set date time in UTC when the node went down. If node has never been down then this value will be zero date time.
     *
     * @param nodeDownAt the nodeDownAt value to set
     * @return the NodeInfoInner object itself.
     */
    public NodeInfoInner withNodeDownAt(DateTime nodeDownAt) {
        this.nodeDownAt = nodeDownAt;
        return this;
    }

}