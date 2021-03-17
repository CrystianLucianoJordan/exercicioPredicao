/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iatest;

import java.util.ArrayList;
import java.util.List;
import javafx.collections.transformation.FilteredList;

/**
 *
 * @author cryst
 */
public class ex1 {

    DataSource source; 
    DataTest teste; 
    Utils util = new Utils();
    int k;

    public void setBase() {
        System.out.println("===============Exercicio 1================");
        source = new DataSource();
        teste = new DataTest();
        source.addData(new Rgb(1, 10, 200, 1));
        source.addData(new Rgb(2, 20, 230, 1));
        source.addData(new Rgb(6, 25, 150, 1));
        source.addData(new Rgb(7, 45, 100, 1));
        source.addData(new Rgb(10, 50, 125, 1));
        source.addData(new Rgb(3, 24, 111, 1));
        source.addData(new Rgb(100, 4, 10, 2));
        source.addData(new Rgb(250, 7, 50, 2));
        source.addData(new Rgb(243, 5, 68, 2));
        source.addData(new Rgb(210, 2, 90, 2));
        source.addData(new Rgb(200, 1, 95, 2));
        source.addData(new Rgb(215, 0, 68, 2));
        source.addData(new Rgb(56, 200, 1, 3));
        source.addData(new Rgb(79, 234, 3, 3));
        source.addData(new Rgb(80, 210, 8, 3));
        source.addData(new Rgb(95, 200, 10, 3));
        source.addData(new Rgb(80, 210, 4, 3));
        source.addData(new Rgb(49, 207, 1, 3));

        teste.addData(new Rgb(1, 2, 100));
        teste.addData(new Rgb(10, 20, 30));
        teste.addData(new Rgb(8, 5, 20));
        teste.addData(new Rgb(237, 45, 100));
        teste.addData(new Rgb(1, 50, 101));
        teste.addData(new Rgb(67, 121, 12));
    }

    public void k3() {
        setBase();
        k = 3;
        System.out.println("K = 3");
        for (Rgb rgbTest : teste.getList()) {
            for (Rgb rgbSource : source.getList()) {
                rgbSource.setDistancia(util.getDistance(rgbSource, rgbTest));

            }

            predict(source.getList(), rgbTest, k);
        }
        k5();
    }
     public void k5() {
      
        k = 5;
        System.out.println("K = 5");
        for (Rgb rgbTest : teste.getList()) {
            for (Rgb rgbSource : source.getList()) {
                rgbSource.setDistancia(util.getDistance(rgbSource, rgbTest));

            }

            predict(source.getList(), rgbTest, k);
        }
        k7();
    }
        public void k7() {
      
        k = 7;
        System.out.println("K = 7");
        for (Rgb rgbTest : teste.getList()) {
            for (Rgb rgbSource : source.getList()) {
                rgbSource.setDistancia(util.getDistance(rgbSource, rgbTest));

            }

            predict(source.getList(), rgbTest, k);
        }
    }

    public void predict(List<Rgb> lista, Rgb teste, int k) {
        List<Rgb> filtredList = new ArrayList<Rgb>();
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        lista.sort((a, b) -> (a.getDistancia() < b.getDistancia() ? -1 : 1));
        for (int i = 0; i < k; i++) {
            filtredList.add(lista.get(i));
        }
        
        for(Rgb rgb : filtredList){
            switch(rgb.getClasse()){
                case 1:
                    num1++;
                    break;
                case 2:
                    num2++;
                    break;
                case 3:
                    num3++;
                    break;
            }
        }
        
            if(num1 > num2 && num1 > num3)
        {
           teste.setClasse(1);
        }
        else if(num2 > num3)
        {
              teste.setClasse(2);
        }
        else
        {
              teste.setClasse(3);
        }
            
            System.out.println("R: "+ teste.getR()+"/ G: "+teste.getG()+"/ B: "+teste.getB()+"/ Calsse: "+teste.getClasse()+"\n");
filtredList.clear();
    }

}
