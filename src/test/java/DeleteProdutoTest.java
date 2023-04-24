import dao.ProdutoDAO;
import model.Produto;
import org.junit.Test;

public class DeleteProdutoTest {
    @Test
    public void deleteProduto(){
        Produto produto = new Produto(11,"","","",0.0,0);
        ProdutoDAO dao = new ProdutoDAO();
        dao.deleteProduto(produto);

    }
}
