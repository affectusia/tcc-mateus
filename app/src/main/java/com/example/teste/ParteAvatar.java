package com.example.teste;

import java.util.ArrayList;
import java.util.List;

public class ParteAvatar {
    private final int icone;
    private final int imagem;
    private final String nome;

    public ParteAvatar(int icone, int imagem, String nome) {
        this.icone = icone;
        this.imagem = imagem;
        this.nome = nome;
    }

    public int getIcone(){
        return this.icone;
    }

    public int getImagem(){
        return this.imagem;
    }

    //Métodos dos Avatares
    public static List<ParteAvatar> getAvatarIcones (){
        List<ParteAvatar> lstData = new ArrayList<>(  );
        lstData.add( new ParteAvatar(R.drawable.icone_cabeca_1, R.drawable.cabeca_1, "avatar1"));
        lstData.add( new ParteAvatar(R.drawable.icone_cabeca_2, R.drawable.cabeca_2,"avatar2"));
        lstData.add( new ParteAvatar(R.drawable.icone_cabeca_3, R.drawable.cabeca_3,"avatar3"));
        return lstData;
    }

    //Métodos das Bocas
    public static List<ParteAvatar> getBocaIcones () {
        List<ParteAvatar> lstData = new ArrayList<>(  );
        lstData.add(new ParteAvatar(R.drawable.icone_boca_1, R.drawable.boca_1, "boca1"));
        lstData.add(new ParteAvatar(R.drawable.icone_boca_2, R.drawable.boca_2, "boca2"));
        lstData.add(new ParteAvatar(R.drawable.icone_boca_3, R.drawable.boca_3,"boca3"));
        lstData.add(new ParteAvatar(R.drawable.icone_boca_4, R.drawable.boca_4,"boca4"));
        lstData.add(new ParteAvatar(R.drawable.icone_boca_5, R.drawable.boca_5,"boca5"));
        lstData.add(new ParteAvatar(R.drawable.icone_boca_6, R.drawable.boca_6,"boca6"));
        return lstData;
    }

    //Métodos dos cabelos Principais
    public static List<ParteAvatar> getCabeloPIcones () {
        List<ParteAvatar> lstData = new ArrayList<>(  );
        lstData.add( new ParteAvatar(R.drawable.icone_cabelo_1_marrom, R.drawable.cabelo_1_marrom, "cabelo1"));
        lstData.add( new ParteAvatar(R.drawable.icone_cabelo_2_marrom, R.drawable.cabelo_2_marrom, "cabelo2"));
        lstData.add( new ParteAvatar(R.drawable.icone_cabelo_3_marrom, R.drawable.cabelo_3_marrom, "cabelo3"));
        lstData.add( new ParteAvatar(R.drawable.icone_cabelo_4_marrom, R.drawable.cabelo_4_marrom, "cabelo4"));
        lstData.add( new ParteAvatar(R.drawable.icone_cabelo_5_marrom, R.drawable.cabelo_5_marrom, "cabelo5"));
        return lstData;
    }

    //Métodos dos cabelos 1
    public static List<ParteAvatar> getCabelo1Icones () {
        List<ParteAvatar> lstData = new ArrayList<>(  );
        lstData.add( new ParteAvatar(R.drawable.icone_cabelo_1_marrom, R.drawable.cabelo_1_marrom, "cabelo1"));
        lstData.add( new ParteAvatar(R.drawable.icone_cabelo_1_amarelo, R.drawable.cabelo_1_amarelo, "cabelo2"));
        lstData.add( new ParteAvatar(R.drawable.icone_cabelo_1_laranja, R.drawable.cabelo_1_laranja, "cabelo3"));
        lstData.add( new ParteAvatar(R.drawable.icone_cabelo_1_preto, R.drawable.cabelo_1_preto, "cabelo4"));
        return lstData;
    }

