package rede;

public class UsuarioPremium extends Usuario {
    public UsuarioPremium(String nomeUsuario, String senha, String email,Perfil perfil) {
        super(nomeUsuario, senha, email,perfil);
    }

    public void criarPostagemEmDestaque(Postagem postagem) {
        // Lógica para criar uma postagem em destaque
        System.out.println("Postagem em destaque criada: " + postagem.getConteudo());
    }
}
