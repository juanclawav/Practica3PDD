package e4;

import java.util.ArrayList;
import java.util.List;

public class ServidorUno implements Cluster {

    private List<Usuario> usuarioList;

    public ServidorUno() {
        usuarioList = new ArrayList<>();
    }

    public void showAllUsers() {
        for(Usuario usuario : usuarioList) {
            usuario.showInfo();
        }
    }

    @Override
    public void atenderUsuario(Usuario usuario){
        boolean found = false;
        for(Usuario u : usuarioList){
            if(usuario.getNombreUsuario().equals(u.getNombreUsuario())&&usuario.getPwd().equals(u.getPwd())){
                System.out.println("Usuario "+ usuario.getNombreUsuario()+" atendido por el sevidor 1");
                found=true;
            }
        }
        if(!found){
            System.out.println(("Nombre de usuario o contraseña incorrectos"));
        }
    }
    @Override
    public void addUsuario(Usuario usuario) {
        System.out.println("Añadiendo usuario: " + usuario.getNombreUsuario() + " al servidor 1");
        usuarioList.add(usuario);
        System.out.println("Usuarios totales: ");
        this.showAllUsers();
    }
}
