/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Persistencia.ChamadoDAO;
import apresentacao.TelaCadastroTecnico;
import controle.ControleEmpresas;
import controle.ControleTecnicos;
import entidade.Chamado;
import entidade.Empresa;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author 31510671
 */
public class TelaPrincipalTest {
    
    public TelaPrincipalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    @Test
    public void TestaControleTecnicos(){
//        ControleTecnicos c = new ControleTecnicos();
//        c.inserir(1,"ok");
//        c.cadastrarTecnico();
//        c.fecharTelaTecnico();
        Empresa empresa = new Empresa(1234L, "Mackenzie");
        Assert.assertEquals(empresa.getNomeEmpresa(), "Mackenzie");
    }
    
    @Test
    public void TestaControleEmpresas(){
        ControleEmpresas c = new ControleEmpresas();
        c.retorna(1,"oi");
        c.validar(1,"oi");
        c.checar(1,"oi");
        c.inserir(1,"oi");
    }
}
