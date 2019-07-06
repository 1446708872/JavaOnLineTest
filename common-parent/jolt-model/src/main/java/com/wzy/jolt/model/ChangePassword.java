package com.wzy.jolt.model;

public class ChangePassword {

    private String originalPassword;

    private String newPassword;

    private String determinePassword;

    @Override
    public String toString() {
        return "ChangePassword{" +
                ", originalPassword='" + originalPassword + '\'' +
                ", newPassword='" + newPassword + '\'' +
                ", determinePassword='" + determinePassword + '\'' +
                '}';
    }


    public String getOriginalPassword() {
        return originalPassword;
    }

    public void setOriginalPassword(String originalPassword) {
        this.originalPassword = originalPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getDeterminePassword() {
        return determinePassword;
    }

    public void setDeterminePassword(String determinePassword) {
        this.determinePassword = determinePassword;
    }
}
