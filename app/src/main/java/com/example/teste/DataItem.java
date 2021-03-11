package com.example.teste;

import java.util.ArrayList;
import java.util.List;

public class DataItem {
    int resIdThumbnail;
    String nome;

    public DataItem(int resIdThumbnail, String nome) {
        this.resIdThumbnail = resIdThumbnail;
        this.nome = nome;
    }

    //Métodos dos Acatares
    public static List<DataItem> getAvatar (){
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add( new DataItem(R.drawable.cabeca_1, "avatar1"));
        lstData.add( new DataItem(R.drawable.cabeca_2, "avatar2"));
        lstData.add( new DataItem(R.drawable.cabeca_3, "avatar3"));
        return lstData;
    }

    public static List<DataItem> getAvatarIcones (){
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add( new DataItem(R.drawable.icone_cabeca_1, "avatar1"));
        lstData.add( new DataItem(R.drawable.icone_cabeca_2, "avatar2"));
        lstData.add( new DataItem(R.drawable.icone_cabeca_3, "avatar3"));
        return lstData;
    }

    //Métodos das Bocas
    public static List<DataItem> getBoca () {
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add(new DataItem(R.drawable.boca_1, "boca1"));
        lstData.add(new DataItem(R.drawable.boca_2, "boca2"));
        lstData.add(new DataItem(R.drawable.boca_3, "boca3"));
        lstData.add(new DataItem(R.drawable.boca_4, "boca4"));
        lstData.add(new DataItem(R.drawable.boca_5, "boca5"));
        lstData.add(new DataItem(R.drawable.boca_6, "boca6"));
        return lstData;
    }

    public static List<DataItem> getBocaIcones () {
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add(new DataItem(R.drawable.icone_boca_1, "boca1"));
        lstData.add(new DataItem(R.drawable.icone_boca_2, "boca2"));
        lstData.add(new DataItem(R.drawable.icone_boca_3, "boca3"));
        lstData.add(new DataItem(R.drawable.icone_boca_4, "boca4"));
        lstData.add(new DataItem(R.drawable.icone_boca_5, "boca5"));
        lstData.add(new DataItem(R.drawable.icone_boca_6, "boca6"));
        return lstData;
    }

    //Métodos dos cabelos Principais
    public static List<DataItem> getCabeloP () {
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add( new DataItem(R.drawable.cabelo_1_marrom, "cabelo1"));
        lstData.add( new DataItem(R.drawable.cabelo_2_marrom, "cabelo2"));
        lstData.add( new DataItem(R.drawable.cabelo_3_marrom, "cabelo3"));
        lstData.add( new DataItem(R.drawable.cabelo_4_marrom, "cabelo4"));
        lstData.add( new DataItem(R.drawable.cabelo_5_marrom, "cabelo5"));
        return lstData;
    }

    public static List<DataItem> getCabeloPIcones () {
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add( new DataItem(R.drawable.icone_cabelo_1_marrom, "cabelo1"));
        lstData.add( new DataItem(R.drawable.icone_cabelo_2_marrom, "cabelo2"));
        lstData.add( new DataItem(R.drawable.icone_cabelo_3_marrom, "cabelo3"));
        lstData.add( new DataItem(R.drawable.icone_cabelo_4_marrom, "cabelo4"));
        lstData.add( new DataItem(R.drawable.icone_cabelo_5_marrom, "cabelo5"));
        return lstData;
    }

    //Métodos dos cabelos 1
    public static List<DataItem> getCabelo1 () {
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add( new DataItem(R.drawable.cabelo_1_marrom, "cabelo1"));
        lstData.add( new DataItem(R.drawable.cabelo_1_amarelo, "cabelo2"));
        lstData.add( new DataItem(R.drawable.cabelo_1_laranja, "cabelo3"));
        lstData.add( new DataItem(R.drawable.cabelo_1_preto, "cabelo4"));
        return lstData;
    }

    public static List<DataItem> getCabelo1Icones () {
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add( new DataItem(R.drawable.icone_cabelo_1_marrom, "cabelo1"));
        lstData.add( new DataItem(R.drawable.icone_cabelo_1_amarelo, "cabelo2"));
        lstData.add( new DataItem(R.drawable.icone_cabelo_1_laranja, "cabelo3"));
        lstData.add( new DataItem(R.drawable.icone_cabelo_1_preto, "cabelo4"));
        return lstData;
    }


    //Métodos dos cabelos 2
    public static List<DataItem> getCabelo2 () {
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add( new DataItem(R.drawable.cabelo_2_marrom, "cabelo1"));
        lstData.add( new DataItem(R.drawable.cabelo_2_amarelo, "cabelo2"));
        lstData.add( new DataItem(R.drawable.cabelo_2_laranja, "cabelo3"));
        lstData.add( new DataItem(R.drawable.cabelo_2_preto, "cabelo4"));
        return lstData;
    }

