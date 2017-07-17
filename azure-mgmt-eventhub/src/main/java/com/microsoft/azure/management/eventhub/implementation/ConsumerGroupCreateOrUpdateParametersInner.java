/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhub.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Parameters supplied to the Create Or Update Consumer Group operation.
 */
@JsonFlatten
public class ConsumerGroupCreateOrUpdateParametersInner {
    /**
     * Location of the resource.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * ARM type of the Namespace.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Name of the consumer group.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Exact time the message was created.
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdAt;

    /**
     * The path of the Event Hub.
     */
    @JsonProperty(value = "properties.eventHubPath", access = JsonProperty.Access.WRITE_ONLY)
    private String eventHubPath;

    /**
     * The exact time the message was updated.
     */
    @JsonProperty(value = "properties.updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime updatedAt;

    /**
     * The user metadata.
     */
    @JsonProperty(value = "properties.userMetadata")
    private String userMetadata;

    /**
     * Get the location value.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location value.
     *
     * @param location the location value to set
     * @return the ConsumerGroupCreateOrUpdateParametersInner object itself.
     */
    public ConsumerGroupCreateOrUpdateParametersInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the ConsumerGroupCreateOrUpdateParametersInner object itself.
     */
    public ConsumerGroupCreateOrUpdateParametersInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ConsumerGroupCreateOrUpdateParametersInner object itself.
     */
    public ConsumerGroupCreateOrUpdateParametersInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the createdAt value.
     *
     * @return the createdAt value
     */
    public DateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the eventHubPath value.
     *
     * @return the eventHubPath value
     */
    public String eventHubPath() {
        return this.eventHubPath;
    }

    /**
     * Get the updatedAt value.
     *
     * @return the updatedAt value
     */
    public DateTime updatedAt() {
        return this.updatedAt;
    }

    /**
     * Get the userMetadata value.
     *
     * @return the userMetadata value
     */
    public String userMetadata() {
        return this.userMetadata;
    }

    /**
     * Set the userMetadata value.
     *
     * @param userMetadata the userMetadata value to set
     * @return the ConsumerGroupCreateOrUpdateParametersInner object itself.
     */
    public ConsumerGroupCreateOrUpdateParametersInner withUserMetadata(String userMetadata) {
        this.userMetadata = userMetadata;
        return this;
    }

}