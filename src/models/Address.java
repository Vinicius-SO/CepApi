package models;

public record Address(String cep,String logradouro, String bairro, String localidade, String estado) {
    @Override
    public String toString() {
        return "O CEP "+cep+" corresponde ao seguinte endereço, logradouro:" + logradouro + ", bairro:" + bairro + ", cidade: "+ localidade+ ", estado: "+ estado;
    }
}
