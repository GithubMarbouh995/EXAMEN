package com.example.examen.controller;

import jakarta.faces.context.FacesContext;
import jakarta.faces.event.ValueChangeEvent;

import java.util.Locale;

public class LangController {
    private Locale data = FacesContext.getCurrentInstance().getViewRoot().getLocale();
    private String lang;

    public LangController() {}

    public Locale getData() {
        return data;
    }

    public void setData(Locale data) {
        this.data = data;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public void changeLanguage(ValueChangeEvent e) {
        lang = e.getNewValue().toString();
        setLang(lang);
        data = new Locale(lang);
        FacesContext.getCurrentInstance().getViewRoot().setLocale(data);
    }
}
