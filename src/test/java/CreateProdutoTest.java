import dao.ProdutoDAO;
import model.Produto;
import org.junit.Test;

public class CreateProdutoTest {
        //Arrange -> tradução livre -> Entrada
    // Act -> tradução livre -> Ação
    // Assert -> tradução livre -> Resultado

    @Test
    public void createProduto(){
        Produto produto = new Produto("Teste","Teste","sssssss",3.50,1);
        ProdutoDAO dao = new ProdutoDAO();
        dao.createProduto(produto);


    }
}
