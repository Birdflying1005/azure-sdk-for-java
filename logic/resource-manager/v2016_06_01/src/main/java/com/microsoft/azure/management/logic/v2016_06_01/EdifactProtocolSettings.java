/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Edifact agreement protocol settings.
 */
public class EdifactProtocolSettings {
    /**
     * The EDIFACT validation settings.
     */
    @JsonProperty(value = "validationSettings", required = true)
    private EdifactValidationSettings validationSettings;

    /**
     * The EDIFACT framing settings.
     */
    @JsonProperty(value = "framingSettings", required = true)
    private EdifactFramingSettings framingSettings;

    /**
     * The EDIFACT envelope settings.
     */
    @JsonProperty(value = "envelopeSettings", required = true)
    private EdifactEnvelopeSettings envelopeSettings;

    /**
     * The EDIFACT acknowledgement settings.
     */
    @JsonProperty(value = "acknowledgementSettings", required = true)
    private EdifactAcknowledgementSettings acknowledgementSettings;

    /**
     * The EDIFACT message filter.
     */
    @JsonProperty(value = "messageFilter", required = true)
    private EdifactMessageFilter messageFilter;

    /**
     * The EDIFACT processing Settings.
     */
    @JsonProperty(value = "processingSettings", required = true)
    private EdifactProcessingSettings processingSettings;

    /**
     * The EDIFACT envelope override settings.
     */
    @JsonProperty(value = "envelopeOverrides")
    private List<EdifactEnvelopeOverride> envelopeOverrides;

    /**
     * The EDIFACT message filter list.
     */
    @JsonProperty(value = "messageFilterList")
    private List<EdifactMessageIdentifier> messageFilterList;

    /**
     * The EDIFACT schema references.
     */
    @JsonProperty(value = "schemaReferences", required = true)
    private List<EdifactSchemaReference> schemaReferences;

    /**
     * The EDIFACT validation override settings.
     */
    @JsonProperty(value = "validationOverrides")
    private List<EdifactValidationOverride> validationOverrides;

    /**
     * The EDIFACT delimiter override settings.
     */
    @JsonProperty(value = "edifactDelimiterOverrides")
    private List<EdifactDelimiterOverride> edifactDelimiterOverrides;

    /**
     * Get the validationSettings value.
     *
     * @return the validationSettings value
     */
    public EdifactValidationSettings validationSettings() {
        return this.validationSettings;
    }

    /**
     * Set the validationSettings value.
     *
     * @param validationSettings the validationSettings value to set
     * @return the EdifactProtocolSettings object itself.
     */
    public EdifactProtocolSettings withValidationSettings(EdifactValidationSettings validationSettings) {
        this.validationSettings = validationSettings;
        return this;
    }

    /**
     * Get the framingSettings value.
     *
     * @return the framingSettings value
     */
    public EdifactFramingSettings framingSettings() {
        return this.framingSettings;
    }

    /**
     * Set the framingSettings value.
     *
     * @param framingSettings the framingSettings value to set
     * @return the EdifactProtocolSettings object itself.
     */
    public EdifactProtocolSettings withFramingSettings(EdifactFramingSettings framingSettings) {
        this.framingSettings = framingSettings;
        return this;
    }

    /**
     * Get the envelopeSettings value.
     *
     * @return the envelopeSettings value
     */
    public EdifactEnvelopeSettings envelopeSettings() {
        return this.envelopeSettings;
    }

    /**
     * Set the envelopeSettings value.
     *
     * @param envelopeSettings the envelopeSettings value to set
     * @return the EdifactProtocolSettings object itself.
     */
    public EdifactProtocolSettings withEnvelopeSettings(EdifactEnvelopeSettings envelopeSettings) {
        this.envelopeSettings = envelopeSettings;
        return this;
    }

    /**
     * Get the acknowledgementSettings value.
     *
     * @return the acknowledgementSettings value
     */
    public EdifactAcknowledgementSettings acknowledgementSettings() {
        return this.acknowledgementSettings;
    }

