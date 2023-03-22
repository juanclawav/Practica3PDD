package e4;

import java.util.List;

public class ServidorProxy implements Cluster {

    private ServidorUno servidorUno;
    private ServidorDos servidorDos;

    public ServidorProxy() {
        this.servidorUno = new ServidorUno();
        this.servidorDos = new ServidorDos();
    }
    @Override
    public void atenderUsuario(Usuario usuario){
        if(usuario.getId() % 2 != 0) {
            servidorUno.atenderUsuario(usuario);

        } else {
            servidorDos.atenderUsuario(usuario);
        }
    }
    @Override
    public void addUsuario(Usuario usuario) {
        if(!usuario.getNombreUsuario().isEmpty()) {
            if(usuario.getPwd().length() > 8 && !usuario.getPwd().isEmpty()) {
                if(usuario.getId() % 2 != 0) {
                    servidorUno.addUsuario(usuario);

                } else {
                    servidorDos.addUsuario(usuario);
                }

            } else {
                System.out.println("Escoge una mejor contraseña");
            }

        } else {
            System.out.println("El nombre de usuario no es valido");
        }
    }
}