    //Métodos dos cabelos 2
    public static List<ParteAvatar> getCabelo2Icones () {
        List<ParteAvatar> lstData = new ArrayList<>(  );
        lstData.add( new ParteAvatar(R.drawable.icone_cabelo_2_marrom, R.drawable.cabelo_2_marrom, "cabelo1"));
        lstData.add( new ParteAvatar(R.drawable.icone_cabelo_2_amarelo, R.drawable.cabelo_2_amarelo, "cabelo2"));
        lstData.add( new ParteAvatar(R.drawable.icone_cabelo_2_laranja, R.drawable.cabelo_2_laranja, "cabelo3"));
        lstData.add( new ParteAvatar(R.drawable.icone_cabelo_2_preto, R.drawable.cabelo_2_preto, "cabelo4"));
        return lstData;
    }

    //Métodos dos cabelos 3
    public static List<ParteAvatar> getCabelo3Icones () {
        List<ParteAvatar> lstData = new ArrayList<>(  );
        lstData.add( new ParteAvatar(R.drawable.icone_cabelo_3_marrom, R.drawable.cabelo_3_marrom, "cabelo1"));
        lstData.add( new ParteAvatar(R.drawable.icone_cabelo_3_amarelo, R.drawable.cabelo_3_amarelo, "cabelo2"));
        lstData.add( new ParteAvatar(R.drawable.icone_cabelo_3_laranja, R.drawable.cabelo_3_laranja, "cabelo3"));
        lstData.add( new ParteAvatar(R.drawable.icone_cabelo_3_preto, R.drawable.cabelo_3_preto, "cabelo4"));
        return lstData;
    }

    //Métodos dos cabelos 4
    public static List<ParteAvatar> getCabelo4Icones () {
        List<ParteAvatar> lstData = new ArrayList<>(  );
        lstData.add( new ParteAvatar(R.drawable.icone_cabelo_4_marrom, R.drawable.cabelo_4_marrom, "cabelo1"));
        lstData.add( new ParteAvatar(R.drawable.icone_cabelo_4_amarelo, R.drawable.cabelo_4_amarelo, "cabelo2"));
        lstData.add( new ParteAvatar(R.drawable.icone_cabelo_4_laranja, R.drawable.cabelo_4_laranja, "cabelo3"));
        lstData.add( new ParteAvatar(R.drawable.icone_cabelo_4_preto, R.drawable.cabelo_4_preto, "cabelo4"));
        return lstData;
    }

    //Métodos dos cabelos 5
    public static List<ParteAvatar> getCabelo5Icones () {
        List<ParteAvatar> lstData = new ArrayList<>(  );
        lstData.add( new ParteAvatar(R.drawable.icone_cabelo_5_marrom, R.drawable.cabelo_5_marrom, "cabelo1"));
        lstData.add( new ParteAvatar(R.drawable.icone_cabelo_5_amarelo, R.drawable.cabelo_5_amarelo, "cabelo2"));
        lstData.add( new ParteAvatar(R.drawable.icone_cabelo_5_laranja, R.drawable.cabelo_5_laranja, "cabelo3"));
        lstData.add( new ParteAvatar(R.drawable.icone_cabelo_5_preto, R.drawable.cabelo_5_preto, "cabelo4"));
        return lstData;
    }

    //Métodos dos Narizes
    public static List<ParteAvatar> getNarizPIcones () {
        List<ParteAvatar> lstData = new ArrayList<>(  );
        lstData.add( new ParteAvatar(R.drawable.icone_nariz_1, R.drawable.nariz_1, "nariz1") );
        lstData.add( new ParteAvatar(R.drawable.icone_nariz_2, R.drawable.nariz_2, "nariz2"  ) );
        lstData.add( new ParteAvatar(R.drawable.icone_nariz_3, R.drawable.nariz_3, "nariz3"  ) );
        return lstData;
    }

