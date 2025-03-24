package com.nlduy0310.chat_app_backend.config;

public class ValidationProperties {
    // TODO refactor
    public static final String EMAIL_REGEX = "^[a-zA-Z0-9.!#$%&'*+\\/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";

    public static final String CONTAIN_UPPERCASE_REGEX = "^(?=.*[A-Z])$";
    public static final String CONTAIN_LOWERCASE_REGEX = "^(?=.*[a-z])$";
    public static final String CONTAIN_DIGIT_REGEX = "^(?=.*[0-9])$";
    public static final String PASSWORD_CHARACTERS_REGEX = "^[A-Za-z\\d!@#+\\-_=.,]+$";

    public static final String FULL_NAME_CHARACTERS_REGEX = "^[a-zA-Z ]+$";

}
