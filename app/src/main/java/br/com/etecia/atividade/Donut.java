package br.com.etecia.atividade;

public class Donut {


    private String descDonut;
    private String txtNomeDonut;
    private int idImgDonut;

    public Donut(String txtNomeDonut, int idImgDonut, String descDonut) {
        this.txtNomeDonut = txtNomeDonut;
        this.idImgDonut = idImgDonut;
        this.descDonut = descDonut;
    }

    public String getTxtNomeDonut() {
        return txtNomeDonut;
    }

    public void setTxtNomeDonut(String txtNomeDonut) {
        this.txtNomeDonut = txtNomeDonut;
    }

    public int getIdImgDonut() {
        return idImgDonut;
    }

    public void setIdImgDonut(int idImgDonut) {
        this.idImgDonut = idImgDonut;
    }

    public String getDescDonut() {
        return descDonut;
    }

    public void setDescDonut(String descDonut) {
        this.descDonut = descDonut;
    }
}
