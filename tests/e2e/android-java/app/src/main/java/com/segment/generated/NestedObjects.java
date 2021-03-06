/**
 * This client was automatically generated by Segment Typewriter. ** Do Not Edit **
 */
package com.segment.generated;

import java.util.*;
import com.segment.analytics.Properties;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class NestedObjects extends SerializableProperties {
    private Properties properties;

    private NestedObjects(Properties properties) {
        this.properties = properties;
    }

    protected Properties toProperties() {
        return properties;
    }

    /**
     * Builder for {@link NestedObjects}
     */
    public static class Builder {
        private Properties properties;

        /**
         * Builder for {@link NestedObjects}
         */
        public Builder() {
            properties = new Properties();
        }

        /**
         * This property is required to generate a valid NestedObjects object
         */
        public Builder garage(final @NonNull Garage garage) {
            if (garage != null) {
                properties.putValue("garage", garage.toProperties());
            } else {
                properties.putValue("garage", garage);
            }

            return this;
        }

        /**
         * Build an instance of {@link NestedObjects}
         */
        public NestedObjects build() {
            if(properties.get("garage") == null){
                throw new IllegalArgumentException("NestedObjects missing required property: garage");
            }
            return new NestedObjects(properties);
        }
    }
}
