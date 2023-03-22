package e4;

public class Main {

    public static void main(String[] args) {

        Usuario u1 = new Usuario(13, "user1", "asderyhtdhfg");
        Usuario u2 = new Usuario(15, "user2", "lkfghfgjhgfds");
        Usuario u3 = new Usuario(6, "user3", "tryhg54yrfge");
        Usuario u4 = new Usuario(10, "user4", "u6t4gfhdsedg");
        Usuario u5 = new Usuario(23, "user5", "u6t4gfhdsedg");

        ServidorProxy servidorProxy = new ServidorProxy();

        servidorProxy.addUsuario(u1);
        servidorProxy.addUsuario(u2);
        servidorProxy.addUsuario(u3);
        servidorProxy.addUsuario(u4);

        servidorProxy.atenderUsuario(u1);
        servidorProxy.atenderUsuario(u2);
        servidorProxy.atenderUsuario(u3);
        servidorProxy.atenderUsuario(u4);
        servidorProxy.atenderUsuario(u5);

    }

}
