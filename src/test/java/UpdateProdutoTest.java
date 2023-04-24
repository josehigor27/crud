import dao.ProdutoDAO;
import model.Produto;
import org.junit.Test;

public class UpdateProdutoTest {
    @Test
    public void updateProduto(){
        Produto produto = new Produto(2,"Blusa Marvel","","",60.50,1);
        ProdutoDAO dao = new ProdutoDAO();
        dao.updateProduto(produto);

    }
}
