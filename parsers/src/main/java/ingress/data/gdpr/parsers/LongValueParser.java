/*
 * Copyright (C) 2014-2018 SgrAlpha
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package ingress.data.gdpr.parsers;

import static ingress.data.gdpr.models.utils.Preconditions.notEmptyString;
import static ingress.data.gdpr.models.utils.Preconditions.notNull;

/**
 * @author SgrAlpha
 */
public class LongValueParser implements SingleLineValueParser<Long> {

    private static final LongValueParser INSTANCE = new LongValueParser();

    @Override public Long parse(final String... columns) {
        notNull(columns, "No columns to parse from");
        if (columns.length != 1) {
            throw new IllegalArgumentException(String.format("Expecting only one column, but got %d", columns.length));
        }
        final String value = columns[0];
        notEmptyString(value, "Missing value to parse from");
        return Long.parseLong(value);
    }

    public static LongValueParser getDefault() {
        return INSTANCE;
    }

}
