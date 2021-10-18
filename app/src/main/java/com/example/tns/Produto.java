package com.example.tns;

public class Produto extends Cupom{

    String nomeProduto;
    Integer codigoProduto;
    Integer precoProduto;
    String descricaoProduto;
    Integer categoriaProduto;
    Byte imageProduto;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Integer getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(Integer codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public Integer getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Integer precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public Integer getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(Integer categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public Byte getImageProduto() {
        return imageProduto;
    }

    public void setImageProduto(Byte imageProduto) {
        this.imageProduto = imageProduto;
    }

    public void AdiconarCupom(Integer codigoCupom){

    }
}
