/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iatest;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cryst
 */
public class DataTest {
    private List <Rgb> lista = new ArrayList<Rgb>();
    
    public DataTest(){
        
    }
    public void addData(Rgb rgb){
        lista.add(rgb);
    }
    public List<Rgb> getList(){
        return lista;
    }
}
