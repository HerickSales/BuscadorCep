import com.google.gson.annotations.SerializedName;

public class Endereco {
    private String cep;
    @SerializedName("localidade")
    private String cidade;
    @SerializedName("complemento")
    private String rua;
    private String uf;

    // setters
    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    // getters
    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getRua() {
        return rua;
    }

    public String getUf() {
        return uf;
    }

    /*
     * void imprime() {
     * if (cep.equals("\0")) {
     * System.out.println("cep = " + cep);
     * }
     * if (cidade.equals("\0")) {
     * System.out.println("cidade = " + cidade);
     * }
     * if (rua.equals("\0")) {
     * System.out.println("rua = " + rua);
     * }
     * if (uf.equals("\0")) {
     * System.out.println("uf = " + uf);
     * }
     * 
     * }
     */
    @Override
    public String toString() {
        System.out.println("cep= " + cep +
                "\ncidade= " + cidade + "\nrua = " + rua + "\n");
        return super.toString();
    }
}
