package model;

public class Produto {
    private Integer idProduto;
    private String nomeProduto;
    private String detalheProduto;
    private String fotoProduto;
    private Double precoProduto;
    private Integer disponivelProduto;

    public Produto(){

    }

    public Produto(String nomeProduto, String detalheProduto, String fotoProduto, Double precoProduto, Integer disponivelProduto) {
        this.nomeProduto = nomeProduto;
        this.detalheProduto = detalheProduto;
        this.fotoProduto = fotoProduto;
        this.precoProduto = precoProduto;
        this.disponivelProduto = disponivelProduto;
    }

    public Produto(Integer idProduto, String nomeProduto, String detalheProduto, String fotoProduto, Double precoProduto, Integer disponivelProduto) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.detalheProduto = detalheProduto;
        this.fotoProduto = fotoProduto;
        this.precoProduto = precoProduto;
        this.disponivelProduto = disponivelProduto;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDetalheProduto() {
        return detalheProduto;
    }

    public void setDetalheProduto(String detalheProduto) {
        this.detalheProduto = detalheProduto;
    }

    public String getFotoProduto() {
        return fotoProduto;
    }

    public void setFotoProduto(String fotoProduto) {
        this.fotoProduto = fotoProduto;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public Integer getDisponivelProduto() {
        return disponivelProduto;
    }

    public void setDisponivelProduto(Integer disponivelProduto) {
        this.disponivelProduto = disponivelProduto;
    }

}
