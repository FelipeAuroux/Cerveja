package com.example.consultordecerveja_feliperrezende;

public class listagem {
    String marcaCerveja;
    int img;

    public String getMarcaCerveja() {
        return marcaCerveja;
    }

    public void setMarcaCerveja(String marcaCerveja) {
        this.marcaCerveja = marcaCerveja;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public listagem(String marcaCerveja, int img) {
        this.marcaCerveja = marcaCerveja;
        this.img = img;
    }
}
