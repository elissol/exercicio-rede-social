package rede;

public class Usuario {
    private String nomeUsuario;
    private String senha;
    private String email;
    private Perfil perfil;

    public Usuario(String nomeUsuario, String senha, String email,Perfil perfil) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.email = email;
        this.perfil = perfil;
    }

    // Getters e Setters
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        // Simples validação de senha
        if (senha.length() >= 6) {
            this.senha = senha;
        } else {
            throw new IllegalArgumentException("Senha deve ter pelo menos 6 caracteres.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Perfil getPerfil() {
    	return perfil;
    }
    
    public void setPerfil(Perfil perfil) {
    	this.perfil = perfil;
    }
}
