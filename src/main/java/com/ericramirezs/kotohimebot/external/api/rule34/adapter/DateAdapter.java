/*
 * Copyright (C) 2022  Eric Bastian Ramírez Santis
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.ericramirezs.kotohimebot.external.api.rule34.adapter;

import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter<String, OffsetDateTime> {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss +HHmm yyyy");

    @Override
    public String marshal(OffsetDateTime v) {
        synchronized (dateFormat) {
            if (v == null) return null;
            return dateFormat.format(v);
        }
    }

    @Override
    public OffsetDateTime unmarshal(String v) throws Exception {
        synchronized (dateFormat) {
            return OffsetDateTime.ofInstant(dateFormat.parse(v).toInstant(), ZoneOffset.UTC);
        }
    }

}