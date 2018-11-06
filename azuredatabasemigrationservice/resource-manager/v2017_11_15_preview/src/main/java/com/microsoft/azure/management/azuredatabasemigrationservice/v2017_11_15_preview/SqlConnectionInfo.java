/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2017_11_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Information for connecting to SQL database server.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SqlConnectionInfo")
public class SqlConnectionInfo extends ConnectionInfo {
    /**
     * Data source in the format
     * Protocol:MachineName\SQLServerInstanceName,PortNumber.
     */
    @JsonProperty(value = "dataSource", required = true)
    private String dataSource;

    /**
     * Authentication type to use for connection. Possible values include:
     * 'None', 'WindowsAuthentication', 'SqlAuthentication',
     * 'ActiveDirectoryIntegrated', 'ActiveDirectoryPassword'.
     */
    @JsonProperty(value = "authentication")
    private AuthenticationType authentication;

    /**
     * Whether to encrypt the connection.
     */
    @JsonProperty(value = "encryptConnection")
    private Boolean encryptConnection;

    /**
     * Additional connection settings.
     */
    @JsonProperty(value = "additionalSettings")
    private String additionalSettings;

    /**
     * Whether to trust the server certificate.
     */
    @JsonProperty(value = "trustServerCertificate")
    private Boolean trustServerCertificate;

    /**
     * Get data source in the format Protocol:MachineName\SQLServerInstanceName,PortNumber.
     *
     * @return the dataSource value
     */
    public String dataSource() {
        return this.dataSource;
    }

    /**
     * Set data source in the format Protocol:MachineName\SQLServerInstanceName,PortNumber.
     *
     * @param dataSource the dataSource value to set
     * @return the SqlConnectionInfo object itself.
     */
    public SqlConnectionInfo withDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    /**
     * Get authentication type to use for connection. Possible values include: 'None', 'WindowsAuthentication', 'SqlAuthentication', 'ActiveDirectoryIntegrated', 'ActiveDirectoryPassword'.
     *
     * @return the authentication value
     */
    public AuthenticationType authentication() {
        return this.authentication;
    }

    /**
     * Set authentication type to use for connection. Possible values include: 'None', 'WindowsAuthentication', 'SqlAuthentication', 'ActiveDirectoryIntegrated', 'ActiveDirectoryPassword'.
     *
     * @param authentication the authentication value to set
     * @return the SqlConnectionInfo object itself.
     */
    public SqlConnectionInfo withAuthentication(AuthenticationType authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * Get whether to encrypt the connection.
     *
     * @return the encryptConnection value
     */
    public Boolean encryptConnection() {
        return this.encryptConnection;
    }

    /**
     * Set whether to encrypt the connection.
     *
     * @param encryptConnection the encryptConnection value to set
     * @return the SqlConnectionInfo object itself.
     */
    public SqlConnectionInfo withEncryptConnection(Boolean encryptConnection) {
        this.encryptConnection = encryptConnection;
        return this;
    }

    /**
     * Get additional connection settings.
     *
     * @return the additionalSettings value
     */
    public String additionalSettings() {
        return this.additionalSettings;
    }

    /**
     * Set additional connection settings.
     *
     * @param additionalSettings the additionalSettings value to set
     * @return the SqlConnectionInfo object itself.
     */
    public SqlConnectionInfo withAdditionalSettings(String additionalSettings) {
        this.additionalSettings = additionalSettings;
        return this;
    }

    /**
     * Get whether to trust the server certificate.
     *
     * @return the trustServerCertificate value
     */
    public Boolean trustServerCertificate() {
        return this.trustServerCertificate;
    }

    /**
     * Set whether to trust the server certificate.
     *
     * @param trustServerCertificate the trustServerCertificate value to set
     * @return the SqlConnectionInfo object itself.
     */
    public SqlConnectionInfo withTrustServerCertificate(Boolean trustServerCertificate) {
        this.trustServerCertificate = trustServerCertificate;
        return this;
    }

}
