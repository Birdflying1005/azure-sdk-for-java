/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object providing possible image types and matching confidence levels.
 */
public class ImageType {
    /**
     * Confidence level that the image is a clip art.
     */
    @JsonProperty(value = "clipArtType")
    private int clipArtType;

    /**
     * Confidence level that the image is a line drawing.
     */
    @JsonProperty(value = "lineDrawingType")
    private int lineDrawingType;

    /**
     * Get confidence level that the image is a clip art.
     *
     * @return the clipArtType value
     */
    public int clipArtType() {
        return this.clipArtType;
    }

    /**
     * Set confidence level that the image is a clip art.
     *
     * @param clipArtType the clipArtType value to set
     * @return the ImageType object itself.
     */
    public ImageType withClipArtType(int clipArtType) {
        this.clipArtType = clipArtType;
        return this;
    }

    /**
     * Get confidence level that the image is a line drawing.
     *
     * @return the lineDrawingType value
     */
    public int lineDrawingType() {
        return this.lineDrawingType;
    }

    /**
     * Set confidence level that the image is a line drawing.
     *
     * @param lineDrawingType the lineDrawingType value to set
     * @return the ImageType object itself.
     */
    public ImageType withLineDrawingType(int lineDrawingType) {
        this.lineDrawingType = lineDrawingType;
        return this;
    }

}