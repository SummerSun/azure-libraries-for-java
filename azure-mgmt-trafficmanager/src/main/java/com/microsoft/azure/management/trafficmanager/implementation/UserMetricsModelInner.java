/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.trafficmanager.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Class representing Traffic Manager User Metrics.
 */
@JsonFlatten
public class UserMetricsModelInner extends ProxyResource {
    /**
     * The key returned by the User Metrics operation.
     */
    @JsonProperty(value = "properties.key")
    private String key;

    /**
     * Get the key returned by the User Metrics operation.
     *
     * @return the key value
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key returned by the User Metrics operation.
     *
     * @param key the key value to set
     * @return the UserMetricsModelInner object itself.
     */
    public UserMetricsModelInner withKey(String key) {
        this.key = key;
        return this;
    }

}
