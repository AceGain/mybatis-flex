package com.mybatisflex.annotation;

public enum LogicType {

    /**
     * >
     */
    GT(" > "),

    /**
     * >=
     */
    GE(" >= "),

    /**
     * <
     */
    LT(" < "),

    /**
     * <=
     */
    LE(" <= "),

    /**
     * like %value%
     */
    LIKE(" LIKE "),

    /**
     * like value%
     */
    LIKE_LEFT(" LIKE "),

    /**
     * like %value
     */
    LIKE_RIGHT(" LIKE "),

    /**
     * not like %value%
     */
    NOT_LIKE(" NOT LIKE "),

    /**
     * not like value%
     */
    NOT_LIKE_LEFT(" NOT LIKE "),

    /**
     * not like %value
     */
    NOT_LIKE_RIGHT(" NOT LIKE "),

    /**
     * =
     */
    EQUALS(" = "),

    /**
     * !=
     */
    NOT_EQUALS(" != "),

    /**
     * is null
     */
    IS_NULL(" IS NULL "),

    /**
     * is not null
     */
    IS_NOT_NULL(" IS NOT NULL ");

    private final String value;

    LogicType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
