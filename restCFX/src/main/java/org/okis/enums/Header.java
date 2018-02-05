package org.okis.enums;

/**
 *
 * @author E020682
 */
public enum Header {

    ABSOLUTE_ASK("Double"),
    ABSOLUTE_BID("Double"),
    ABSOLUTE_MID("Double"),
    ACCRETING("Double"),
    ALPHA("Integer"),
    ASK("Double"),
    ASK_CAP("Double"),
    ASK_CONVEXITY_SPREAD("Double"),
    ASK_CPI("Double"),
    ASK_CPI_RATE("Double"),
    ASK_CURVE_SPREAD("Double"),
    ASK_DISCOUNT("Double"),
    ASK_DISCOUNT_BASIS_SPREAD("Double"),
    ASK_FLOOR("Double"),
    ASK_MARKET_QUOTE("Double"),
    ASK_RECOVERY_RATE("Double"),
    ASK_SPREAD("Double"),
    ASK_ZERO_COUPON("Double"),
    ASK_ZERO_COUPON_BASIS_SPREAD("Double"),
    ASK_ZERO_COUPON_SPREAD("Double"),
    ASK1("Double"), 
    BETA("Integer"),
    BID("Double"),
    BID_CAP("Double"),
    BID_CONVEXITY_SPREAD("Double"),
    BID_CPI("Double"),
    BID_CPI_RATE("Double"),
    BID_CURVE_SPREAD("Double"),
    BID_DISCOUNT("Double"),
    BID_DISCOUNT_BASIS_SPREAD("Double"),
    BID_FLOOR("Double"),
    BID_MARKET_QUOTE("Double"),
    BID_RECOVERY_RATE("Double"),
    BID_SPREAD("Double"),
    BID_ZERO_COUPON("Double"),
    BID_ZERO_COUPON_BASIS_SPREAD("Double"),
    BID_ZERO_COUPON_SPREAD("Double"),
    BID1("Double"),
    BULLET("Double"),
    CALL_ASK("Double"),
    CALL_BID("Double"),
    CATEGORY("String"),
    CLO("Double"), 
    CONTRIBUTOR("String"), 
    CREDIT_CLAUSE("String"),
    CURRENCY("String"),
    CURVE_LABEL("String"),
    DATA("Double"),
    DATE("DateTime"),
    DATE_END("DateTime"),
    DATE_INIT("DateTime"),
    DRIVING_PARAMETER("String"),
    EV_PRICE_ASK("Double"),
    EV_PRICE_BID("Double"),
    EV_PRICE_MID("Double"),
    EV_SPREAD_ASK("Double"),
    EV_SPREAD_BID("Double"),
    EV_SPREAD_MID("Double"),
    EVAL_CRITERIA("String"),
    EVAL_MODE("String"),
    FINAL_MATURITY_DATE("DateTime"),
    FIRST_INSTRUMENT("String"),
    FIXED_COUPON_ASK("Double"),
    FIXED_COUPON_BID("Double"),
    FIXED_COUPON_MID("Double"),
    FIXLAG("String"),
    FORM_FACTOR("Double"),
    FRONTIER_DATE("Integer"),
    FX_ALPHA("Double"),
    FX_BETA("Double"),
    FX_REF_SPOT("Double"),
    FX_VOL_SPREAD("Integer"),
    FXRR_ASK("Double"),
    FXRR_BID("Double"),
    FXSTR_ASK("Double"),
    FXSTR_BID("Double"),
    GENERATOR("String"),
    GMP_GROUP("String"),
    HIGH("Double"),
    INDEX("String"),
    INITIAL_MATURITY_DATE("DateTime"),
    INSTRUMENT("String"),
    INSTRUMENT_NAME1("String"),
    INSTRUMENT_NAME2("String"),
    INTERVAL_SPLINE_ETA("Double"),
    ISSUER("String"),
    LABEL("String"),
    LOW("Double"),
    LST("Double"), 
    MAIN_LABEL("String"), 
    MAIN_LABEL2("String"), 
    MARKET("String"),
    MARKET_INSTRUMENT("String"),
    MATURITY("String"),
    MAX("Double"),
    MID("Double"),
    MID_CONVEXITY_SPREAD("Double"),
    MID_CPI("Double"),
    MID_CPI_RATE("Double"),
    MID_CURVE_SPREAD("Double"),
    MID_DISCOUNT("Double"),
    MID_DISCOUNT_BASIS_SPREAD("Double"),
    MID_MARKET_QUOTE("Double"),
    MID_RECOVERY_RATE("Double"),
    MID_ZERO_COUPON("Double"),
    MID_ZERO_COUPON_BASIS_SPREAD("Double"),
    MID_ZERO_COUPON_SPREAD("Double"),
    MIN("Double"),
    NATURE("String"),
    OPTION_MAT("String"),
    ORDINATE("Double"),
    PAIR("String"),
    PAYOFF("String"),
    PILLAR("String"),
    PUT_ASK("Double"),
    PUT_BID("Double"),
    QUOTATION("String"),
    REF_CUT_OFF("Double"),
    REF_FORWARD("String"),
    SABR_PARAM("String"),
    SECOND_LABEL("String"), 
    SECOND_LABEL2("String"), 
    SECURITY_ID("String"),
    SELECTED("Integer"),
    SENIORITY("String"),
    SIGNED("Boolean"),
    SLN_SHIFT("Double"),
    SMOOTH_DEPO("Boolean"),
    SNAPSHOT("String"),
    SPREAD("Double"),
    SPREAD_ASK("Double"),
    SPREAD_BID("Double"),
    SPREAD_MID("Double"),
    STD_ASK("Double"),
    STD_BID("Double"),
    SUB_TYPE("String"),
    SURVIVAL_PROB("Double"),
    SWAP_TEMPLATE("String"),
    SWAP_TENOR("String"),
    TEMPLATE("String"), 
    TENOR("String"),
    TENOR_SWAP("String"),
    TIMESTAMP("TimeStamp"),
    TYPE("String"),
    TYPE2("String"), 
    TYPOLOGY("String"),
    UPFRONT_PAYMENT_ASK("Double"),
    UPFRONT_PAYMENT_BID("Double"),
    UPFRONT_PAYMENT_MID("Double"),
    USER("String"),
    WEIGHT("Integer"),        
    BBG_TICKER("String"), 
    INSTRUMENT_CREDIT("String");

    private final String type;

    private Header(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
}