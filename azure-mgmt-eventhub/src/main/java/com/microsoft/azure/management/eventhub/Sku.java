/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhub;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SKU parameters supplied to the create namespace operation.
 */
public class Sku {
    /**
     * Name of this SKU. Possible values include: 'Basic', 'Standard'.
     */
    @JsonProperty(value = "name", required = true)
    private SkuName name;

    /**
     * The billing tier of this particular SKU. Possible values include:
     * 'Basic', 'Standard'.
     */
    @JsonProperty(value = "tier")
    private SkuTier tier;

    /**
     * The Event Hubs throughput units, vaule should be 0 to 20 throughput
     * units.
     */
    @JsonProperty(value = "capacity")
    private Integer capacity;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public SkuName name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the Sku object itself.
     */
    public Sku withName(SkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier value.
     *
     * @return the tier value
     */
    public SkuTier tier() {
        return this.tier;
    }

    /**
     * Set the tier value.
     *
     * @param tier the tier value to set
     * @return the Sku object itself.
     */
    public Sku withTier(SkuTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the capacity value.
     *
     * @return the capacity value
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity value.
     *
     * @param capacity the capacity value to set
     * @return the Sku object itself.
     */
    public Sku withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

}
