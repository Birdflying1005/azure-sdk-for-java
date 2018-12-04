/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.newssearch.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the error that occurred.
 */
public class Error {
    /**
     * The error code that identifies the category of error. Possible values
     * include: 'None', 'ServerError', 'InvalidRequest', 'RateLimitExceeded',
     * 'InvalidAuthorization', 'InsufficientAuthorization'.
     */
    @JsonProperty(value = "code", required = true)
    private ErrorCode code;

    /**
     * The error code that further helps to identify the error. Possible values
     * include: 'UnexpectedError', 'ResourceError', 'NotImplemented',
     * 'ParameterMissing', 'ParameterInvalidValue', 'HttpNotAllowed',
     * 'Blocked', 'AuthorizationMissing', 'AuthorizationRedundancy',
     * 'AuthorizationDisabled', 'AuthorizationExpired'.
     */
    @JsonProperty(value = "subCode", access = JsonProperty.Access.WRITE_ONLY)
    private ErrorSubCode subCode;

    /**
     * A description of the error.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /**
     * A description that provides additional information about the error.
     */
    @JsonProperty(value = "moreDetails", access = JsonProperty.Access.WRITE_ONLY)
    private String moreDetails;

    /**
     * The parameter in the request that caused the error.
     */
    @JsonProperty(value = "parameter", access = JsonProperty.Access.WRITE_ONLY)
    private String parameter;

    /**
     * The parameter's value in the request that was not valid.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /**
     * Get the error code that identifies the category of error. Possible values include: 'None', 'ServerError', 'InvalidRequest', 'RateLimitExceeded', 'InvalidAuthorization', 'InsufficientAuthorization'.
     *
     * @return the code value
     */
    public ErrorCode code() {
        return this.code;
    }

    /**
     * Set the error code that identifies the category of error. Possible values include: 'None', 'ServerError', 'InvalidRequest', 'RateLimitExceeded', 'InvalidAuthorization', 'InsufficientAuthorization'.
     *
     * @param code the code value to set
     * @return the Error object itself.
     */
    public Error withCode(ErrorCode code) {
        this.code = code;
        return this;
    }

    /**
     * Get the error code that further helps to identify the error. Possible values include: 'UnexpectedError', 'ResourceError', 'NotImplemented', 'ParameterMissing', 'ParameterInvalidValue', 'HttpNotAllowed', 'Blocked', 'AuthorizationMissing', 'AuthorizationRedundancy', 'AuthorizationDisabled', 'AuthorizationExpired'.
     *
     * @return the subCode value
     */
    public ErrorSubCode subCode() {
        return this.subCode;
    }

    /**
     * Get a description of the error.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set a description of the error.
     *
     * @param message the message value to set
     * @return the Error object itself.
     */
    public Error withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get a description that provides additional information about the error.
     *
     * @return the moreDetails value
     */
    public String moreDetails() {
        return this.moreDetails;
    }

    /**
     * Get the parameter in the request that caused the error.
     *
     * @return the parameter value
     */
    public String parameter() {
        return this.parameter;
    }

    /**
     * Get the parameter's value in the request that was not valid.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

}