    public static List<DataItem> getCabelo2Icones () {
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add( new DataItem(R.drawable.icone_cabelo_2_marrom, "cabelo1"));
        lstData.add( new DataItem(R.drawable.icone_cabelo_2_amarelo, "cabelo2"));
        lstData.add( new DataItem(R.drawable.icone_cabelo_2_laranja, "cabelo3"));
        lstData.add( new DataItem(R.drawable.icone_cabelo_2_preto, "cabelo4"));
        return lstData;
    }

    //Métodos dos cabelos 3
    public static List<DataItem> getCabelo3 () {
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add( new DataItem(R.drawable.cabelo_3_marrom, "cabelo1"));
        lstData.add( new DataItem(R.drawable.cabelo_3_amarelo, "cabelo2"));
        lstData.add( new DataItem(R.drawable.cabelo_3_laranja, "cabelo3"));
        lstData.add( new DataItem(R.drawable.cabelo_3_preto, "cabelo4"));
        return lstData;
    }

    public static List<DataItem> getCabelo3Icones () {
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add( new DataItem(R.drawable.icone_cabelo_3_marrom, "cabelo1"));
        lstData.add( new DataItem(R.drawable.icone_cabelo_3_amarelo, "cabelo2"));
        lstData.add( new DataItem(R.drawable.icone_cabelo_3_laranja, "cabelo3"));
        lstData.add( new DataItem(R.drawable.icone_cabelo_3_preto, "cabelo4"));
        return lstData;
    }


    //Métodos dos cabelos 4
    public static List<DataItem> getCabelo4 () {
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add( new DataItem(R.drawable.cabelo_4_marrom, "cabelo1"));
        lstData.add( new DataItem(R.drawable.cabelo_4_amarelo, "cabelo2"));
        lstData.add( new DataItem(R.drawable.cabelo_4_laranja, "cabelo3"));
        lstData.add( new DataItem(R.drawable.cabelo_4_preto, "cabelo4"));
        return lstData;
    }

    public static List<DataItem> getCabelo4Icones () {
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add( new DataItem(R.drawable.icone_cabelo_4_marrom, "cabelo1"));
        lstData.add( new DataItem(R.drawable.icone_cabelo_4_amarelo, "cabelo2"));
        lstData.add( new DataItem(R.drawable.icone_cabelo_4_laranja, "cabelo3"));
        lstData.add( new DataItem(R.drawable.icone_cabelo_4_preto, "cabelo4"));
        return lstData;
    }

    //Métodos dos cabelos 5
    public static List<DataItem> getCabelo5 () {
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add( new DataItem(R.drawable.cabelo_5_marrom, "cabelo1"));
        lstData.add( new DataItem(R.drawable.cabelo_5_amarelo, "cabelo2"));
        lstData.add( new DataItem(R.drawable.cabelo_5_laranja, "cabelo3"));
        lstData.add( new DataItem(R.drawable.cabelo_5_preto, "cabelo4"));
        return lstData;
    }

    public static List<DataItem> getCabelo5Icones () {
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add( new DataItem(R.drawable.icone_cabelo_5_marrom, "cabelo1"));
        lstData.add( new DataItem(R.drawable.icone_cabelo_5_amarelo, "cabelo2"));
        lstData.add( new DataItem(R.drawable.icone_cabelo_5_laranja, "cabelo3"));
        lstData.add( new DataItem(R.drawable.icone_cabelo_5_preto, "cabelo4"));
        return lstData;
    }

    //Métodos dos Narizes
    public static List<DataItem> getNarizP () {
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add( new DataItem(R.drawable.nariz_1, "nariz1") );
        lstData.add( new DataItem(R.drawable.nariz_2, "nariz2"  ) );
        lstData.add( new DataItem(R.drawable.nariz_3, "nariz3"  ) );
        return lstData;
    }

    public static List<DataItem> getNarizPIcones () {
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add( new DataItem(R.drawable.icone_nariz_1, "nariz1") );
        lstData.add( new DataItem(R.drawable.icone_nariz_2, "nariz2"  ) );
        lstData.add( new DataItem(R.drawable.icone_nariz_3, "nariz3"  ) );
        return lstData;
    }


    //Método dos Olhos Principal
    public static List<DataItem> getOlhosP () {
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add( new DataItem(R.drawable.olhos_1_marrom, "olho1"));
        lstData.add( new DataItem(R.drawable.olhos_2, "olho2"));
        lstData.add( new DataItem(R.drawable.olhos_3_marrom, "olho3"));
        lstData.add( new DataItem(R.drawable.olhos_4_marrom, "olho4"));
        lstData.add( new DataItem(R.drawable.olhos_5_marrom, "olho5"));
        lstData.add( new DataItem(R.drawable.olhos_6_marrom, "olho6"));
        return lstData;
    }

