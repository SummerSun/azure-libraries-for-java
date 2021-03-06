/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ScaleTier.
 */
public final class ScaleTier extends ExpandableStringEnum<ScaleTier> {
    /** Static value S30 for ScaleTier. */
    public static final ScaleTier S30 = fromString("S30");

    /** Static value S100 for ScaleTier. */
    public static final ScaleTier S100 = fromString("S100");

    /**
     * Creates or finds a ScaleTier from its string representation.
     * @param name a name to look for
     * @return the corresponding ScaleTier
     */
    @JsonCreator
    public static ScaleTier fromString(String name) {
        return fromString(name, ScaleTier.class);
    }

    /**
     * @return known ScaleTier values
     */
    public static Collection<ScaleTier> values() {
        return values(ScaleTier.class);
    }
}
