
package mx.uamex.dto;

/**
 *
 * @author jorge
 */
public class BaseDeDatos {
public Usuario[] usuariosRegistrados = new Usuario[5];
public BaseDeDatos() {
usuariosRegistrados[0]= new Usuario("juan","e10adc3949ba59abbe56e057f20f883e");//123456
usuariosRegistrados[1]= new Usuario("sofia","e80b5017098950fc58aad83c8c14978e");//abcdef
usuariosRegistrados[2]= new Usuario("antonio","5f4dcc3b5aa765d61d8327deb882cf99");//password
usuariosRegistrados[3]= new Usuario("luisa","89c79702b411a0b89ccf8f8e01590f0c");//19051980
usuariosRegistrados[4]= new Usuario("peralta","057a9f2fd344ed965e4f5a8a4358b1de");//peralta12
}
}
