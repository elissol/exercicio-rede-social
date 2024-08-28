package rede;

public class Perfil {
    private String biografia;
    private String fotoPerfil;

    public Perfil(String biografia, String fotoPerfil) {
        this.biografia = biografia;
        this.fotoPerfil = fotoPerfil;
    }

    // Getters e Setters
    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }
}

