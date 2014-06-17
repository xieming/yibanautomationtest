package com.yiban.automation.model;

public enum Browser {
    firefox10, chrome11, safari4, safari5, ie;

    private String location;

    private String remote;

    private String firebug;

    private String firebug_version;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRemote() {
        return remote;
    }

    public void setRemote(String remote) {
        this.remote = remote;
    }

    public String getFirebug() {
        return firebug;
    }

    public void setFirebug(String firebug) {
        this.firebug = firebug;
    }

    public String getFirebug_version() {
        return firebug_version;
    }

    public void setFirebug_version(String firebug_version) {
        this.firebug_version = firebug_version;
    }

}
