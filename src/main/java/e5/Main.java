package e5;

public class Main {
            public static void main(String[] args){
                Empresa1 android = new Android("Nuevo Android App");
                android.login();

                Empresa1 ios = new IOS("Nuevo IOS App");
                ios.logout();

                Empresa1 windowsP = new WindowsPhone("Nueva Windows Phone App");
                windowsP.reportes();

                Empresa1 web = new Adapter(new WebApp("Nueva Web App"));
                web.login();

                Empresa1 escritorio = new Adapter(new Escritorio("Nueva Desk App"));
                escritorio.logout();
            }
}
