package rede;

public class UsuarioAdmin extends Usuario {
    public UsuarioAdmin(String nomeUsuario, String senha, String email,Perfil perfil) {
        super(nomeUsuario, senha, email,perfil);
    }

    public void deletarPostagem(Postagem postagem) {
        // Lógica para deletar postagem
        System.out.println("Postagem deletada: " + postagem.getConteudo());
    }

    public void banirUsuario(Usuario usuario) {
        // Lógica para banir um usuário
        System.out.println("Usuário banido: " + usuario.getNomeUsuario());
    }
}
