package org.acme.model;

import org.acme.dto.UsuarioDTO;
import org.acme.enums.RoleEnum;

import io.quarkus.elytron.security.common.BcryptUtil;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.security.jpa.Password;
import io.quarkus.security.jpa.Roles;
import io.quarkus.security.jpa.UserDefinition;
import io.quarkus.security.jpa.Username;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@UserDefinition
@Table(schema = "DB_DEFAULT", name = "USUARIO")
public class Usuario extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;
    @Column(name = "nome_completo")
    private String nomeCompleto;
    @Username
    @Column(name = "user_name")
    private String userName;
    @Roles
    @Column(name = "role_acess")
    private String role;
    @Password
    private String senha;
    
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public static void add(UsuarioDTO usrDTO){
        var usr = new Usuario();
        usr.setCpf(usrDTO.getCpf());
        usr.setUserName(usrDTO.getUserName());
        usr.setNomeCompleto(usrDTO.getNomeCompleto());
        usr.setSenha(BcryptUtil.bcryptHash(usrDTO.getPasswordUser())); 
        usr.setRole(getRoleEnumUserName(usrDTO.getUserName()).getRole());
        usr.persist();
    }
    
    private static RoleEnum getRoleEnumUserName(String userName){
        // Validação trivial
        if(userName.equals("admin_first")){
            return RoleEnum.ADMIN;
        }
        return RoleEnum.USUARIO_COMUM;
    }
}
