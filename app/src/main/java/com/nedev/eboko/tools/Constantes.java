package com.nedev.eboko.tools;

public class Constantes {

    public static final String HTTP_HEADER = "http://";

    public static final String IP_ADDRESS = "192.168.43.134:8181";

    //URL WS
    public static final String MES_DEVOIR_URL = HTTP_HEADER+IP_ADDRESS+"/devoir/byEtudiant/{1}";
    public static final String MES_NOTES_URL = HTTP_HEADER+IP_ADDRESS+"/note/byEtudiant/{1}";
}
