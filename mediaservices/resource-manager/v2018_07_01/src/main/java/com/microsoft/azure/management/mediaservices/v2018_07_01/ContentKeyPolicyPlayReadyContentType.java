/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ContentKeyPolicyPlayReadyContentType.
 */
public final class ContentKeyPolicyPlayReadyContentType extends ExpandableStringEnum<ContentKeyPolicyPlayReadyContentType> {
    /** Static value Unknown for ContentKeyPolicyPlayReadyContentType. */
    public static final ContentKeyPolicyPlayReadyContentType UNKNOWN = fromString("Unknown");

    /** Static value Unspecified for ContentKeyPolicyPlayReadyContentType. */
    public static final ContentKeyPolicyPlayReadyContentType UNSPECIFIED = fromString("Unspecified");

    /** Static value UltraVioletDownload for ContentKeyPolicyPlayReadyContentType. */
    public static final ContentKeyPolicyPlayReadyContentType ULTRA_VIOLET_DOWNLOAD = fromString("UltraVioletDownload");

    /** Static value UltraVioletStreaming for ContentKeyPolicyPlayReadyContentType. */
    public static final ContentKeyPolicyPlayReadyContentType ULTRA_VIOLET_STREAMING = fromString("UltraVioletStreaming");

    /**
     * Creates or finds a ContentKeyPolicyPlayReadyContentType from its string representation.
     * @param name a name to look for
     * @return the corresponding ContentKeyPolicyPlayReadyContentType
     */
    @JsonCreator
    public static ContentKeyPolicyPlayReadyContentType fromString(String name) {
        return fromString(name, ContentKeyPolicyPlayReadyContentType.class);
    }

    /**
     * @return known ContentKeyPolicyPlayReadyContentType values
     */
    public static Collection<ContentKeyPolicyPlayReadyContentType> values() {
        return values(ContentKeyPolicyPlayReadyContentType.class);
    }
}
