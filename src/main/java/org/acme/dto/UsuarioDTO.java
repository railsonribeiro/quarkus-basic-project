package org.acme.dto;

public class UsuarioDTO {
    private String cpf;
    private String username;
    private String passwordUser;
    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPasswordUser() {
        return passwordUser;
    }
    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    
}
