import dao.ProdutoDAO;
import model.Produto;
import org.junit.Test;

public class SelectAllProdutoTest {
    @Test
    public void allProduto(){
        ProdutoDAO dao = new ProdutoDAO();
        for (Produto p:dao.selectAllProduto()  ) {
            System.out.println("---------------------------------");
            System.out.println("ID: "+ p.getIdProduto()+
                                "\nNOME: "+p.getNomeProduto()+
                                "\nDETALHE: "+p.getDetalheProduto()+
                                "\nLINK DA FOTO: "+p.getFotoProduto()+
                                "\nPREÇO: " + p.getPrecoProduto()+
                                "\nDISPONIVEL: " +p.getDisponivelProduto());
        }
    }
}
