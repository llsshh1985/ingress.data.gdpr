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

import ingress.data.gdpr.models.reports.ReportDetails;

import java.nio.file.Path;

/**
 * @param <T> type of data
 *
 * @author SgrAlpha
 */
public interface DataFileParser<T> {

    String SEPARATOR_TAB = "\t";
    String SEPARATOR_COMMA_AND_SPACE = ": ";
    String SEPARATOR_WORD_AT = " at ";

    ReportDetails<T> parse(Path dataFile);

}
