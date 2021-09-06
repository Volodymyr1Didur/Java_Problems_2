package com.company.controller;

/**
 * Created by student on 26.09.2017.
 */
public interface RegexContainer {

    String REGEX_NAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    String REGEX_LOGIN = "^[A-Za-z0-9_-]{8,20}$";
    String REGEX_SECOND_NAME = "/^[a-z ,.'-]+$/i";
    String REGEX_FATHERS_NAME ="/^[a-z ,.'-]+$/i";
    String REGEX_HOME_NUMBER = "^[0-9\\-\\+]{9,15}$";
    String REGEX_PHONE_NUMBER = "^[0-9\\-\\+]{9,15}$";
    String REGEX_SECOND_PHONE_NUMBER="";
    String REGEX_EMAIL="(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
    String REGEX_SKYPE_NAME="[a-zA-Z][a-zA-Z0-9_\\-\\,\\.]{5,31}";
    String REGEX_INDEX="[0-9]{6,20}";
    String REGEX_CITY="^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$";
    String REGEX_STREET="[\\\\d]+[A-Za-z0-9\\\\s,\\\\.]+";
    String REGEX_HOUSE_NUMBER="(?!0)\\d[0-3]{0,2}[a-zA-Z]?\\/(?!0)\\d[0-9]{0,1}";
    String REGEX_FLAT_NUMBER="[0-9]{1,4}[A-Z]{0,5}";
}
