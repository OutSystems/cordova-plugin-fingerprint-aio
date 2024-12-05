package de.niklasmerz.cordova.biometric;

public enum PluginError {

    BIOMETRIC_UNKNOWN_ERROR(-100),
    BIOMETRIC_AUTHENTICATION_FAILED(-102, "Authentication failed"),
    BIOMETRIC_HARDWARE_NOT_SUPPORTED(-104),
    BIOMETRIC_NOT_ENROLLED(-106),
    BIOMETRIC_DISMISSED(-108),
    BIOMETRIC_SCREEN_GUARD_UNSECURED(-110,
            "Go to 'Settings -> Security -> Screenlock' to set up a lock screen"),
    BIOMETRIC_LOCKED_OUT(-111, "Too many failed attempts. Try again later."),
    BIOMETRIC_LOCKED_OUT_PERMANENT(-112),
    BIOMETRIC_NO_SECRET_FOUND(-113),
    BIOMETRIC_ARGS_PARSING_FAILED(-115),

    BIOMETRIC_SECURITY_VULNERABILITY(-116,
            "A security vulnerability has been discovered with one or more hardware sensors. The affected sensor(s) are unavailable until a security update has addressed the issue."),
    ;

    private int value;
    private String message;

    PluginError(int value) {
        this.value = value;
        this.message = this.name();
    }

    PluginError(int value, String message) {
        this.value = value;
        this.message = message;
    }

    public int getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }
}