    /**
     * Set the acknowledgementSettings value.
     *
     * @param acknowledgementSettings the acknowledgementSettings value to set
     * @return the EdifactProtocolSettings object itself.
     */
    public EdifactProtocolSettings withAcknowledgementSettings(EdifactAcknowledgementSettings acknowledgementSettings) {
        this.acknowledgementSettings = acknowledgementSettings;
        return this;
    }

    /**
     * Get the messageFilter value.
     *
     * @return the messageFilter value
     */
    public EdifactMessageFilter messageFilter() {
        return this.messageFilter;
    }

    /**
     * Set the messageFilter value.
     *
     * @param messageFilter the messageFilter value to set
     * @return the EdifactProtocolSettings object itself.
     */
    public EdifactProtocolSettings withMessageFilter(EdifactMessageFilter messageFilter) {
        this.messageFilter = messageFilter;
        return this;
    }

    /**
     * Get the processingSettings value.
     *
     * @return the processingSettings value
     */
    public EdifactProcessingSettings processingSettings() {
        return this.processingSettings;
    }

    /**
     * Set the processingSettings value.
     *
     * @param processingSettings the processingSettings value to set
     * @return the EdifactProtocolSettings object itself.
     */
    public EdifactProtocolSettings withProcessingSettings(EdifactProcessingSettings processingSettings) {
        this.processingSettings = processingSettings;
        return this;
    }

    /**
     * Get the envelopeOverrides value.
     *
     * @return the envelopeOverrides value
     */
    public List<EdifactEnvelopeOverride> envelopeOverrides() {
        return this.envelopeOverrides;
    }

    /**
     * Set the envelopeOverrides value.
     *
     * @param envelopeOverrides the envelopeOverrides value to set
     * @return the EdifactProtocolSettings object itself.
     */
    public EdifactProtocolSettings withEnvelopeOverrides(List<EdifactEnvelopeOverride> envelopeOverrides) {
        this.envelopeOverrides = envelopeOverrides;
        return this;
    }

    /**
     * Get the messageFilterList value.
     *
     * @return the messageFilterList value
     */
    public List<EdifactMessageIdentifier> messageFilterList() {
        return this.messageFilterList;
    }

    /**
     * Set the messageFilterList value.
     *
     * @param messageFilterList the messageFilterList value to set
     * @return the EdifactProtocolSettings object itself.
     */
    public EdifactProtocolSettings withMessageFilterList(List<EdifactMessageIdentifier> messageFilterList) {
        this.messageFilterList = messageFilterList;
        return this;
    }

    /**
     * Get the schemaReferences value.
     *
     * @return the schemaReferences value
     */
    public List<EdifactSchemaReference> schemaReferences() {
        return this.schemaReferences;
    }

    /**
     * Set the schemaReferences value.
     *
     * @param schemaReferences the schemaReferences value to set
     * @return the EdifactProtocolSettings object itself.
     */
    public EdifactProtocolSettings withSchemaReferences(List<EdifactSchemaReference> schemaReferences) {
        this.schemaReferences = schemaReferences;
        return this;
    }

    /**
     * Get the validationOverrides value.
     *
     * @return the validationOverrides value
     */
    public List<EdifactValidationOverride> validationOverrides() {
        return this.validationOverrides;
    }

    /**
     * Set the validationOverrides value.
     *
     * @param validationOverrides the validationOverrides value to set
     * @return the EdifactProtocolSettings object itself.
     */
    public EdifactProtocolSettings withValidationOverrides(List<EdifactValidationOverride> validationOverrides) {
        this.validationOverrides = validationOverrides;
        return this;
    }

    /**
     * Get the edifactDelimiterOverrides value.
     *
     * @return the edifactDelimiterOverrides value
     */
    public List<EdifactDelimiterOverride> edifactDelimiterOverrides() {
        return this.edifactDelimiterOverrides;
    }

    /**
     * Set the edifactDelimiterOverrides value.
     *
     * @param edifactDelimiterOverrides the edifactDelimiterOverrides value to set
     * @return the EdifactProtocolSettings object itself.
     */
    public EdifactProtocolSettings withEdifactDelimiterOverrides(List<EdifactDelimiterOverride> edifactDelimiterOverrides) {
        this.edifactDelimiterOverrides = edifactDelimiterOverrides;
        return this;
    }

}