    //Método dos Olhos Principal
    public static List<ParteAvatar> getOlhosPIcones () {
        List<ParteAvatar> lstData = new ArrayList<>(  );
        lstData.add( new ParteAvatar(R.drawable.icone_olhos_1_marrom, R.drawable.olhos_1_marrom, "olho1"));
        lstData.add( new ParteAvatar(R.drawable.icone_olhos_2, R.drawable.olhos_2, "olho2"));
        lstData.add( new ParteAvatar(R.drawable.icone_olhos_3_marrom, R.drawable.olhos_3_marrom, "olho3"));
        lstData.add( new ParteAvatar(R.drawable.icone_olhos_4_marrom, R.drawable.olhos_4_marrom, "olho4"));
        lstData.add( new ParteAvatar(R.drawable.icone_olhos_5_marrom, R.drawable.olhos_5_marrom, "olho5"));
        lstData.add( new ParteAvatar(R.drawable.icone_olhos_6_marrom, R.drawable.olhos_6_marrom, "olho6"));
        return lstData;
    }

    //Método dos Olhos 1
    public static List<ParteAvatar> getOlhos1Icones () {  //A Icones
        List<ParteAvatar> lstData = new ArrayList<>(  );
        lstData.add( new ParteAvatar(R.drawable.icone_olhos_1_marrom, R.drawable.olhos_1_marrom, "olho1"));
        lstData.add( new ParteAvatar(R.drawable.icone_olhos_1_azul, R.drawable.olhos_1_azul, "olho2"));
        lstData.add( new ParteAvatar(R.drawable.icone_olhos_1_verde, R.drawable.olhos_1_verde, "olho3"));
        return lstData;
    }

    //Olhos 2 não possue método pois é apenas uma opção

    //Método dos Olhos 3
    public static List<ParteAvatar> getOlhos3Icones () {   //M Icones
        List<ParteAvatar> lstData = new ArrayList<>(  );
        lstData.add( new ParteAvatar(R.drawable.icone_olhos_3_marrom, R.drawable.olhos_3_marrom, "olho1"));
        lstData.add( new ParteAvatar(R.drawable.icone_olhos_3_azul, R.drawable.olhos_3_azul, "olho2"));
        lstData.add( new ParteAvatar(R.drawable.icone_olhos_3_verde, R.drawable.olhos_3_verde, "olho3"));
        return lstData;
    }

    //Método dos Olhos 4
    public static List<ParteAvatar> getOlhos4Icones () {     //N Icones
        List<ParteAvatar> lstData = new ArrayList<>(  );
        lstData.add( new ParteAvatar(R.drawable.icone_olhos_4_marrom, R.drawable.olhos_4_marrom, "olho1"));
        lstData.add( new ParteAvatar(R.drawable.icone_olhos_4_azul, R.drawable.olhos_4_azul, "olho2"));
        lstData.add( new ParteAvatar(R.drawable.icone_olhos_4_verde, R.drawable.olhos_4_verde, "olho3"));
        return lstData;
    }

    //Método dos Olhos 5
    public static List<ParteAvatar> getOlhos5Icones () {     //R Icones
        List<ParteAvatar> lstData = new ArrayList<>(  );
        lstData.add( new ParteAvatar(R.drawable.icone_olhos_5_marrom, R.drawable.olhos_5_marrom, "olho1"));
        lstData.add( new ParteAvatar(R.drawable.icone_olhos_5_azul, R.drawable.olhos_5_azul, "olho2"));
        lstData.add( new ParteAvatar(R.drawable.icone_olhos_5_verde, R.drawable.olhos_5_verde, "olho3"));
        return lstData;
    }

    //Método dos Olhos 6
    public static List<ParteAvatar> getOlhos6Icones () {     //S Icones
        List<ParteAvatar> lstData = new ArrayList<>(  );
        lstData.add( new ParteAvatar(R.drawable.icone_olhos_6_marrom, R.drawable.olhos_6_marrom, "olho1"));
        lstData.add( new ParteAvatar(R.drawable.icone_olhos_6_azul, R.drawable.olhos_6_azul, "olho2"));
        lstData.add( new ParteAvatar(R.drawable.icone_olhos_6_verde, R.drawable.olhos_6_verde, "olho3"));
        return lstData;
    }

}
