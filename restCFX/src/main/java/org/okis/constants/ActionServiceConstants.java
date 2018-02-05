package org.okis.constants;

public class ActionServiceConstants {

	// Action constants
	public static final String ACTION_SERVICE_MUREX_TO_BD = "MUREX_TO_BD";
	public static final String ACTION_SERVICE_LOAD_TO_BD = "LOAD_TO_BD";
	public static final String ACTION_INSERT_SIGNATURES = "INSERT_SIGNATURES";
	public static final String ACTION_RETRIEVE_SIGNATURES = "RETRIEVE_SIGNATURES";
	public static final String ACTION_GEN_IPV_EVENT = "GEN_IPV_EVENT";
	public static final String ACTION_MX_MDCS_SELECT = "MX_MDCS_SELECT";
	public static final String ACTION_MX_MDCS_UPDATE = "MX_MDCS_UPDATE";
	public static final String ACTION_MX_MDRS_SELECT = "MX_MDRS_SELECT";
	public static final String ACTION_GET_BD = "BD_GET";
	public static final String ACTION_SET_BD = "BD_SET";
	public static final String ACTION_SET_BD_OVERWRITE_ATTR = "BD_SET_OVER_ATTR";
	public static final String ACTION_MX_MDRS_UPDATE = "MX_MDRS_UPDATE";
	public static final String ACTION_TRANSLATE = "TRANSLATE";
	public static final String ACTION_CLOSE_IPV = "CLOSE_IPV";
	public static final String ACTION_CLOSE_FO_MADRID = "CLOSE_FO_MADRID";
	public static final String ACTION_SMOOTH_GO = "SMOOTH_GO";
	public static final String ACTION_SET_BD_NO_ATTR = "BD_SET_NO_ATTR";	
	public static final String ACTION_GENERATE_FILE = "GENERATE_FILE";
	public static final String ACTION_CHECK_TODAY_ALL_SIGNED = "CHECK_TODAY_ALL_SIGNED";
	public static final String ACTION_RISK_CENTRAL = "RISK_CENTRAL";
	
		
        // Action services names
	public static final String SERVICE_NAME_TRANSLATION = "TRANSLATION";
	public static final String SERVICE_NAME_GET_SIGNATURES = "GET_SIGNATURES";
	public static final String SERVICE_NAME_SET_SIGNATURES = "SET_SIGNATURES";
	public static final String SERVICE_NAME_GEN_IPV_EVENT = "GEN_IPV_EVENT";
	public static final String SERVICE_NAME_MUREX_MDCS_SELECT = "MUREX_MDCS_SELECT";
	public static final String SERVICE_NAME_MUREX_MDCS_UPDATE = "MUREX_MDCS_UPDATE";
	public static final String SERVICE_NAME_MUREX_MDRS_SELECT = "MUREX_MDRS_SELECT";
	public static final String SERVICE_NAME_MUREX_MDRS_UPDATE = "MUREX_MDRS_UPDATE";
	public static final String SERVICE_NAME_TH_BD_GET = "TH_BD_GET";
	public static final String SERVICE_NAME_TH_BD_SET = "TH_BD_SET";
	public static final String SERVICE_NAME_TH_BD_SET_OVERWRITE_ATTR = "TH_BD_SET_OVERWRITE_ATTR";
	public static final String SERVICE_NAME_RESPONSE_DATA_TO_VO = "RESPONSE_DATA_TO_VO";
	public static final String SERVICE_NAME_CHECK_TODAY_ALL_SIGNED = "CHECK_TODAY_ALL_SIGNED";
	public static final String SERVICE_NAME_MULTI_EXT = "MULTI_EXTRACTION";
	
	private ActionServiceConstants() {
		throw new IllegalAccessError("Constants class");
	}
}