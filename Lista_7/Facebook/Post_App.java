package Lista_7.Facebook;

public class Post_App {

    public static void main(String[] args) {
        
        Post post = new Post("Viagem em familia", "facebook.com/me/937113");

        for (int i = 0; i < 3; i++) {
            post.curtir();
        }

        System.out.println(post.getNumeroCurtidas() + " Curtidas");

        for (int i = 0; i < 2; i++) {
            post.compartilhar();
        }

        System.out.println(post.getNumeroCompartilhamentos() + " Compartilhamentos");

    }
    
}
