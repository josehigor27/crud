package dao;

import connection.ConnectionBD;
import model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

        Connection conn = null;

    public ProdutoDAO(){
        conn = ConnectionBD.createConnection();
    }

    public Produto createProduto(Produto produto){
        String sql = "INSERT INTO tbl_produto (nome_produto,detalhe_produto,foto_produto,preco_produto,disponivel_produto) VALUES(?,?,?,?,?)";
        PreparedStatement pstm = null;
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,produto.getNomeProduto());
            pstm.setString(2, produto.getDetalheProduto());
            pstm.setString(3, produto.getFotoProduto());
            pstm.setDouble(4,produto.getPrecoProduto());
            pstm.setInt(5,produto.getDisponivelProduto());
            pstm.executeUpdate();

        }catch (SQLException e){
            System.err.println(e);
        }finally {
            ConnectionBD.closeConnection(conn);
        }
        return produto;
    }
    public Produto updateProduto(Produto produto){
        String sql = "update tbl_produto set nome_produto=?, detalhe_produto=?,foto_produto=?,preco_produto=?,disponivel_produto=? where id_produto = ? ";
        PreparedStatement pstm = null;
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,produto.getNomeProduto());
            pstm.setString(2,produto.getDetalheProduto());
            pstm.setString(3, produto.getFotoProduto());
            pstm.setDouble(4,produto.getPrecoProduto());
            pstm.setInt(5,produto.getDisponivelProduto());
            pstm.setInt(6,produto.getIdProduto());
            pstm.executeUpdate();
        }catch (SQLException e){
            System.err.println(e);
        }finally {
            ConnectionBD.closeConnection(conn);
        }
        return produto;
    }
    public Produto deleteProduto(Produto produto){
        String sql = "delete from tbl_produto where id_produto = ?";
        PreparedStatement pstm = null;
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1,produto.getIdProduto());
            pstm.executeUpdate();

        }catch (SQLException e){
            System.err.println(e);
        }finally {
            ConnectionBD.closeConnection(conn);
        }
        return produto;
    }
    public List<Produto> selectAllProduto(){
        String sql = "select*from tbl_produto";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Produto> allProdutos = new ArrayList<>();
        try{
            pstm = conn.prepareCall(sql);
            rs = pstm.executeQuery();
            while (rs.next()){
                Produto produto = new Produto();
                produto.setIdProduto(rs.getInt("id_produto"));
                produto.setNomeProduto(rs.getString("nome_produto"));
                produto.setDetalheProduto(rs.getString("detalhe_produto"));
                produto.setFotoProduto(rs.getString("foto_produto"));
                produto.setPrecoProduto(rs.getDouble("preco_produto"));
                produto.setDisponivelProduto(rs.getInt("disponivel_produto"));
                allProdutos.add(produto);
            }

        }catch (SQLException e){
            System.err.println(e);
        }finally {
            ConnectionBD.closeConnection(conn);
        }
        return allProdutos;
    }
}
