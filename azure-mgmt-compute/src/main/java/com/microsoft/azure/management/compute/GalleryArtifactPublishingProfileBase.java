/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the basic gallery artifact publishing profile.
 */
public class GalleryArtifactPublishingProfileBase {
    /**
     * The regions where the artifact is going to be published.
     */
    @JsonProperty(value = "regions")
    private List<String> regions;

    /**
     * The source property.
     */
    @JsonProperty(value = "source")
    private GalleryArtifactSource source;

    /**
     * Get the regions where the artifact is going to be published.
     *
     * @return the regions value
     */
    public List<String> regions() {
        return this.regions;
    }

    /**
     * Set the regions where the artifact is going to be published.
     *
     * @param regions the regions value to set
     * @return the GalleryArtifactPublishingProfileBase object itself.
     */
    public GalleryArtifactPublishingProfileBase withRegions(List<String> regions) {
        this.regions = regions;
        return this;
    }

    /**
     * Get the source value.
     *
     * @return the source value
     */
    public GalleryArtifactSource source() {
        return this.source;
    }

    /**
     * Set the source value.
     *
     * @param source the source value to set
     * @return the GalleryArtifactPublishingProfileBase object itself.
     */
    public GalleryArtifactPublishingProfileBase withSource(GalleryArtifactSource source) {
        this.source = source;
        return this;
    }

}