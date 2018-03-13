
package controle;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.Contato;
import persistencia.ContatoDAO;


@ManagedBean(name = "contatoManagedBean")
@RequestScoped
public class ContatoManagedBean {

    
    private ContatoDAO pDAO = new ContatoDAO();
    private Contato contato = new Contato();
    private List<Contato> listaContatosManage = null;
    
    
    public ContatoManagedBean() {
        
    }
    
    public void init(){
        if(listaContatosManage == null){
            listaContatosManage = listaContatosManage = pDAO.listarContatoDAO();
        }
    }
    
    public String cadastraContatoMange(){
        return null;
    }
    
    public String listarContatoManage(){
        return null;
    }
    
    public String deletarContatoManage(Contato contato){
        return null;
    }
    
    public String consultarContatoManage(){
        return null;
    }
    
}
