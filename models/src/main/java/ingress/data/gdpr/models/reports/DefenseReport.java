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

package ingress.data.gdpr.models.reports;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import ingress.data.gdpr.models.NumericBasedRecord;
import ingress.data.gdpr.models.utils.JsonUtil;

import java.util.List;

/**
 * @author SgrAlpha
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DefenseReport {

    private ReportDetails<List<NumericBasedRecord<Double>>> mindUnitsTimesDaysHeld;
    private ReportDetails<List<NumericBasedRecord<Double>>> fieldHeldDays;
    private ReportDetails<List<NumericBasedRecord<Double>>> linkLengthInKmTimesDaysHeld;
    private ReportDetails<List<NumericBasedRecord<Double>>> linkHeldDays;
    private ReportDetails<List<NumericBasedRecord<Double>>> portalHeldDays;

    @JsonProperty("mind_units_time_days_held")
    public ReportDetails<List<NumericBasedRecord<Double>>> getMindUnitsTimesDaysHeld() {
        return mindUnitsTimesDaysHeld;
    }

    public void setMindUnitsTimesDaysHeld(final ReportDetails<List<NumericBasedRecord<Double>>> mindUnitsTimesDaysHeld) {
        this.mindUnitsTimesDaysHeld = mindUnitsTimesDaysHeld;
    }

    @JsonProperty("field_held_days")
    public ReportDetails<List<NumericBasedRecord<Double>>> getFieldHeldDays() {
        return fieldHeldDays;
    }

    public void setFieldHeldDays(final ReportDetails<List<NumericBasedRecord<Double>>> fieldHeldDays) {
        this.fieldHeldDays = fieldHeldDays;
    }

    @JsonProperty("link_length_in_km_time_days_held")
    public ReportDetails<List<NumericBasedRecord<Double>>> getLinkLengthInKmTimesDaysHeld() {
        return linkLengthInKmTimesDaysHeld;
    }

    public void setLinkLengthInKmTimesDaysHeld(final ReportDetails<List<NumericBasedRecord<Double>>> linkLengthInKmTimesDaysHeld) {
        this.linkLengthInKmTimesDaysHeld = linkLengthInKmTimesDaysHeld;
    }

    @JsonProperty("link_held_days")
    public ReportDetails<List<NumericBasedRecord<Double>>> getLinkHeldDays() {
        return linkHeldDays;
    }

    public void setLinkHeldDays(final ReportDetails<List<NumericBasedRecord<Double>>> linkHeldDays) {
        this.linkHeldDays = linkHeldDays;
    }

    @JsonProperty("portal_held_days")
    public ReportDetails<List<NumericBasedRecord<Double>>> getPortalHeldDays() {
        return portalHeldDays;
    }

    public void setPortalHeldDays(final ReportDetails<List<NumericBasedRecord<Double>>> portalHeldDays) {
        this.portalHeldDays = portalHeldDays;
    }

    @Override public String toString() {
        return JsonUtil.toJson(this);
    }

}