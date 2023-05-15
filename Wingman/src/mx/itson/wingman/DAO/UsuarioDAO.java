/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package  mx.itson.wingman.DAO;
import java.util.List;
import mx.itson.wingman.entidades.Usuario;
/**
 *
 * @author paulp
 */
public class UsuarioDAO {
        private List<Usuario> usuarios;
        
        public List<Usuario> getusuarios() {
            return usuarios;
        }
        
        public void setusuarios(List<Usuario> usuarios){
            this.usuarios = usuarios;
        }
        
     }

