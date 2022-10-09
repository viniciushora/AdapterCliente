package adaptercliente.adapter;
import adaptercliente.model.ICliente;
import lib.ClienteExterno;

public class ClienteAdapter implements ICliente{
    
    private String nomeCompleto;
    private String telefone;    
    private String email;
    private String celular;
    
    public ClienteAdapter(ClienteExterno cliente) {
        this.nomeCompleto = cliente.getNome() + " " + cliente.getSobreNome();
        this.telefone = cliente.getDddTelefone() + " " + cliente.getTelefone();
        this.celular = cliente.getDddCelular() + cliente.getCelular();
        this.email = cliente.getEmail();
    }

    @Override
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    @Override
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getCelular() {
        return celular;
    }

    @Override
    public void setCelular(String celular) {
        this.celular = celular;
    }
    
}