package org.acme.enums;

public enum RoleEnum {
    ADMIN("admin"), USUARIO_COMUM("usuario_comum");

    private String role;

    RoleEnum(String role){
        this.role = role;
    }

    public String getRole() {
        return role;
    }

}
