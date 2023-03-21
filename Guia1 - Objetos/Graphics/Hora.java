package Graphics;

public class Hora {
    int hora;
    int minuto;
    int segundo;

    public Hora(int hora, int minuto, int segundo) {
        if (hora < 24 && hora > 0) {
            this.hora = hora;
        } 
        else {
            System.out.println("Hora invalida, establecida a 00.");
            this.hora = 0;
        }

        if (minuto < 60 && minuto > 0) {
            this.minuto = minuto;
        } 
        else {
            System.out.println("Minutos invalidos, establecidos a 0.");
            this.minuto = 0;
        }

        if (segundo < 60 && segundo > 0) {
            this.segundo = segundo;
        } 
        else {
            System.out.println("Segundos invalidos, establecidos a 0.");
            this.segundo = 0;
        }

    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinutos(int minutos) {
        this.minuto = minutos;
    }

    public void setSegundos(int segundos) {
        this.minuto = segundos;
    }

    public int getHora() {
        return this.hora;
    }

    public int getMinutos() {
        return this.minuto;
    }

    public int getSegundos() {
        return this.segundo;
    }

    public void mostrarHora() {
        String hora = Integer.toString(getHora());
        String minutos = Integer.toString(getMinutos());
        String segundos = Integer.toString(getSegundos());

        if(hora.length() == 1) {
            hora = "0" + hora;
        }

        if(minutos.length() == 1) {
            minutos = "0" + minutos;
        }

        if(segundos.length() == 1) {
            segundos = "0" + segundos;
        }

        System.out.println("Hora: " + hora + ":" + minutos + ":" + segundos);
        
    }

    public Hora correSegundo() {
        this.segundo++;

        return this;
    }


}
