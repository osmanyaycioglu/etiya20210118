package com.training.etiya.rest;

import java.time.LocalDate;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {

    @Override
    public LocalDate unmarshal(final String v) throws Exception {
        return LocalDate.parse(v);
    }

    @Override
    public String marshal(final LocalDate v) throws Exception {
        return v.toString();
    }
}