package devandroid.jeferson.applistacurso.model;

public class Pessoa {

    // Construtor
    // Atributos - Objetos - Modelo - Template
    // Metodos de Acesso - Gets and Sets

    private String primeiroNome;
    private String sobreNome;
    private String cursoDesejado;
    private String TelContato;

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }

    public String getTelContato() {
        return TelContato;
    }

    public void setTelContato(String telContato) {
        TelContato = telContato;
    }

    // To String - Para Textos - Para Strings de Caracteres

    @Override
    public String toString() {
        return "Pessoa{" +
                "primeiroNome='" + primeiroNome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", cursoDesejado='" + cursoDesejado + '\'' +
                ", TelContato='" + TelContato + '\'' +
                '}';
    }

    public Pessoa (){





    }







}

