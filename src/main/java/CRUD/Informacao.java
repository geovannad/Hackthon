package CRUD;

import java.util.Date;

public class Informacao {

    private String api;
    private Date data;
    private String status;
    private String problema;
    private String localizacao;

    public Informacao(String api, Date data, String status, String problema, String localizacao) {
        this.api = api;
        this.data = data;
        this.status = status;
        this.problema = problema;
        this.localizacao = localizacao;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return "Informacao{" +
                "api='" + api + '\'' +
                ", data=" + data +
                ", status='" + status + '\'' +
                ", problema='" + problema + '\'' +
                ", localizacao='" + localizacao + '\'' +
                '}';
    }
}
