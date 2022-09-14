package br.com.etecia.atividade;

public class Cafe {

    private String txtNomeiten;
    private int idImgcoffe ;
    private String descCafe;

    public Cafe(String txtNomeiten, int idImgcoffe, String descCafe) {
        this.txtNomeiten = txtNomeiten;
        this.idImgcoffe = idImgcoffe;
        this.descCafe = descCafe;
    }

    public String getTxtNomeiten() {
        return txtNomeiten;
    }

    public void setTxtNomeiten(String txtNomeiten) {
        this.txtNomeiten = txtNomeiten;
    }

    public int getIdImgcoffe() {
        return idImgcoffe;
    }

    public void setIdImgcoffe(int idImgcoffe) {
        this.idImgcoffe = idImgcoffe;
    }

    public String getDescCafe() {
        return descCafe;
    }

    public void setDescCafe(String descCafe) {
        this.descCafe = descCafe;
    }
}
