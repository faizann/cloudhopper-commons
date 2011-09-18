/**
 * Copyright (C) 2011 Twitter, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.cloudhopper.commons.xbean.convert;

import com.cloudhopper.commons.xbean.*;

/**
 * Converts a String to a long.
 * @author joelauer
 */
public class LongPrimitivePropertyConverter implements PropertyConverter {

    public Object convert(String value) throws ConversionException {
        try {
            return Long.parseLong(value);
        } catch (NumberFormatException e) {
            throw new ConversionException(e.getMessage());
        }
    }
    
}
