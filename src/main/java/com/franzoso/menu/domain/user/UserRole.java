package com.franzoso.menu.domain.user;

public enum UserRole {

    ADMIN("admin"),

    USER("user");

    private String role;

    UserRole(String role) {
        this.role = role;
    }

    public String getROle() {
        return role;
    }
}
