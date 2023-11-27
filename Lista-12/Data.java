public class Data {

    private int dia, mes;

    public Data(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int compareTo(Data outro){
        if(this.dia < outro.dia || this.mes < outro.mes){
            return 1;
        } else if (this.dia == outro.dia || this.mes == outro.mes){
            return 0;
        } else {
            return -1;
        }
    }

    
    
}
