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

package ingress.data.gdpr.parser.utils;

import static org.junit.Assert.assertEquals;

import ingress.data.gdpr.parsers.utils.TimeUtil;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeParseException;

/**
 * @author SgrAlpha
 */
public class TimeUtilTest {

    @Test
    public void testParseFromIso8610() {
        ZonedDateTime time = TimeUtil.toZonedDataTime("2016-03-05 08:29:21 PST");
        assertEquals(2016, time.getYear());
        assertEquals(ZoneId.of("America/Los_Angeles"), time.getZone());
    }

    @Test(expected = DateTimeParseException.class)
    public void testParseFromInvalid() {
        TimeUtil.toZonedDataTime("asdfg");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseFromBlank() {
        TimeUtil.toZonedDataTime("");
    }
    @Test(expected = IllegalArgumentException.class)
    public void testParseFromNull() {
        TimeUtil.toZonedDataTime(null);
    }

}
