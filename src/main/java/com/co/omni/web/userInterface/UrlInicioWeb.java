package com.co.omni.web.userInterface;

public enum UrlInicioWeb {

    UrlInicioWeb("https://www.amazon.com/");

    private final String url;

    UrlInicioWeb(String url) {

        this.url = url;
    }

    public String Url() {

        return url;
    }
}

