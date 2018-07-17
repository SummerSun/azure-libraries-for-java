/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class Representing Solution for problems detected.
 */
public class Solution {
    /**
     * Solution Id.
     */
    @JsonProperty(value = "id")
    private Double id;

    /**
     * Display Name of the solution.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Order of the solution.
     */
    @JsonProperty(value = "order")
    private Double order;

    /**
     * Description of the solution.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Type of Solution. Possible values include: 'QuickSolution',
     * 'DeepInvestigation', 'BestPractices'.
     */
    @JsonProperty(value = "type")
    private SolutionType type;

    /**
     * Solution Data.
     */
    @JsonProperty(value = "data")
    private List<List<NameValuePair>> data;

    /**
     * Solution Metadata.
     */
    @JsonProperty(value = "metadata")
    private List<List<NameValuePair>> metadata;

    /**
     * Get solution Id.
     *
     * @return the id value
     */
    public Double id() {
        return this.id;
    }

    /**
     * Set solution Id.
     *
     * @param id the id value to set
     * @return the Solution object itself.
     */
    public Solution withId(Double id) {
        this.id = id;
        return this;
    }

    /**
     * Get display Name of the solution.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set display Name of the solution.
     *
     * @param displayName the displayName value to set
     * @return the Solution object itself.
     */
    public Solution withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get order of the solution.
     *
     * @return the order value
     */
    public Double order() {
        return this.order;
    }

    /**
     * Set order of the solution.
     *
     * @param order the order value to set
     * @return the Solution object itself.
     */
    public Solution withOrder(Double order) {
        this.order = order;
        return this;
    }

    /**
     * Get description of the solution.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of the solution.
     *
     * @param description the description value to set
     * @return the Solution object itself.
     */
    public Solution withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get type of Solution. Possible values include: 'QuickSolution', 'DeepInvestigation', 'BestPractices'.
     *
     * @return the type value
     */
    public SolutionType type() {
        return this.type;
    }

    /**
     * Set type of Solution. Possible values include: 'QuickSolution', 'DeepInvestigation', 'BestPractices'.
     *
     * @param type the type value to set
     * @return the Solution object itself.
     */
    public Solution withType(SolutionType type) {
        this.type = type;
        return this;
    }

    /**
     * Get solution Data.
     *
     * @return the data value
     */
    public List<List<NameValuePair>> data() {
        return this.data;
    }

    /**
     * Set solution Data.
     *
     * @param data the data value to set
     * @return the Solution object itself.
     */
    public Solution withData(List<List<NameValuePair>> data) {
        this.data = data;
        return this;
    }

    /**
     * Get solution Metadata.
     *
     * @return the metadata value
     */
    public List<List<NameValuePair>> metadata() {
        return this.metadata;
    }

    /**
     * Set solution Metadata.
     *
     * @param metadata the metadata value to set
     * @return the Solution object itself.
     */
    public Solution withMetadata(List<List<NameValuePair>> metadata) {
        this.metadata = metadata;
        return this;
    }

}
