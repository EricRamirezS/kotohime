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