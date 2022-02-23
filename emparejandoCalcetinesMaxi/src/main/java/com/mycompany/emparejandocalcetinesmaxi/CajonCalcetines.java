package com.mycompany.emparejandocalcetinesmaxi;

import java.util.ArrayList;

public class CajonCalcetines {

    Calcetin[] listaCalcetines;

    public CajonCalcetines(Calcetin[] listaCalcetines) {
        this.listaCalcetines = listaCalcetines;
    }

    public Calcetin[] getListaCalcetines() {
        return listaCalcetines;
    }

    public void setListaCalcetines(Calcetin[] listaCalcetines) {
        this.listaCalcetines = listaCalcetines;
    }

    @Override
    public String toString() {
        return "CajonCalcetines{" + "listaCalcetines=" + listaCalcetines + '}';
    }

    public Calcetin[] siEmparejados() {
        ArrayList<Calcetin> c = new ArrayList<>();
        for (int i = 0; i < c.size(); i++) {
            c.add(this.listaCalcetines[i]);
        }
        for (int i = 0; i < c.size(); i++) {
            
        }
        return ;
//        Calcetin[] c = new Calcetin[this.listaCalcetines.length];
//        int contador = 0;
//        int contador3 = 0;
//        for (int i = 0; i < c.length; i++) {
//            c[i] = this.listaCalcetines[i];
//        }
//
//        for (int i = 0; i < c.length; i++) {
//            if ((contador % 2) == 0 && contador != 0) {
//                c[i] = null;
//            }
//            contador = 0;
//            for (int j = 0; j < c.length; j++) {
//                if (c[i].equals(this.listaCalcetines[j])) {
//                    contador++;
//                }
//            }
//        }
//        for (int e = 0; e < c.length; e++) {
//            contador3++;
//            if (c[e] != null) {
//                Calcetin[] desparejados = new Calcetin[c.length];
//                int contador2 = 0;
//                for (int i = 0; i < c.length; i++) {
//                    if (c[i] != null) {
//                        desparejados[contador2] = c[i];
//                        contador2++;
//                    }
//                }
//                Calcetin[] desparejadosbien = new Calcetin[contador2 + 1];
//                for (int i = 0; i < 10; i++) {
//                    desparejadosbien[i] = desparejados[i];
//                }
//                return desparejadosbien;
//            }
//            if(contador3==c.length){
//                System.out.println("todos tienen su pareja");
//            }
//        }
//        Calcetin[] ninguno = new Calcetin[0];
//        return ninguno;
    }

}
