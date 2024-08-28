package rede;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("elismotta", "senha123", "elis@example.com", new Perfil("Empreendedora", "foto.jpg"));
        UsuarioPremium usuarioPremium = new UsuarioPremium("vimotta", "senha456", "vimtto@example.com", new Perfil("Atleta", "foto_premium.jpg"));
        UsuarioAdmin admin = new UsuarioAdmin("admin", "adminpass", "admin@example.com", new Perfil("Admin", "admin.jpg"));

        Postagem postagem = new Postagem("Olá minha postagem!");
        postagem.curtir();
        postagem.comentar(new Comentario(usuario, "Amei!"));

        usuarioPremium.criarPostagemEmDestaque(postagem);

        admin.deletarPostagem(postagem);
        admin.banirUsuario(usuario);
    }
}
