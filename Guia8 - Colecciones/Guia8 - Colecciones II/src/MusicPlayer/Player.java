package MusicPlayer;

public class Player {
    // ATRIBUTOS

    public ListaBasica listaBasica;
    public ListaPremium listaPremium;
    private boolean premium;
    public boolean pausa;

    // CONSTRUCTORES

    public Player(String nombreBasica, String nombrePremium) {
        listaBasica = new ListaBasica(nombreBasica);
        listaPremium = new ListaPremium(nombrePremium);
        premium = false;
        pausa = true;
    }

    // GETTERS AND SETTERS

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    // METODOS

    public void Reproducir() {
        if (premium) {
            listaPremium.Reproducir();
            this.pausa = false;
        } else {
            listaBasica.Reproducir();
            this.pausa = false;
        }
    }

    public void aniadirCancion(Cancion c) {
        if (premium) {
            listaPremium.aniadirCancion(c);
        } else {
            listaBasica.aniadirCancion(c);
        }
    }

    public void cambiarCancion() {
        if (premium) {
            listaPremium.cambiarCancion();
        } else {
            listaBasica.cambiarCancion();
        }
    }

    public void eliminarCancion(String c) {
        if (premium) {
            listaPremium.eliminarCancion(c);
        } else {
            listaBasica.eliminarCancion(c);
        }
    }

    public void verMiLista() {
        if (premium) {
            listaPremium.verMiLista();
        } else {
            listaBasica.verMiLista();
        }
    }

    public void mostrarReproduciendo() {
        if (premium) {
            if (listaPremium.reproduciendo != null) {
                System.out.println("Reproduciendo: \n" + listaPremium.reproduciendo.toString());
                if (pausa) {
                    System.out.println("|| En pausa");
                }
            } else {
                System.out.println("No hay nada reproduciendose en este instante.");
            }
        } else {
            if (listaBasica.reproduciendo != null) {
                System.out.println("Reproduciendo: \n" + listaBasica.reproduciendo.toString());
                if (pausa) {
                    System.out.println("|| En pausa");
                }
            } else {
                System.out.println("No hay nada reproduciendose en este instante.");
            }
        }
    }

    public void pausaResumir() {
        this.pausa = !this.pausa;
    }
}