    public static List<DataItem> getOlhosPIcones () {
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add( new DataItem(R.drawable.icone_olhos_1_marrom, "olho1"));
        lstData.add( new DataItem(R.drawable.icone_olhos_2, "olho2"));
        lstData.add( new DataItem(R.drawable.icone_olhos_3_marrom, "olho3"));
        lstData.add( new DataItem(R.drawable.icone_olhos_4_marrom, "olho4"));
        lstData.add( new DataItem(R.drawable.icone_olhos_5_marrom, "olho5"));
        lstData.add( new DataItem(R.drawable.icone_olhos_6_marrom, "olho6"));
        return lstData;
    }


    //Método dos Olhos 1
    public static List<DataItem> getOlhos1 () {  //A
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add( new DataItem(R.drawable.olhos_1_marrom, "olho1"));
        lstData.add( new DataItem(R.drawable.olhos_1_azul, "olho2"));
        lstData.add( new DataItem(R.drawable.olhos_1_verde, "olho3"));
        return lstData;
    }

    public static List<DataItem> getOlhos1Icones () {  //A Icones
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add( new DataItem(R.drawable.icone_olhos_1_marrom, "olho1"));
        lstData.add( new DataItem(R.drawable.icone_olhos_1_azul, "olho2"));
        lstData.add( new DataItem(R.drawable.icone_olhos_1_verde, "olho3"));
        return lstData;
    }

    //Olhos 2 não possue método pois é apenas uma opção


    //Método dos Olhos 3
    public static List<DataItem> getOlhos3 () {     //M
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add( new DataItem(R.drawable.olhos_3_marrom, "olho1"));
        lstData.add( new DataItem(R.drawable.olhos_3_azul, "olho2"));
        lstData.add( new DataItem(R.drawable.olhos_3_verde, "olho3"));
        return lstData;
    }

    public static List<DataItem> getOlhos3Icones () {   //M Icones
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add( new DataItem(R.drawable.icone_olhos_3_marrom, "olho1"));
        lstData.add( new DataItem(R.drawable.icone_olhos_3_azul, "olho2"));
        lstData.add( new DataItem(R.drawable.icone_olhos_3_verde, "olho3"));
        return lstData;
    }

    //Método dos Olhos 4
    public static List<DataItem> getOlhos4 () {     //N
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add( new DataItem(R.drawable.olhos_4_marrom, "olho1"));
        lstData.add( new DataItem(R.drawable.olhos_4_azul, "olho2"));
        lstData.add( new DataItem(R.drawable.olhos_4_verde, "olho3"));
        return lstData;
    }

    public static List<DataItem> getOlhos4Icones () {     //N Icones
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add( new DataItem(R.drawable.icone_olhos_4_marrom, "olho1"));
        lstData.add( new DataItem(R.drawable.icone_olhos_4_azul, "olho2"));
        lstData.add( new DataItem(R.drawable.icone_olhos_4_verde, "olho3"));
        return lstData;
    }

    //Método dos Olhos 5
    public static List<DataItem> getOlhos5 () {     //R
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add( new DataItem(R.drawable.olhos_5_marrom, "olho1"));
        lstData.add( new DataItem(R.drawable.olhos_5_azul, "olho2"));
        lstData.add( new DataItem(R.drawable.olhos_5_verde, "olho3"));
        return lstData;
    }

    public static List<DataItem> getOlhos5Icones () {     //R Icones
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add( new DataItem(R.drawable.icone_olhos_5_marrom, "olho1"));
        lstData.add( new DataItem(R.drawable.icone_olhos_5_azul, "olho2"));
        lstData.add( new DataItem(R.drawable.icone_olhos_5_verde, "olho3"));
        return lstData;
    }

    //Método dos Olhos 6
    public static List<DataItem> getOlhos6 () {     //S
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add( new DataItem(R.drawable.olhos_6_marrom, "olho1"));
        lstData.add( new DataItem(R.drawable.olhos_6_azul, "olho2"));
        lstData.add( new DataItem(R.drawable.olhos_6_verde, "olho3"));
        return lstData;
    }

    public static List<DataItem> getOlhos6Icones () {     //S Icones
        List<DataItem> lstData = new ArrayList<>(  );
        lstData.add( new DataItem(R.drawable.icone_olhos_6_marrom, "olho1"));
        lstData.add( new DataItem(R.drawable.icone_olhos_6_azul, "olho2"));
        lstData.add( new DataItem(R.drawable.icone_olhos_6_verde, "olho3"));
        return lstData;
    }

}
